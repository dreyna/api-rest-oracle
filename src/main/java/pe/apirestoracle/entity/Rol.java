package pe.apirestoracle.entity;

public class Rol {
private int idrol;
private String nombre;
public Rol(int idrol, String nombre) {
	this.idrol = idrol;
	this.nombre = nombre;
}
public Rol() {
}
public int getIdrol() {
	return idrol;
}
public void setIdrol(int idrol) {
	this.idrol = idrol;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}

}