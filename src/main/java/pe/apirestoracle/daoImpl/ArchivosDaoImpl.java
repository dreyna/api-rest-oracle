package pe.apirestoracle.daoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.apirestoracle.dao.ArchivosDao;
import pe.apirestoracle.entity.Archivos;
@Repository
public class ArchivosDaoImpl implements ArchivosDao{
@Autowired
private JdbcTemplate jdbcTemplate;
	@Override
	public int create(Archivos a) {
		// TODO Auto-generated method stub
		String SQL="insert into archivos (idarchivos, nombre, url, idusuario) values(null,?,?,?)";
		return jdbcTemplate.update(SQL, a.getNombre(),a.getUrl(),a.getIdusuario());
	}

	@Override
	public int update(Archivos a) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Map<String, Object>> read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
