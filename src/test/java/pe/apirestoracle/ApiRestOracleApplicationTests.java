package pe.apirestoracle;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

import pe.apirestoracle.dao.ProductoDao;
@SpringBootTest
class ApiRestOracleApplicationTests {
@Autowired
ProductoDao pdao;
@Autowired
PasswordEncoder passwordEncoder;
@Test
void contextLoads() {
	System.out.println(passwordEncoder.encode("123"));
}		
}
