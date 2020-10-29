package pe.apirestoracle.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.apirestoracle.service.RolService;

@RestController
@RequestMapping("/roles")
public class RolController {
@Autowired
private RolService rolService;

@GetMapping("/all")
public Map<String, Object> readAll(){
	return rolService.readAll();
}

}
