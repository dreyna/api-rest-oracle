package pe.apirestoracle.dao;

import java.util.Map;

import pe.apirestoracle.entity.Rol;

public interface RolDao {
int create(Rol r);
int update(Rol r);
int update(int id);
int delete(int id);
Map<String, Object> read(int id);
Map<String, Object> readAll();
void convertitMap(Map<String, Object> map);
}
