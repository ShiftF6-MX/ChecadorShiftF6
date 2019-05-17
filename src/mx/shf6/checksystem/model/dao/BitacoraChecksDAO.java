package mx.shf6.checksystem.model.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import mx.shf6.checksystem.model.BitacoraChecks;


public class BitacoraChecksDAO {
	//METODO PARA CREAR UN REGISTRO EN LA BITACORACHECKS
	public static boolean create(Connection connection, int usuarioFK){
		String consulta="INSERT INTO bitacorachecks (Fecha, HoraEntrada, UsuarioFK) VALUES (CURDATE(), NOW(), ?);";
		try{
			PreparedStatement sentenciaPreparada= (PreparedStatement) connection.prepareStatement(consulta);
			sentenciaPreparada.setInt(1,usuarioFK);
			sentenciaPreparada.execute();
			return true;
		}catch(Exception ex){
//			Notificacion.dialogoException(ex);
			return false;
		}//FIN TRY/CATCH
	}///FIN METODO

	//METODO PARA OBTENER UNA LISTA DE TODAS LAS BITACORAS
	public static ArrayList<BitacoraChecks> readTodos(Connection connection){
		String consulta="SELECT Sys_PK, Fecha, HoraEntrada, HoraSalida, HoraComidaSalida, HoraComidaEntrada, UsuarioFK FROM bitacorachecks";
		ArrayList<BitacoraChecks> listaBitacoraChecks = new ArrayList<BitacoraChecks>();
		try {
			Statement sentencia = connection.createStatement();
			ResultSet resultados = sentencia.executeQuery(consulta);
			while(resultados.next()){
				BitacoraChecks bitacoraChecks = new BitacoraChecks();
				bitacoraChecks.setSysPk(resultados.getInt(1));
				bitacoraChecks.setFecha(resultados.getDate(2));
				bitacoraChecks.setHoraEntrada(resultados.getTime(3));
				bitacoraChecks.setHoraSalida(resultados.getTime(4));
				bitacoraChecks.setHoraComidaSalida(resultados.getTime(5));
				bitacoraChecks.setHoraComidaEntrada(resultados.getTime(6));
				bitacoraChecks.setUsuarioFK(resultados.getInt(7));
				listaBitacoraChecks.add(bitacoraChecks);
			}
		} catch (SQLException ex) {
//			Notificacion.dialogoException(ex);
		}//FIN TRY/CATCH
	return listaBitacoraChecks;
	}//FIN METODO

	//METODO PARA OBTENER UNA BITACORA POR SYSPK
	public static BitacoraChecks readPorSysPK(Connection connection, int sysPk){
		String consulta="SELECT Sys_PK, Fecha, HoraEntrada, HoraSalida, HoraComidaSalida, HoraComidaEntrada, UsuarioFK FROM bitacorachecks WHERE Sys_PK ='" + sysPk + "'";
		BitacoraChecks bitacoraChecks = new BitacoraChecks();
		try {
			Statement sentencia = connection.createStatement();
			ResultSet resultados = sentencia.executeQuery(consulta);
			while(resultados.next()){
				bitacoraChecks.setSysPk(resultados.getInt(1));
				bitacoraChecks.setFecha(resultados.getDate(2));
				bitacoraChecks.setHoraEntrada(resultados.getTime(3));
				bitacoraChecks.setHoraSalida(resultados.getTime(4));
				bitacoraChecks.setHoraComidaSalida(resultados.getTime(5));
				bitacoraChecks.setHoraComidaEntrada(resultados.getTime(6));
				bitacoraChecks.setUsuarioFK(resultados.getInt(7));
			}
		} catch (SQLException ex) {
//			Notificacion.dialogoException(ex);
		}//FIN TRY/CATCH
	return bitacoraChecks;
	}//FIN METODO

	//METODO PARA OBTENER UNA LISTA DE LAS BITACORAS POR USUARIO
	public static ArrayList<BitacoraChecks> readPorUsuario(Connection connection, int usuarioFK){
		String consulta="SELECT Sys_PK, Fecha, HoraEntrada, HoraSalida, HoraComidaSalida, HoraComidaEntrada, UsuarioFK FROM bitacorachecks WHERE UsuarioFK ='" + usuarioFK + "'";
		ArrayList<BitacoraChecks> listaBitacoraChecks = new ArrayList<BitacoraChecks>();
		try {
			Statement sentencia = connection.createStatement();
			ResultSet resultados = sentencia.executeQuery(consulta);
			while(resultados.next()){
				BitacoraChecks bitacoraChecks = new BitacoraChecks();
				bitacoraChecks.setSysPk(resultados.getInt(1));
				bitacoraChecks.setFecha(resultados.getDate(2));
				bitacoraChecks.setHoraEntrada(resultados.getTime(3));
				bitacoraChecks.setHoraSalida(resultados.getTime(4));
				bitacoraChecks.setHoraComidaSalida(resultados.getTime(5));
				bitacoraChecks.setHoraComidaEntrada(resultados.getTime(6));
				bitacoraChecks.setUsuarioFK(resultados.getInt(7));
				listaBitacoraChecks.add(bitacoraChecks);
			}
		} catch (SQLException ex) {
//			Notificacion.dialogoException(ex);
		}//FIN TRY/CATCH
	return listaBitacoraChecks;
	}//FIN METODO

