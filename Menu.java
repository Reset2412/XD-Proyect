package presentacion;
import negocio.Operaciones;
import java.util.Scanner;

public class Menu{
	public void seleccionar(){
		Operaciones obj = new Operaciones();
		Scanner leer = new Scanner(System.in);
		int valor;
		do{
			System.out.println("\n     MENU\n Selecciona una opcion\n \n OPCIONES NECESARIAS\n1. Crear un nuevo usuario\n \n CONECTAR BD\n2. Conectar a la Base de Datos\n \n OPCIONES SECUNDARIAS\n3. Crear procedures\n4. CRUD\n \n5. Salir\n");
			valor = leer.nextInt();
			switch(valor){
				case 1:		
					System.out.println(" Seleccionaste la opcion Crear un nuevo usuario");
					obj.createUser();
				break;
				case 2:		
					System.out.println(" Seleccionaste la opcion Conectar a la Base de Datos");
					obj.connectBase();
				break;
				case 3:
					System.out.println(" Seleccionaste la opcion Crear procedures");
					do{
						System.out.println("\n Selecciona una opcion\n1. Crear Procedure Select\n2. Crear Procedure Update \n3. Salir\n");
						valor = leer.nextInt();
						switch(valor){
							case 1:
								System.out.println(" Seleccionaste la opcion Crear Procedure Select");
								obj.createProcedureSelect();
							break;
							case 2:
								System.out.println(" Seleccionaste la opcion Crear Procedure Update");
								obj.createProcedureUpdate();
							break;
							default:
								System.out.print("   Saliendo...");
						
						}
					}while(valor!=3);
				break;	
				case 4:
					System.out.println(" Seleccionaste la opcion CRUD");
					do{
						System.out.println("\n Selecciona una opcion\n1. Select\n2. Update\n3. Salir\n");
						valor = leer.nextInt();
						switch(valor){
							case 1:
								System.out.println(" Seleccionaste la opcion Select");
								obj.select();
							break;
							case 2:
								System.out.println(" Seleccionaste la opcion Update");
								obj.update();
							break;
							default:
								System.out.print("   Saliendo...");
						}
					}while(valor!=3);					
				default:
					System.out.print("   Hasta luego...");					
			}
		}while(valor!=5);
	}
}