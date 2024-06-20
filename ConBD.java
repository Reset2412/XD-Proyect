package datos;
import java.sql.*;
import negocio.Operaciones;

public class ConBD{
	Connection conexion = null;
	public Connection getConnection(){
		String url = "jdbc:mysql://localhost/";
		String user = "root", password = "";
		try{
			conexion = DriverManager.getConnection(url, user, password);						
		}catch(SQLException error){
			System.out.print("Error de tipo: " + error.getMessage());
		}
	return conexion;
	}

	public Connection getConnection2(String nombase, String nomusuario, String contra){
		String url = "jdbc:mysql://localhost/"+nombase;
		String user = nomusuario, password = contra;
		try{
			conexion = DriverManager.getConnection(url, user, password);			
		}catch(SQLException error){
			System.out.print("Error de tipo: " + error.getMessage());
		}
	return conexion;
	}
}