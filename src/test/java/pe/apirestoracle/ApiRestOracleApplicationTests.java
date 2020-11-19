package pe.apirestoracle;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.google.gson.Gson;

import pe.apirestoracle.dao.RolDao;
import pe.apirestoracle.dao.UsuarioDao;
import pe.apirestoracle.entity.Rol;

@SpringBootTest
class ApiRestOracleApplicationTests {
@Autowired
private UsuarioDao uDao;
@Autowired
private RolDao rolDao;
Gson gson = new Gson();
	@Test
	void contextLoads() {
		Rol r = new Rol();
		//System.out.println(uDao.validarUsuario("dreyna"));
		System.out.println(gson.toJson(rolDao.readHola(1)));
	}
}
