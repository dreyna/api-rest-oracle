package pe.apirestoracle.service;

import java.util.Map;

import pe.apirestoracle.entity.Rol;

public interface RolService {
	int create(Rol r);
	int update(Rol r);
	int delete(int id);
	Map<String, Object> read(int id);
	Map<String, Object> readAll();
}
