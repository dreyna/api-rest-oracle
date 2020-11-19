package pe.apirestoracle.serviceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.apirestoracle.dao.RolDao;
import pe.apirestoracle.dao.UsuarioDao;
import pe.apirestoracle.entity.Usuario;


@Service
public class UsuarioService implements UserDetailsService{
	
   @Autowired
	private UsuarioDao usuarioDao;
   @Autowired
	private RolDao rolDao;
   
	@Override
	@Transactional(readOnly = true)
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		System.out.println(username);
		Usuario usuario = usuarioDao.validarUsuario(username);
		UserDetails details = new User(usuario.getNomuser(),usuario.getPassword(),rolDao.buscarRolUser(usuario.getIdusuario()));
		return details;
	}

}
