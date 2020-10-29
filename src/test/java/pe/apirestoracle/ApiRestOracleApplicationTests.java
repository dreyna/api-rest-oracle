package pe.apirestoracle;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import pe.apirestoracle.dao.RolDao;
import pe.apirestoracle.entity.Rol;

@SpringBootTest
class ApiRestOracleApplicationTests {
@Autowired
private RolDao rolDao;
	@Test
	void contextLoads() {
		Rol r = new Rol();
		r.setId_rol(26);
		r.setNomrol("Hola 2");
		System.out.println(rolDao.delete(26));
	}
}
