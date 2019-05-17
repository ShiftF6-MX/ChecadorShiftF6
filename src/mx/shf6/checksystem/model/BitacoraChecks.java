package mx.shf6.checksystem.model;

import java.sql.Time;
import java.sql.Connection;
import java.sql.Date;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import mx.shf6.checksystem.model.dao.UsuariosDAO;

public class BitacoraChecks {

	private IntegerProperty sysPK;
	private ObjectProperty<Date> fecha;
	private ObjectProperty<Time> horaEntrada;
	private ObjectProperty<Time> horaSalida;
	private ObjectProperty<Time> horaComidaSalida;
	private ObjectProperty<Time> horaComidaEntrada;
	private IntegerProperty usuarioFK;

	//CONSTRUCTOR SIN PARAMETROS
	public BitacoraChecks() {
		this(0, null, null, null, null, null, 0);
	}

	//CONSTRUCTOR CON PARAMETROS
	public BitacoraChecks(Integer sysPK, Date fecha, Time horaEntrada, Time horaSalida, Time horaComidaSalida,
			Time horaComidaEntrada, Integer usuarioFK) {

		this.sysPK = new SimpleIntegerProperty(sysPK);
		this.fecha = new SimpleObjectProperty<Date>(fecha);
		this.horaEntrada = new SimpleObjectProperty<Time>(horaEntrada);
		this.horaSalida = new SimpleObjectProperty<Time>(horaSalida);
		this.horaComidaSalida = new SimpleObjectProperty<Time>(horaComidaSalida);
		this.horaComidaEntrada = new SimpleObjectProperty<Time>(horaComidaEntrada);
		this.usuarioFK = new SimpleIntegerProperty(usuarioFK);
	}

	//METODOS DE ACCESO A "SYSPK"
	public void setSysPk(int sysPK) {
		this.sysPK.set(sysPK);
	}// FIN METODO

	public int getSysPK() {
		return this.sysPK.get();
	}// FIN METODO

	public IntegerProperty sysPKProperty() {
		return this.sysPK;
	}// FIN METODO
	//FIN METODOS "SYSPK"

	//METODOS DE ACCESO A "FECHA"
	public void setFecha(Date fecha) {
		this.fecha.set(fecha);
	}// FIN METODO

	public Date getFecha() {
		return this.fecha.get();
	}// FIN METODO

	public ObjectProperty<Date> fechaProperty() {
		return this.fecha;
	}// FIN METODO
	//FIN METODOS "FECHA"

	//METODOS DE ACCESO A "HORAENTRADA"
	public void setHoraEntrada(Time horaEntrada) {
		this.horaEntrada.set(horaEntrada);
	}// FIN METODO

	public Time getHoraEntrada() {
		return this.horaEntrada.get();
	}// FIN METODO

	public ObjectProperty<Time> horaEntradaProperty() {
		return this.horaEntrada;
	}// FIN METODO
	//FIN METODOS "HORAENTRADA"

	//METODOS DE ACCESO A "HORASALIDA"
	public void setHoraSalida(Time horaSalida) {
		this.horaSalida.set(horaSalida);
	}// FIN METODO

	public Time getHoraSalida() {
		return this.horaSalida.get();
	}// FIN METODO

	public ObjectProperty<Time> horaSalidaProperty() {
		return this.horaSalida;
	}// FIN METODO
	//FIN METODOS "HORASALIDA"

	//METODOS DE ACCESO A "HORACOMIDASALIDA"
	public void setHoraComidaSalida(Time horaComidaSalida) {
		this.horaComidaSalida.set(horaComidaSalida);
	}// FIN METODO

	public Time getHoraComidaSalida() {
		return this.horaComidaSalida.get();
	}// FIN METODO

	public ObjectProperty<Time> horaComidaSalidaProperty() {
		return this.horaComidaSalida;
	}// FIN METODO
	//FIN METODOS "HORACOMIDASALIDA"

	//METODOS DE ACCESO A "HORACOMIDAENTRADA"
	public void setHoraComidaEntrada(Time horaComidaEntrada) {
		this.horaComidaEntrada.set(horaComidaEntrada);
	}// FIN METODO

	public Time getHoraComidaEntrada() {
		return this.horaComidaEntrada.get();
	}// FIN METODO

	public ObjectProperty<Time> horaComidaEntradaProperty() {
		return this.horaComidaEntrada;
	}// FIN METODO
	//FIN METODOS "HORACOMIDAENTRADA"

	//METODOS DE ACCESO A "USUARIOFK"
	public void setUsuarioFK(int usuarioFK) {
		this.usuarioFK.set(usuarioFK);
	}// FIN METODO

	public int getUsuarioFK() {
		return this.usuarioFK.get();
	}// FIN METODO

	public IntegerProperty usuarioFKProperty() {
		return this.usuarioFK;
	}// FIN METODO

	public Usuarios getUsuario(Connection connection){
		return UsuariosDAO.readUsuarios(connection, this.getUsuarioFK());
	}// FIN METODO
	//FIN METODOS "USUARIOFK"
}//FIN CLASE
