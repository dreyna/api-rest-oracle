package pe.apirestoracle.dao;

import java.util.Map;

import pe.apirestoracle.entity.Usuario;

public interface UsuarioDao {
Usuario validarUsuario(String nomuser);
Map<String, Object> datosUsuario(String username);
}
