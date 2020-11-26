package pe.apirestoracle;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.google.gson.Gson;

import pe.apirestoracle.dao.RolDao;
import pe.apirestoracle.dao.UsuarioDao;
import pe.apirestoracle.entity.Rol;

@SpringBootTest
class ApiRestOracleApplicationTests {

@Autowired
PasswordEncoder passwordEncoder;
@Test
void contextLoads() {
	System.out.println(passwordEncoder.encode("123"));
}		
}
