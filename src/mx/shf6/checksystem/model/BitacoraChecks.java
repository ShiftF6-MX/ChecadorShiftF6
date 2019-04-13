package mx.shf6.checksystem.model;

import java.sql.Time;
import java.util.Date;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.StringProperty;

public class BitacoraChecks {

	private IntegerProperty sysPK;
	private ObjectProperty<Date> fecha;
	private ObjectProperty<Time> horaEntrada;
	private ObjectProperty<Time> horaSalida;
	private ObjectProperty<Time> horaComidaSalida;
	private ObjectProperty<Time> horaComidaEntrada;
	private IntegerProperty usuario;

	//Constructor sin parametros
	public BitacoraChecks() {
		this(0,null,null,null,null,null,0);
	}

	//Constructor con parametros
	public BitacoraChecks(Integer sysPK, Date fecha, Time horaEntrada, Time horaSalida, Time horaComidaSalida, Time horaComidaEntrada, Integer usuario) {

		this.sysPK = new SimpleIntegerProperty(sysPK);
		this.fecha= new SimpleObjectProperty<Date>(fecha);
		this.horaEntrada = new SimpleObjectProperty<Time>(horaEntrada);
		this.horaSalida = new SimpleObjectProperty<Time>(horaSalida);
		this.horaComidaSalida = new SimpleObjectProperty<Time>(horaComidaSalida);
		this.horaComidaEntrada = new SimpleObjectProperty<Time>(horaComidaEntrada);
		this.usuario = new SimpleIntegerProperty(usuario);
	}

	//Metodos get y set SYS_PK
		public void setSysPk(int sysPK){
				this.sysPK.set(sysPK);
		}

		public int getSysPK(){
				return this.sysPK.get();
		}

		public IntegerProperty sysPKProperty(){
				return this.sysPK;
		}

	//Metodos get y set FECHA
		public void setFecha(Date fecha){
			this.fecha.set(fecha);
		}

		public Date getFecha(){
			return this.fecha.get();
		}

		public ObjectProperty<Date>fechaProperty(){
		   return this.fecha;
		 }

	//Metodos get y set HORA DE ENTRADA

		public void setHoraEntrada(Time horaEntrada){
			this.horaEntrada.set(horaEntrada);
		}

		public Time getHoraEntrada(){
			return this.horaEntrada.get();
		}

		public ObjectProperty<Time> horaEntradaProperty(){
			return this.horaEntrada;
		}

	//Metodos get y set HORA DE SALIDA
		public void setHoraSalida(Time horaSalida){
			this.horaSalida.set(horaSalida);
		}

		public Time getHoraSalida(){
			return this.horaSalida.get();
		}

		public ObjectProperty<Time> horaSalidaProperty(){
			return this.horaSalida;
		}

	//Metodos get y set HORA DE COMIDA SALIDA

		public void setHoraComidaSalida(Time horaComidaSalida){
			this.horaComidaSalida.set(horaComidaSalida);
		}

		public Time getHoraComidaSalida(){
			return this.horaComidaSalida.get();
		}

		public ObjectProperty<Time> horaComidaSalidaProperty(){
			return this.horaComidaSalida;
		}

	//Metodos get y set HORA COMIDA ENTRADA
		public void setHoraComidaEntrada(Time horaComidaEntrada){
			this.horaComidaEntrada.set(horaComidaEntrada);
		}

		public Time getHoraComidaEntrada(){
			return this.horaComidaEntrada.get();
		}

		public ObjectProperty<Time> horaComidaEntradaProperty(){
			return this.horaComidaEntrada;
		}

	//Metodos get y set EMPLEADO
		public void setUsuario(int usuario){
			this.usuario.set(usuario);
		}

		public int getUsuario(){
			return this.usuario.get();
		}

		public IntegerProperty usuarioProperty(){
			return this.usuario;
		}


}
