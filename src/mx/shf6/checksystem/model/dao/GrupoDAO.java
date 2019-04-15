package mx.shf6.checksystem.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import mx.shf6.checksystem.model.Grupo;

public class GrupoDAO {
	//METODO PARA HACER CREATE EN LA TABLA GRUPOS
	public static boolean createGrupo(Connection connection, Grupo grupo) {
		String query = "INSERT INTO grupos (Nombre, Descripcion) VALUES (? , ?)";
		try {
			PreparedStatement sentenciaPreparada = connection.prepareStatement(query);
			sentenciaPreparada.setString(1, grupo.getNombre());
			sentenciaPreparada.setString(2, grupo.getDescripcion());
			sentenciaPreparada.execute();
			return true;
			
		}catch(SQLException ex) {
			System.out.println(ex);
			return false;
		}	//FIN TRY/CATCH	
	}//FIN METODO
	
	//METODOS PARA HACER READ EN LA TABLA USUARIOS
	public static ArrayList<Grupo> readGrupo(Connection connection){
		ArrayList<Grupo> arrayListGrupo = new ArrayList<Grupo>();
		String query = "SELECT Sys_PK, Nombre, Descripcion FROM grupos";
		try {
			Statement sentencia = connection.createStatement();
			ResultSet resultados = sentencia.executeQuery(query);
			while(resultados.next()) {
				Grupo grupo = new Grupo();
				grupo.setSysPK(resultados.getInt(1));
				grupo.setNombre(resultados.getString(2));
				grupo.setDescripcion(resultados.getString(3));
				arrayListGrupo.add(grupo);
			}//FIN WHILE
		}catch(SQLException ex) {
			System.out.println(ex);
		}//FIN TRY/CATCH
		return arrayListGrupo;
	}//FIN METODO
	
	public static Grupo readGrupo(Connection connection, int sysPK){
		Grupo grupo = new Grupo();
		String query = "SELECT Sys_PK, Nombre, Descripcion FROM grupos "
				+ "WHERE Sys_PK = " + sysPK;
		try {
			Statement sentencia = connection.createStatement();
			ResultSet resultados = sentencia.executeQuery(query);
			while(resultados.next()) {
				grupo.setSysPK(resultados.getInt(1));
				grupo.setNombre(resultados.getString(2));
				grupo.setDescripcion(resultados.getString(3));
			}//FIN WHILE
		}catch(SQLException ex) {
			System.out.println(ex);
		}//FIN TRY/CATCH
		return grupo;
	}//FIN METODO
	
	public static ArrayList<Grupo> readGrupo(Connection connection, String like){
		ArrayList<Grupo> arrayListGrupo = new ArrayList<Grupo>();
		String query = "SELECT Sys_PK, Nombre, Descripcion FROM grupos "
				+ "WHERE Nombre LIKE '%" + like +"%'";
		try {
			Statement sentencia = connection.createStatement();
			ResultSet resultados = sentencia.executeQuery(query);
			while(resultados.next()) {
				Grupo grupo = new Grupo();
				grupo.setSysPK(resultados.getInt(1));
				grupo.setNombre(resultados.getString(2));
				grupo.setDescripcion(resultados.getString(3));
				arrayListGrupo.add(grupo);
			}//FIN WHILE
		}catch(SQLException ex) {
			System.out.println(ex);
		}//FIN TRY/CATCH
		return arrayListGrupo;
	}//FIN METODO
	
	//METODOS PARA HACER UPDATE EN LA TABLA GRUPOS
	public static boolean updateGrupo(Connection connection, Grupo grupo) {
		String  query = "UPDATE grupos SET Nombre = ?, Descripcion = ? WHERE Sys_PK = ?";
		try {
			PreparedStatement sentenciaPreparada = connection.prepareStatement(query);
			sentenciaPreparada.setString(1, grupo.getNombre());
			sentenciaPreparada.setString(2, grupo.getDescripcion());
			sentenciaPreparada.setInt(3, grupo.getSysPK());
			sentenciaPreparada.execute();
			return true;
		}catch(SQLException ex) {
			System.out.println(ex);
			return false;
		}//FIN TRY/CATCH	
	}//FIN METODO
	
	//METODOS PARA HACER DELETE EN LA TABLA GRUPOS
	public static boolean deleteGrupo(Connection connection, Grupo grupo) {
		String query = "DELETE FROM grupos WHERE Sys_PK = ?";
		try {
			PreparedStatement sentenciaPreparada = connection.prepareStatement(query);
			sentenciaPreparada.setInt(1, grupo.getSysPK());
			sentenciaPreparada.execute();
			return true;
		}catch(SQLException ex) {
			System.out.println(ex);
			return false;
		}//FIN TRY/CATCH	
	}//FIN METODO
}
