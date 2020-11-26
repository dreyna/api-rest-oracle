package pe.apirestoracle.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.apirestoracle.dao.ArchivosDao;
import pe.apirestoracle.entity.Archivos;
import pe.apirestoracle.service.ArchivosService;
@Service
public class ArchivosServiceImpl implements ArchivosService{
@Autowired
private ArchivosDao archivosDao;
	@Override
	public int create(Archivos a) {
		return archivosDao.create(a);
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
