package mx.shf6.checksystem.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import mx.shf6.checksystem.model.Usuarios;
import mx.shf6.checksystem.utilities.Notificacion;

public class UsuariosDAO {
	//CONSTANTES
	public static final int BLOQUEADO = 0;
	public static final int NO_REGISTRADO = 1;
	public static final int CONTRSEÑA_INCORRECTA = 2;
	public static final int ACCESO_CORRECTO = 3;
	
	//METODO PARA HACER CREATE EN LA TABLA USUARIOS
	public static boolean createUsuarios(Connection connection, Usuarios usuarios) {
		String query = "INSERT INTO usuarios (Codigo, Usuario, Contrasena, CorreoElectronico, FechaRegistro, Status, AreaFK, HorarioFK, GrupoUsuarioFK) "
				+ "VALUES (?, ?, AES_ENCRYPT(?,'Shift_F6'), ?, CURDATE(), ?, ?, ?, ?)";
		try {
			PreparedStatement sentenciaPreparada =  connection.prepareStatement(query);
			sentenciaPreparada.setString(1, usuarios.getCodigo());
			sentenciaPreparada.setString(2, usuarios.getUsuario());
			sentenciaPreparada.setString(3, usuarios.getContrasena());
			sentenciaPreparada.setString(4, usuarios.getCorreoElectronico());
			sentenciaPreparada.setInt(5, usuarios.getStatus());
			sentenciaPreparada.setInt(6, usuarios.getAreaFK());
			sentenciaPreparada.setInt(7, usuarios.getHorarioFK());
			sentenciaPreparada.setInt(8,usuarios.getGrupoUsuarioFK());
			sentenciaPreparada.execute();
			return true;
		}catch(SQLException ex){
			Notificacion.dialogoException(ex);
			return false;
		}//FIN TRY/CATCH
	}//FIN METODO
	
	//METODOS PARA HACER READ EN LA TABLA USUARIOS
	public static ArrayList<Usuarios>readUsuarios(Connection connection){
		ArrayList<Usuarios> arrayListUsuario = new ArrayList<Usuarios>();
		String query = "SELECT Sys_PK, Codigo, Usuario, Contrasena, CorreoElectronico, FechaRegistro, FechaBloqueo, Status, AreaFK, HorarioFK, GrupoUsuarioFK "
				+ "FROM usuarios";
		try {
			Statement estado = connection.createStatement();
			ResultSet resultados = estado.executeQuery(query);
			while(resultados.next()) {
				Usuarios usuario = new Usuarios();
				usuario.setSysPK(resultados.getInt(1));
				usuario.setCodigo(resultados.getString(2));
				usuario.setUsuario(resultados.getString(3));
				usuario.setContrasena(resultados.getString(4));
				usuario.setCorreoElectronico(resultados.getString(5));
				usuario.setFechaRegistro(resultados.getDate(6));
				usuario.setFechaBloqueo(resultados.getDate(7));
				usuario.setStatus(resultados.getInt(8));
				usuario.setAreaFK(resultados.getInt(9));
				usuario.setHorarioFK(resultados.getInt(10));
				usuario.setGrupoUsuarioFK(resultados.getInt(11));
				arrayListUsuario.add(usuario);
			}//FIN WHILE
			
		}catch(SQLException ex) {
			//Notificacion.dialogoException(ex);
			System.out.println(ex);
		}//FIN TRY/CATCH
		return arrayListUsuario;	
	}//FIN METODO
	
	public static Usuarios readUsuarios(Connection connection, int sysPK) {
		Usuarios usuario = new Usuarios();
		String query = "SELECT Sys_PK, Codigo, Usuario, Contrasena, CorreoElectronico, FechaRegistro, FechaBloqueo, Status, AreaFK, HorarioFK, GrupoUsuarioFK "
				+ "FROM usuarios "
				+ "WHERE Sys_PK =" + sysPK;
		try {
			Statement estado = connection.createStatement();
			ResultSet resultados = estado.executeQuery(query);
			while(resultados.next()) {
				usuario.setSysPK(resultados.getInt(1));
				usuario.setCodigo(resultados.getString(2));
				usuario.setUsuario(resultados.getString(3));
				usuario.setContrasena(resultados.getString(4));
				usuario.setCorreoElectronico(resultados.getString(5));
				usuario.setFechaRegistro(resultados.getDate(6));
				usuario.setFechaBloqueo(resultados.getDate(7));
				usuario.setStatus(resultados.getInt(8));
				usuario.setAreaFK(resultados.getInt(9));
				usuario.setHorarioFK(resultados.getInt(10));
				usuario.setGrupoUsuarioFK(resultados.getInt(11));
			}//FIN WHILE			
		}catch(SQLException ex) {
			Notificacion.dialogoException(ex);
		}//FIN TRY/CATCH
		return usuario;		
	}//FIN METODO
	
