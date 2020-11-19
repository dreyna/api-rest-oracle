package pe.apirestoracle.entity;

public class Acceso {
private int idacceso;
private String nomacceso;
private String url;
private String icono;
public Acceso(int idacceso, String nomacceso, String url, String icono) {
	this.idacceso = idacceso;
	this.nomacceso = nomacceso;
	this.url = url;
	this.icono = icono;
}
public Acceso() {
}
public int getIdacceso() {
	return idacceso;
}
public void setIdacceso(int idacceso) {
	this.idacceso = idacceso;
}
public String getNomacceso() {
	return nomacceso;
}
public void setNomacceso(String nomacceso) {
	this.nomacceso = nomacceso;
}
public String getUrl() {
	return url;
}
public void setUrl(String url) {
	this.url = url;
}
public String getIcono() {
	return icono;
}
public void setIcono(String icono) {
	this.icono = icono;
}

}
