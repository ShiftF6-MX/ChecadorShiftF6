package mx.shf6.checksystem.model;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Grupo {
	//PROPIEDADES
	private ObjectProperty<Integer> sysPK;
	private StringProperty nombre;
	private StringProperty descripcion;
	
	//CONSTRUCTORES
	public Grupo() {
        this(0,"", "");
    }//FIN CONSTRUCTOR
	
	public Grupo(int sysPK, String nombre, String descripcion) {
		this.sysPK = new SimpleObjectProperty<Integer> (sysPK);
		this.nombre = new SimpleStringProperty(nombre);
		this.descripcion = new SimpleStringProperty(descripcion);
	}//FIN CONSTRUCTOR

	//METODOS
	public void setSysPK(int sysPK) {
		this.sysPK.set(sysPK);
	} //FIN METODO
	
	public int getSysPK() {
		return this.sysPK.get();
	}//FIN METODO
	
	public ObjectProperty<Integer> sysPKProperty() {
		return this.sysPK;
	}//FIN METODO
	
	public void setNombre(String nombre) {
		this.nombre.set(nombre);
	}//FIN METODO
	
	public String getNombre() {
		return this.nombre.get();
	}//FIN METODO
	
	public StringProperty nombreProperty() {
		return this.nombre;
	}//FIN METODO
	
	public void setDescripcion(String descripcion) {
		this.descripcion.set(descripcion);
	}//FIN METODO
	
	public String getDescripcion() {
		return this.descripcion.get();
	}//FIN METODO
	
	public StringProperty descripcionProperty() {
		return this.descripcion;
	}//FIN METODO
	
}//FIN METODO
