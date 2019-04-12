package mx.shf6.checksystem.model;

import java.sql.Time;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Horario {
	
	//PROPIEDADES
	private ObjectProperty<Integer> sysPK;
	private StringProperty codigo;
	private StringProperty descripcion;
	private ObjectProperty<Time> horaEntrada;
	private ObjectProperty<Time> horaSalida;
	private ObjectProperty<Time> horaSalidaComida;
	private ObjectProperty<Time> horaEntradaComida;
	private ObjectProperty<Integer> status;
	
	//CONSTANTES
	public static final int INACTIVO = 0;
	public static final int ACTIVO = 1;
	
	//CONSTRUCTORES
	public Horario() {
		this(0, "", "", new Time(0), new Time(0), new Time(0), new Time(0), 0);
	}//FIN CONSTRUCTOR
	
	public Horario(int sysPK, String codigo, String descripcion, Time horaEntrada, Time horaSalida, Time horaSalidaComida, Time horaEntradaComida, int status) {
		this.sysPK = new SimpleObjectProperty<Integer>(sysPK);
		this.codigo = new SimpleStringProperty(codigo);
		this.descripcion = new SimpleStringProperty(descripcion);
		this.horaEntrada = new SimpleObjectProperty<Time>(horaEntrada);
		this.horaSalida = new SimpleObjectProperty<Time>(horaSalida);
		this.horaSalidaComida = new SimpleObjectProperty<Time>(horaSalidaComida);
		this.horaEntradaComida = new SimpleObjectProperty<Time>(horaEntradaComida);
		this.status = new SimpleObjectProperty<Integer>(status);
	}//FIN METODO
	
	//METODOS
	public void setSysPK(int sysPK) {
		this.sysPK.set(sysPK);
	}//FIN METODO
	
	public int getSysPK() {
		return this.sysPK.get();
	}//FIN METODO
	
	public ObjectProperty<Integer> sysPKProperty() {
		return this.sysPK;
	}//FIN METODO
	
	public void setCodigo(String codigo) {
		this.codigo.set(codigo);
	}//FIN METODO
	
	public String getCodigo() {
		return this.codigo.get();
	}//FIN METODO
	
	public StringProperty codigoProperty() {
		return this.codigo;
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
	
	public void setHoraEntrada(Time horaEntrada) {
		this.horaEntrada.set(horaEntrada);
	}//FIN METODO
	
	public Time getHoraEntrada() {
		return this.horaEntrada.get();
	}//FIN METODO
	
	public ObjectProperty<Time> horaEntradaProperty() {
		return this.horaEntrada;
	}//FIN METODO
	
	public void setHoraSalida(Time horaSalida) {
		this.horaSalida.set(horaSalida);
	}//FIN METODO
	
	public Time getHoraSalida() {
		return this.horaSalida.get();
	}//FIN METODO
	
	public ObjectProperty<Time> horaSalidaProperty() {
		return this.horaSalida;
	}//FIN METODO
	
	public void setHoraSalidaComida(Time horaSalidaComida) {
		this.horaSalidaComida.set(horaSalidaComida);
	}//FIN METODO
	
	public Time getHoraSalidaComida() {
		return this.horaSalidaComida.get();
	}//FIN METODO
	
	public ObjectProperty<Time> horaSalidaComidaProperty() {
		return this.horaSalidaComida;
	}//FIN METODO
	
	public void setHoraEntradaComida(Time horaEntradaComida) {
		this.horaEntradaComida.set(horaEntradaComida);
	}//FIN METODO
	
	public Time getHoraEntradaComida() {
		return this.horaEntradaComida.get();
	}//FIN METODO
	
	public ObjectProperty<Time> horaEntradaComidaProperty() {
		return this.horaEntradaComida;
	}//FIN METODO
	
	public void setStatus(int status) {
		this.status.set(status);
	}//FIN METODO
	
	public int getStatus() {
		return this.status.get();
	}//FIN METODO
	
	public StringProperty statusStringProperty() {
		if (this.getStatus() == Horario.INACTIVO)
			return new SimpleStringProperty("Inactivo");
		else 
			return new SimpleStringProperty("Activo");
	}//FIN METODO
	
	public ObjectProperty<Integer> statusProperty() {
		return this.status;
	}//FIN METODO

}//FIN CLASE
