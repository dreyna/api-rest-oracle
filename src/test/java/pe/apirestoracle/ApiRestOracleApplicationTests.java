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
		r.setId_rol(3);
		r.setNomrol("Administrador1");
		rolDao.convertitMap(rolDao.read(3));
	}
}
