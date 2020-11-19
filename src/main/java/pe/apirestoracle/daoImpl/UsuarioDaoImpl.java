package pe.apirestoracle.daoImpl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.google.gson.Gson;

import pe.apirestoracle.dao.UsuarioDao;
import pe.apirestoracle.entity.Usuario;
@Repository
public class UsuarioDaoImpl implements UsuarioDao{
	Gson g = new Gson();
@Autowired
private JdbcTemplate jdbcTemplate;
	@Override
	public Usuario validarUsuario(String nomuser) {
		String SQL = "select *from usuarios where username=?";
		Usuario usuario = jdbcTemplate.queryForObject(SQL, new Object[] {nomuser}, new BeanPropertyRowMapper<Usuario>(Usuario.class));
		System.out.println("Prueba: "+g.toJson(usuario));
		return usuario;
	}
	@Override
	public Map<String, Object> datosUsuario(String username) {
		String SQL = "SELECT u.idusuario, r.idrol, p.nombres, u.username FROM personas p " + 
				"INNER JOIN usuarios u ON u.idpersona = p.idpersona " + 
				"INNER JOIN usuarios_roles ur ON u.idusuario = ur.idusuario " + 
				"INNER JOIN roles r ON r.idrol=ur.idrol "+
				"where u.username = ?";
		Map<String, Object> map= jdbcTemplate.queryForMap(SQL, username);
		return map;
	}

}
