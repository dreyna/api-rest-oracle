package pe.apirestoracle.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.apirestoracle.entity.Rol;
import pe.apirestoracle.service.RolService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/roles")
public class RolController {
@Autowired
private RolService rolService;

@GetMapping("/all")
public Map<String, Object> readAll(){
	return rolService.readAll();
}
@GetMapping("/{id}")
public Map<String, Object> read(@PathVariable int id ) {
	try {
		 return rolService.read(id);
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("error");
		return null;
	}

}
@DeleteMapping("/delete/{id}")
public int delete(@PathVariable int id ) {
	return rolService.delete(id);
}
//PostMapping permite registrar un nuevo rol
@PostMapping("/add")
public int create(@RequestBody Rol r) {
	return rolService.create(r);
}
//PutMappin permite modificar rol
@PutMapping("/update/{id}")
public String edit(@RequestBody Rol r, @PathVariable int id) {
	//Map<String, Object> map = rolService.read(id);
	//System.out.println(map);
	Rol rol = new Rol();
	rol.setId_rol(id);
	rol.setNomrol(r.getNomrol());	 
	rolService.update(r);
	return "hola";
}
}
