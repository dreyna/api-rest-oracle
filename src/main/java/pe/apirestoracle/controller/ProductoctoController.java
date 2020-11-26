package pe.apirestoracle.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.apirestoracle.service.ProductoService;

@RestController
@RequestMapping("/productos")
public class ProductoctoController {
@Autowired
private ProductoService productoService;
@GetMapping("/all")
public List<Map<String, Object>> listar(){
	return productoService.readAll();
}
}