	public static ArrayList<Usuarios> readUsuarios(Connection connection, String like){
		ArrayList<Usuarios> arrayListUsuario = new ArrayList<Usuarios>();
		String query = "SELECT Sys_PK, Codigo, Usuario, Contrasena, CorreoElectronico, FechaRegistro, FechaBloqueo, Status, AreaFK, HorarioFK, GrupoUsuarioFK "
				+ "FROM usuarios "
				+ "WHERE Codigo LIKE '%" + like + "%' "
						+ "OR Usuario LIKE '%" + like + "%'";
				
		try {
			Statement estado = connection.createStatement();
			ResultSet resultados = estado.executeQuery(query);
			while(resultados.next()) {
				Usuarios usuario = new Usuarios();
				usuario.setSysPK(resultados.getInt(1));
				usuario.setCodigo(resultados.getString(2));
				usuario.setUsuario(resultados.getString(3));
				usuario.setContrasena(resultados.getString(4));
				usuario.setCorreoElectronico(resultados.getString(5));
				usuario.setFechaRegistro(resultados.getDate(6));
				usuario.setFechaBloqueo(resultados.getDate(7));
				usuario.setStatus(resultados.getInt(8));
				usuario.setAreaFK(resultados.getInt(9));
				usuario.setHorarioFK(resultados.getInt(10));
				usuario.setGrupoUsuarioFK(resultados.getInt(11));
				arrayListUsuario.add(usuario);
			}//FIN WHILE			
		}catch(SQLException ex) {
			Notificacion.dialogoException(ex);
		}//FIN TRY/CATCH
		return arrayListUsuario;
	}//FIN METODO
	
	public static ArrayList<Usuarios> readUsuariosArea(Connection connection, String like, int areaFK){
		ArrayList<Usuarios> arrayListUsuario = new ArrayList<Usuarios>();
		String query = "SELECT Sys_PK, Codigo, Usuario, Contrasena, CorreoElectronico, FechaRegistro, FechaBloqueo, Status, AreaFK, HorarioFK, GrupoUsuarioFK "
				+ "FROM usuarios "
				+ "WHERE Codigo LIKE '%" + like + "%' "
						+ "AND AreaFK =" + areaFK;
				
		try {
			Statement estado = connection.createStatement();
			ResultSet resultados = estado.executeQuery(query);
			while(resultados.next()) {
				Usuarios usuario = new Usuarios();
				usuario.setSysPK(resultados.getInt(1));
				usuario.setCodigo(resultados.getString(2));
				usuario.setUsuario(resultados.getString(3));
				usuario.setContrasena(resultados.getString(4));
				usuario.setCorreoElectronico(resultados.getString(5));
				usuario.setFechaRegistro(resultados.getDate(6));
				usuario.setFechaBloqueo(resultados.getDate(7));
				usuario.setStatus(resultados.getInt(8));
				usuario.setAreaFK(resultados.getInt(9));
				usuario.setHorarioFK(resultados.getInt(10));
				usuario.setGrupoUsuarioFK(resultados.getInt(11));
				arrayListUsuario.add(usuario);
			}//FIN WHILE			
		}catch(SQLException ex) {
			Notificacion.dialogoException(ex);
		}//FIN TRY/CATCH
		return arrayListUsuario;
	}//FIN METODO
	//FIN METODOS
	
	//METODO PARA HACER UPDATE EN LA TABLA USUARIOS
	public static boolean updateUsuarios(Connection connection, Usuarios usuarios) {
		String query = " ";
		if(usuarios.getStatus().equals(Usuarios.BAJA)) {
			query = "UPDATE usuarios SET Codigo = ?, Usuario = ?, Contrasena = AES_ENCRYPT(?, 'Shift_F6'), CorreoElectronico = ?, FechaBloqueo = CURDATE(), Status = ?, AreaFK = ?, HorarioFK = ?, GrupoUsuarioFK = ? "
					+ "WHERE Sys_PK = ?";
		}else {
			query = "UPDATE usuarios SET Codigo = ?, Usuario = ?, Contrasena = AES_ENCRYPT(?, 'Shift_F6'), CorreoElectronico = ?, FechaBloqueo = NULL, Status = ?, AreaFK = ?, HorarioFK = ?, GrupoUsuarioFK = ? "
					+ "WHERE Sys_PK = ?";
		}//FIN IF
		
		try {
			PreparedStatement sentenciaPreparada = connection.prepareStatement(query);
			sentenciaPreparada.setString(1, usuarios.getCodigo());
			sentenciaPreparada.setString(2, usuarios.getUsuario());
			sentenciaPreparada.setString(3, usuarios.getContrasena());
			sentenciaPreparada.setString(4, usuarios.getCorreoElectronico());
			sentenciaPreparada.setInt(5, usuarios.getStatus());
			sentenciaPreparada.setInt(6, usuarios.getAreaFK());
			sentenciaPreparada.setInt(7, usuarios.getHorarioFK());
			sentenciaPreparada.setInt(8, usuarios.getGrupoUsuarioFK());
			sentenciaPreparada.setInt(9, usuarios.getSysPK());
			sentenciaPreparada.execute();
			return true;			
		}catch(SQLException ex) {
			System.out.println(ex);
			//Notificacion.dialogoException(ex);
			return false;
		}//FIN TRY/CATCH
	}//FIN METODO
	
	//METODO PARA HACER DELETE EN LA TABLA USUARIOS
	public static boolean deleteUsuarios(Connection connection, Usuarios usuarios) {
		String query = "DELETE FROM usuarios WHERE Sys_PK = ?";
		try {
			PreparedStatement sentenciaPreparada = connection.prepareStatement(query);
			sentenciaPreparada.setInt(1, usuarios.getSysPK());
			sentenciaPreparada.execute();
			return true;
		}catch(SQLException ex){
			Notificacion.dialogoException(ex);
			return false;
		}//FIN TRY/CATCH
	}//FIN METODO

}
