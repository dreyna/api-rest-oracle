package pe.apirestoracle.entity;

public class Rol {
private int id_rol;
private String nomrol;
private int estado;
public Rol(int id_rol, String nomrol, int estado) {
	this.id_rol = id_rol;
	this.nomrol = nomrol;
	this.estado = estado;
}
public Rol() {}
public int getId_rol() {
	return id_rol;
}
public void setId_rol(int id_rol) {
	this.id_rol = id_rol;
}
public String getNomrol() {
	return nomrol;
}
public void setNomrol(String nomrol) {
	this.nomrol = nomrol;
}
public int getEstado() {
	return estado;
}
public void setEstado(int estado) {
	this.estado = estado;
}

}
