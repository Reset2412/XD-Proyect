package datos;
import java.sql.*;
import negocio.Operaciones;

public class Crud{
	ConBD obj = new ConBD();
	Connection conexion = obj.getConnection();	

	private Connection conexion2;

	public void conectarBD(String nombase, String nomusuario, String contra){
		this.conexion2 = obj.getConnection2(nombase, nomusuario, contra);
	}

	public void crearUsuario(String nomusuario, String contra){
		try{
			Statement sentencia = conexion.createStatement();
			sentencia.executeUpdate("CREATE USER "+nomusuario+"@'localhost' IDENTIFIED BY '"+contra+"'");		
			sentencia.executeUpdate("GRANT ALL PRIVILEGES ON *.* TO "+nomusuario+"@'localhost'");
			sentencia.executeUpdate("FLUSH PRIVILEGES");
			//conexion.close();
		}catch(SQLException error){
			System.out.print("Error de tipo: " + error.getMessage());
		}
	}


	public void procedimientoUpdate(String nomprocedure, String nomtabla){
		try{
			Statement sentencia = this.conexion2.createStatement();
			sentencia.executeUpdate("CREATE PROCEDURE "+nomprocedure+"(valorn VARCHAR(50), idn INT) update "+nomtabla+" set valor = valorn where id = idn");
			//conexion.close();
		}catch(SQLException error){
			System.out.print("Error de tipo: " + error.getMessage());
		}
	}


	public void update(String nomprocedure, int id, String valor){
		try{
			Statement sentencia = this.conexion2.createStatement();
			sentencia.executeUpdate("CALL "+nomprocedure+"('"+valor+"', '"+id+"')");
			//conexion.close();
		}catch(SQLException error){
			System.out.print("Error de tipo: " + error.getMessage());
		}
	}

}

