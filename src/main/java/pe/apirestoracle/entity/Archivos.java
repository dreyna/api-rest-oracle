package pe.apirestoracle.entity;

public class Archivos {
private int idarchivos;
private String nombre;
private String url;
private int idusuario;
public Archivos() {
}


public Archivos(int idarchivos, String nombre, String url, int idusuario) {
	this.idarchivos = idarchivos;
	this.nombre = nombre;
	this.url = url;
	this.idusuario = idusuario;
}


public int getIdarchivos() {
	return idarchivos;
}
public void setIdarchivos(int idarchivos) {
	this.idarchivos = idarchivos;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getUrl() {
	return url;
}
public void setUrl(String url) {
	this.url = url;
}
public int getIdusuario() {
	return idusuario;
}
public void setIdusuario(int idusuario) {
	this.idusuario = idusuario;
}

}
