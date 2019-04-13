package mx.shf6.checksystem.model;

import java.sql.Connection;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;

public class RolGrupoUsuario {

	//PROPIEDADES
	private ObjectProperty<Integer> sysPK;
	private ObjectProperty<Integer> rolFK;
	private ObjectProperty<Integer> grupoFK;
	
	public RolGrupoUsuario() {
		this(-1, -1, -1);		
	}//FIN METODO

	public RolGrupoUsuario(int sysPK, int rolFK, int grupoFK) {
		this.sysPK = new SimpleObjectProperty<Integer>(sysPK);
		this.rolFK = new SimpleObjectProperty<Integer>(rolFK);
		this.grupoFK = new SimpleObjectProperty<Integer>(grupoFK);
	}//FIN METODO
	
	//METODOS DE A "SYSPK"
	public void setSysPK(int sysPK) {
		this.sysPK.set(sysPK);
	}//FIN METODO
	
	public int getSysPK() {
		return this.sysPK.get();
	}//FIN METODO
	
	public ObjectProperty<Integer> sysPKProperty() {
		return this.sysPK;
	}//FIN METODO
	//FIN METODOS "SYSPK"	
	
	//METODOS DE A "ROL"
	public void setRolPK(int rolFK) {
		this.rolFK.set(rolFK);
	}//FIN METODO
	
	public int getRolFK() {
		return this.rolFK.get();
	}//FIN METODO
	
	public ObjectProperty<Integer> rolFKProperty() {
		return this.rolFK;
	}//FIN METODO
	
	public Rol getRol(Connection connection) {
		return RolDAO.readRol(connection, this.getRolFK());
	}//FIN METODO
	//FIN METODOS "ROL"	
	
	//METODOS DE A "GRUPOUSUARIO"
	public void setGrupoFK(int grupoFK) {
		this.grupoFK.set(grupoFK);
	}//FIN METODO
	
	public int getGrupoFK() {
		return this.grupoFK.get();
	}//FIN METODO
	public ObjectProperty<Integer> grupoFKProperty() {
		return this.grupoFK;
	}//FIN METODO
	
	public Grupo getGrupo(Connection connection) {
		return GrupoDAO.readGrupo(connection, this.grupoFK);
	}//FIN METODO
	//FIN METODOS "GRUPOUSUARIO"
	
}//FIN CLASE
