package pe.apirestoracle.service;

import java.util.Map;

import pe.apirestoracle.entity.Persona;

public interface PersonaService {
	int create(Persona r);
	int update(Persona r);
	int update(int id);
	int delete(int id);
	Persona read(int id);
	Map<String, Object> readAll();
}
