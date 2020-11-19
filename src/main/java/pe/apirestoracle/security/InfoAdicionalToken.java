package pe.apirestoracle.security;

import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;
import org.springframework.stereotype.Component;

import pe.apirestoracle.dao.UsuarioDao;

@Component
public class InfoAdicionalToken implements TokenEnhancer{
	@Autowired
	private UsuarioDao usuarioDao;
	//@Autowired
	//private OpcionesDao opcionesDao;
	@Override
	public OAuth2AccessToken enhance(OAuth2AccessToken accessToken, OAuth2Authentication authentication) {
		Map<String, Object> info1 = new HashMap<>();
		System.out.println(authentication.getName());
		info1 = usuarioDao.datosUsuario(authentication.getName());		
		((DefaultOAuth2AccessToken) accessToken).setAdditionalInformation(info1);
		
		return accessToken;
	}

}
