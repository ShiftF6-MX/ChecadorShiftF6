package mx.shf6.checksystem.model;

import java.sql.Connection;
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
	private ObjectProperty<Date> fechaBloqueo;
	private ObjectProperty<Integer> status;
	private ObjectProperty<Integer> areaFK;
	private ObjectProperty<Integer> horarioFK;
	private ObjectProperty<Integer> grupoUsuarioFK;
	
	//CONSTANTES
	public static final int INACTIVO = 0;
	public static final int ACTIVO = 1;
	public static final int BAJA = 2;
	
	//CONSTRUCTOR SIN PARAMETROS
	public Usuarios(){
		this(0,"","","","",null,null,0,0,0,0);
	}//FIN CONSTRUCTOR
	
	//CONSTRUCTOR CON PARAMETROS
	public Usuarios(Integer sysPK, String codigo, String usuario, String contraseña, String correoElectronico, Date fechaRegistro, Date fechaBloqueo,
			Integer status, Integer areaFK, Integer horarioFK , Integer grupoUsuarioFK) {
		
		this.sysPK = new SimpleObjectProperty<Integer>(sysPK);
		this.codigo = new SimpleStringProperty(codigo);
		this.usuario = new SimpleStringProperty(usuario);
		this.contrasena = new SimpleStringProperty(contraseña);
		this.correoElectronico = new SimpleStringProperty(correoElectronico);
		this.fechaRegistro = new SimpleObjectProperty<Date>(fechaRegistro);
		this.fechaBloqueo = new SimpleObjectProperty<Date>(fechaBloqueo);
		this.status = new SimpleObjectProperty<Integer>(status);
		this.areaFK = new SimpleObjectProperty<Integer>(areaFK);
		this.horarioFK = new SimpleObjectProperty<Integer>(horarioFK);
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
	
	public StringProperty contrasenaProperty() {
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
	
	//METODOS PARA ACCEDER A LA FECHA DE BLOQUEO
	public void setFechaBloqueo(Date fechaBloqueo) {
		this.fechaBloqueo.set(fechaBloqueo);
	}//FIN METODO
	
	public Date getFechaBloqueo() {
		return this.fechaBloqueo.get();
	}//FIN METODO
	
	public ObjectProperty<Date> fechaBloqueoProperty(){
		return this.fechaBloqueo;
	}//FIN METODO
	
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
		
	public StringProperty statusStringProperty() {
		switch(this.getStatus()){
			case 0:
				return new SimpleStringProperty("Inactivo");
			case 1:
				return new SimpleStringProperty("Activo");
			case 2:
				return new SimpleStringProperty("Baja");
		}//FIN SWITCH
		return new SimpleStringProperty();
	}//FIN METODO
	//FIN METODOS
	
	//METODOS PARA ACCEDER A AREAS
	public void setAreaFK(Integer areaFK) {
		this.areaFK.set(areaFK);
	}//FIN METODO
	
	public Integer getAreaFK() {
		return this.areaFK.get();
	}//FIN METODO
	public ObjectProperty<Integer> areaFKProperty(){
		return this.areaFK;
	}//FIN METODO
	
	public Area getAreaUsuario(Connection connection) {
		return ;
	}//FIN METODO
	
	//METODO PARA ACCEDER AL HORARIO
	public void setHorarioFK(Integer horarioFK) {
		this.horarioFK.set(horarioFK);
	}//FIN METODO
	
	public Integer getHorarioFK() {
		return this.horarioFK.get();
	}//FIN METODO
	
	public ObjectProperty<Integer>horarioFKProperty(){
		return this.horarioFK;
	}//FIN METODO
	
	public Horario getHorarioUsuario(Connection connection) {
		return ;
	}//FIN METODO
	
	//METODOS PARA ACCEDER AL GRUPO USUARIOS
	public void setGrupoUsuarioFK(Integer grupoUsuariosFK) {
		this.grupoUsuarioFK.set(grupoUsuariosFK);
	}//FIN METODO
	
	public Integer getGrupoUsuarioFK() {
		return this.grupoUsuarioFK.get();
	}//FIN METODO
	public ObjectProperty<Integer> grupoUsuarioFKProperty() {
		return this.grupoUsuarioFK;
	}
	public Grupo getGrupoUsuario(Connection connection){
		return connection;
	}//FIN METODO
	//FIN METODOS
	
}
