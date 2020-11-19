package pe.apirestoracle.entity;

public class Usuario {
private int idusuario;
private String nomuser;
private String password;
private String estado;
public Usuario() {
	super();
}
public Usuario(int idusuario, String nomuser, String password, String estado) {
	super();
	this.idusuario = idusuario;
	this.nomuser = nomuser;
	this.password = password;
	this.estado = estado;
}
public int getIdusuario() {
	return idusuario;
}
public void setIdusuario(int idusuario) {
	this.idusuario = idusuario;
}
public String getNomuser() {
	return nomuser;
}
public void setNomuser(String nomuser) {
	this.nomuser = nomuser;
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
