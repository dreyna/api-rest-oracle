package pe.apirestoracle.service;

import java.util.Map;

public interface RolService {
	Map<String, Object> read(int id);
	Map<String, Object> readAll();
}