	//METODO PARA OBTENER UNA LISTA DE LAS BITACORAS POR FECHA
	public static ArrayList<BitacoraChecks> readPorFecha(Connection connection, Date fecha){
		String consulta="SELECT Sys_PK, Fecha, HoraEntrada, HoraSalida, HoraComidaSalida, HoraComidaEntrada, UsuarioFK FROM bitacorachecks WHERE Fecha ='" + fecha + "'";
		ArrayList<BitacoraChecks> listaBitacoraChecks = new ArrayList<BitacoraChecks>();
		try {
			Statement sentencia = connection.createStatement();
			ResultSet resultados = sentencia.executeQuery(consulta);
			while(resultados.next()){
				BitacoraChecks bitacoraChecks = new BitacoraChecks();
				bitacoraChecks.setSysPk(resultados.getInt(1));
				bitacoraChecks.setFecha(resultados.getDate(2));
				bitacoraChecks.setHoraEntrada(resultados.getTime(3));
				bitacoraChecks.setHoraSalida(resultados.getTime(4));
				bitacoraChecks.setHoraComidaSalida(resultados.getTime(5));
				bitacoraChecks.setHoraComidaEntrada(resultados.getTime(6));
				bitacoraChecks.setUsuarioFK(resultados.getInt(7));
				listaBitacoraChecks.add(bitacoraChecks);
			}
		} catch (SQLException ex) {
//			Notificacion.dialogoException(ex);
		}//FIN TRY/CATCH
	return listaBitacoraChecks;
	}//FIN METODO

	//METODO PARA OBTENER UNA LISTA DE LAS BITACORAS POR RANGO DE FECHAS
	public static ArrayList<BitacoraChecks> readPorRangoFechas(Connection connection, Date fechaInicio, Date fechaFin){
		String consulta="SELECT Sys_PK, Fecha, HoraEntrada, HoraSalida, HoraComidaSalida, HoraComidaEntrada, UsuarioFK FROM bitacorachecks WHERE Fecha BETWEEN '" + fechaInicio + "' AND '" + fechaFin + "'";
		ArrayList<BitacoraChecks> listaBitacoraChecks = new ArrayList<BitacoraChecks>();
		try {
			Statement sentencia = connection.createStatement();
			ResultSet resultados = sentencia.executeQuery(consulta);
			while(resultados.next()){
				BitacoraChecks bitacoraChecks = new BitacoraChecks();
				bitacoraChecks.setSysPk(resultados.getInt(1));
				bitacoraChecks.setFecha(resultados.getDate(2));
				bitacoraChecks.setHoraEntrada(resultados.getTime(3));
				bitacoraChecks.setHoraSalida(resultados.getTime(4));
				bitacoraChecks.setHoraComidaSalida(resultados.getTime(5));
				bitacoraChecks.setHoraComidaEntrada(resultados.getTime(6));
				bitacoraChecks.setUsuarioFK(resultados.getInt(7));
				listaBitacoraChecks.add(bitacoraChecks);
			}
		} catch (SQLException ex) {
//			Notificacion.dialogoException(ex);
		}//FIN TRY/CATCH
	return listaBitacoraChecks;
	}//FIN METODO

	//METODO PARA ACTUALIZAR LA HORA DE SALIDA
	public static boolean updateHoraSalida(Connection connection, Date fecha, int usuarioFK){
		String consulta="UPDATE bitacorachecks SET HoraSalida = NOW() WHERE Fecha = '" + fecha + "' AND UsuarioFK = '" + usuarioFK + "'";
		try{
			PreparedStatement sentenciaPreparada= (PreparedStatement) connection.prepareStatement(consulta);
			sentenciaPreparada.execute();
			return true;
		}catch(Exception ex){
//			Notificacion.dialogoException(ex);
			return false;
		}//FIN TRY/CATCH
	}///FIN METODO

	//METODO PARA ACTUALIZAR LA HORA DE SALIDA A COMER
	public static boolean updateHoraComidaSalida(Connection connection, Date fecha, int usuarioFK){
		String consulta="UPDATE bitacorachecks SET HoraComidaSalida = NOW() WHERE Fecha ='" + fecha + "' AND UsuarioFK ='" + usuarioFK + "'";
		try{
			PreparedStatement sentenciaPreparada= (PreparedStatement) connection.prepareStatement(consulta);
			sentenciaPreparada.execute();
			return true;
		}catch(Exception ex){
//			Notificacion.dialogoException(ex);
			return false;
		}//FIN TRY/CATCH
	}//FIN METODO

	//METODO PARA ACTUALIZAR LA HORA DE ENTRADA DE COMER
	public static boolean updateHoraComidaEntrada(Connection connection, Date fecha, int usuarioFK){
		String consulta="UPDATE bitacorachecks SET HoraComidaEntrada = NOW() WHERE Fecha = '" + fecha + "' AND UsuarioFK ='" + usuarioFK + "'";
		try{
			PreparedStatement sentenciaPreparada= (PreparedStatement) connection.prepareStatement(consulta);
			sentenciaPreparada.execute();
			return true;
		}catch(Exception ex){
//			Notificacion.dialogoException(ex);
			return false;
		}//FIN TRY/CATCH
	}//FIN METODO

	//METODO PARA ELIMIAR UNA BITACORA
	public static boolean delete(Connection connection, int sysPk){
		String consulta="DELETE FROM bitacorachecks WHERE Sys_Pk = '" + sysPk + "';";
		try{
			PreparedStatement sentenciaPreparada= (PreparedStatement) connection.prepareStatement(consulta);
			sentenciaPreparada.execute();
			return true;
		}catch(Exception ex){
//			Notificacion.dialogoException(ex);
			return false;
		}//FIN TRY/CATCH
	}//FIN METODO

}//FIN CLASE
