package pe.apirestoracle.entity;

public class Usuario {
private int idusuario;
private String username;
private String password;
private String estado;
public Usuario() {
	super();
}
public Usuario(int idusuario, String username, String password, String estado) {
	super();
	this.idusuario = idusuario;
	this.username = username;
	this.password = password;
	this.estado = estado;
}
public int getIdusuario() {
	return idusuario;
}
public void setIdusuario(int idusuario) {
	this.idusuario = idusuario;
}

public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getEstado() {
	return estado;
}
public void setEstado(String estado) {
	this.estado = estado;
}

}
