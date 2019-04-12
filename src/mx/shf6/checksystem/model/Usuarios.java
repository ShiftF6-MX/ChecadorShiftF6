package mx.shf6.checksystem.model;

import java.sql.Date;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Usuarios {
	
	//PROPIEDADES
	private ObjectProperty<Integer> sysPK;
	private StringProperty codigo;
	private StringProperty usuario;
	private StringProperty contrasena;
	private StringProperty correoElectronico;
	private ObjectProperty<Date> fechaRegistro;
	private ObjectProperty<Integer> status;
	private ObjectProperty<Integer> grupoUsuarioFK;
	
	//CONSTANTES
	public static final int BAJA = 0;
	public static final int ACTIVO = 1;
	
	//CONSTRUCTOR SIN PARAMETROS
	public Usuarios(){
		this(0,"","","","",null,0,0);
	}//FIN CONSTRUCTOR
	
	//CONSTRUCTOR CON PARAMETROS
	public Usuarios(Integer sysPK, String codigo, String usuario, String contraseña, String correoElectronico, Date fechaRegistro,
			Integer status , Integer grupoUsuarioFK) {
		
		this.sysPK = new SimpleObjectProperty<Integer>(sysPK);
		this.codigo = new SimpleStringProperty(codigo);
		this.usuario = new SimpleStringProperty(usuario);
		this.contrasena = new SimpleStringProperty(contraseña);
		this.correoElectronico = new SimpleStringProperty(correoElectronico);
		this.fechaRegistro = new SimpleObjectProperty<Date>(fechaRegistro);
		this.status = new SimpleObjectProperty<Integer>(status);
		this.grupoUsuarioFK = new SimpleObjectProperty<Integer>(grupoUsuarioFK);
	}//FIN CONSTRUCTOR 
	
	//METODOS PARA ACCEDER AL SYSPK
	public void setSysPK(Integer sysPK) {
		this.sysPK.set(sysPK);
	}//FIN METODO
	
	public Integer getSysPK() {
		return this.sysPK.get();
	}//FIN METODO
	
	public ObjectProperty<Integer> sysPKProperty(){
		return this.sysPK;
	}//FIN METODO
	//FIN METODOS
	
	//METODOS PARA ACCEDER AL CODIGO
	public void setCodigo(String codigo) {
		this.codigo.set(codigo);
	}//FIN METODO
	
	public String getCodigo() {
		return this.codigo.get();
	}//FIN METODO
	
	public StringProperty codigoProperty(){
		return this.codigo;
	}//FIN METODO
	//FIN METODOS
	
	//METODOS PARA ACCEDER AL USUARIO
	public void setUsuario(String usuario) {
		this.usuario.set(usuario);
	}//FIN METODO
	
	public String getUsuario() {
		return this.usuario.get();
	}//FIN METODO
	
	public StringProperty usuarioProperty() {
		return this.usuario;
	}//FIN METODO
	//FIN METODOS
	
	//METODOS PARA ACCEDER A LA CONTRSEÑA
	public void setContrasena(String contrasena) {
		this.contrasena.set(contrasena);
	}//FIN METODO
	
	public String getContrasena() {
		return this.contrasena.get();
	}//FIN METODO
	
	public StringProperty contraseñaProperty() {
		return this.contrasena;
	}//FIN METODO
	//FIN METODOS
	
	//METODOS PARA ACCEDER AL CORREO
	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico.set(correoElectronico);
	}//FIN METODO
	
	public String getCorreoElectronico() {
		return this.correoElectronico.get();
	}//FIN METODO
	
	public StringProperty correoElectronicoProperty() {
		return this.correoElectronico;
	}//FIN METODO
	//FIN METODOS
	
	//METODOS PARA ACCEDER A LA FECHA
	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro.set(fechaRegistro);
	}//FIN METODO
	
	public Date getFechaRegistro() {
		return this.fechaRegistro.get();
	}//FIN METODO
	
	public ObjectProperty<Date> fechaRegistroProperty(){
		return this.fechaRegistro;
	}//FIN METODO
	//FIN METODOS
	
	//METODOS PARA ACCEDER AL STATUS
	public void setStatus(Integer status) {
		this.status.set(status);
	}//FIN METODO
	
	public Integer getStatus() {
		return this.status.get();
	}//FIN METODO
	
	public ObjectProperty<Integer> statusProperty(){
		return this.status;
	}//FIN METODO
	
	public String getDescripcionStatus() {
		switch(this.getStatus()) {
		case 0:
			return "Baja";
		case 1:
			return "Activo";
		}// FIN SWTICH
		return "";
	}//FIN METODO
	
	public void setNumerosStatus(String status) {
		switch(status) {
		case "Baja":
			this.setStatus(0);
			break;
		case "Activo":
			this.setStatus(1);
			break;
		}//FIN SWTICH
	}// FIN METODO
	
	public StringProperty descripcionStatusProperty() {
		switch(this.getStatus()){
			case 0:
				return new SimpleStringProperty("Baja");
			case 1:
				return new SimpleStringProperty("Activo");
		}//FIN SWITCH
		return new SimpleStringProperty();
	}//FIN METODO
	//FIN METODOS
	
	//METODOS PARA ACCEDER AL GRUPO USUARIOS
	public void setGrupoUsuarioFK(Integer grupoUsuariosFK) {
		this.grupoUsuarioFK.set(grupoUsuariosFK);
	}//FIN METODO
	
	public Integer getGrupoUsuarioFK() {
		return this.grupoUsuarioFK.get();
	}
	
	public ObjectProperty<Integer> grupoUsuarioFKProperty(){
		return this.grupoUsuarioFK;
	}
	
}
