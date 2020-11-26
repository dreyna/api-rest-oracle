package pe.apirestoracle.service;

import java.util.List;
import java.util.Map;

import pe.apirestoracle.entity.Producto;

public interface ProductoService {
	int create(Producto r);
	int update(Producto r);
	int update(int id);
	int delete(int id);
    Map<String, Object> read(int id);
    List<Map<String, Object>> readAll();
}
