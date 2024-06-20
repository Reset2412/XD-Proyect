package negocio;
import java.util.Scanner;
import datos.Crud;
import datos.ConBD;

public class Operaciones{
	Crud obj = new Crud();
	Scanner leer = new Scanner(System.in);
	
	public void connectBase(){
		String nombase;
		String nomusuario;
		String contra;
		System.out.print("Nombre de la base: ");
		nombase = leer.nextLine();
		System.out.print("Usuario: ");
		nomusuario = leer.nextLine();
		System.out.print("Contraseña: ");
		contra = leer.nextLine();
		obj.conectarBD(nombase, nomusuario, contra);
	}
	
	public void createUser(){
		String nomusuario;
		String contra;
		System.out.print("Nombre del usuario a crear: ");
		nomusuario = leer.nextLine();
		System.out.print("Contraseña: ");
		contra = leer.nextLine();
		obj.crearUsuario(nomusuario, contra);
	}


	public void createProcedureSelect(){
		String nomprocedure;
		String nomtabla;
		System.out.print("Nombre del Procedure de Select: ");
		nomprocedure = leer.nextLine();
		System.out.print("Nombre de la tabla: ");
		nomtabla = leer.nextLine();
		obj.procedimientoSelect(nomprocedure, nomtabla);
	}


	public void createProcedureUpdate(){
		String nomprocedure;
		String nomtabla;
		System.out.print("Nombre del Procedure de Update: ");
		nomprocedure = leer.nextLine();
		System.out.print("Nombre de la tabla: ");
		nomtabla = leer.nextLine();
		obj.procedimientoUpdate(nomprocedure, nomtabla);
	}


	public void select(){
		String nomprocedure;
		System.out.print("Nombre del Procedure: ");
		nomprocedure = leer.nextLine();
		obj.select(nomprocedure);
	}

	public void update(){
		String nomprocedure;
		int id;
		String valor;
		System.out.print("Nombre del Procedure: ");
		nomprocedure = leer.nextLine();
		System.out.print("Nuevo valor: ");
		valor = leer.nextLine();
		System.out.print("ID del registro a modificar: ");
		id = leer.nextInt();
		obj.update(nomprocedure, id, valor);
	}

}





















