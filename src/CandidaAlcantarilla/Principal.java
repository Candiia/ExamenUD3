package CandidaAlcantarilla;

import utilidades.Leer;

public class Principal {
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		String nombre, apellidos;
		int opcion, estado, tam=10,i=0,dorsal=2;
		int juvenil=1,veterano=3;
		double distancia=10.98,tiempo,factor;
		Corredor c,c1,c2;
		Corredor lista[];
 
		Carrera t;
		lista=new Corredor[tam];
	/*	System.out.println("Introduzca el número de participantes:");
		aux=sc.nextLine();
		tam=Integer.parseInt(aux);
		lista=new Corredor[tam];
 
		System.out.println("Introduzca los kilómetros de la carrera:");
		aux=sc.nextLine();
		distancia=Double.parseDouble(aux);
		*/
		t= new Carrera(lista,distancia,i);
 
		c1=new Corredor("Cándida", "Alcantarilla Calado", 1, juvenil, 10.5);
		t.agregarCorredor(c1, i);
		i++;
 
		c2=new Corredor("Sebastián", "Millán Ordóñez", 2, juvenil, 10.4);
		t.agregarCorredor(c2, i);
		i++;
 
	
		do{
			imprimirMenu();
			opcion=Leer.datoInt();
 
			switch(opcion) {
				case 1:
					System.out.println("Introduzca el nombre del corredor");
					nombre=Leer.dato();
 
					System.out.println("Introduzca los apellidos del corredor:");
					apellidos=Leer.dato();
					System.out.println("""
							Introduzca la categoría del corredor:
							1 - Juvenil
							2 - Senior
							3 - Veterano
							""");
					estado=Leer.datoInt();
 
					System.out.println("Introduzca el tiempo del corredor:");
					tiempo=Leer.datoDouble();
 
					dorsal++;
 
					c=new Corredor(nombre, apellidos, dorsal, estado, tiempo);
					t.agregarCorredor(c, i);
					i++;
					
					t.mostrarLista(lista);
					break;
				case 2:
					System.out.println("Introduzca el dorsal del corredor:");
					dorsal=Leer.datoInt();
					t.findPorDorsal(dorsal);
					System.out.println("Introduzca el factor de conversion:");
					factor=Leer.datoDouble();
					System.out.printf("El tiempo tras el factor es de: %.2f",t.calcularTiempo(dorsal, factor));
					
					break;
				case 3:
					t.mostrarLista(t.buscarSeccion(veterano));
					break;
				case 4:
						System.out.println("Introduzca el dorsal del corredor:");
						dorsal=Leer.datoInt();
						t.findPorDorsal(dorsal);
							System.out.println("Introduzca el nuevo tiempo");
							tiempo=Leer.datoDouble();
 
					break;
				case 5:
					System.out.println("Introduzca el dorsal del corredor:");
					dorsal=Leer.datoInt();
					System.out.printf("%.2f",t.calcularMedia(dorsal));
					break;
					
				case 6:
					System.out.println("Indica la sección");
					estado=Leer.datoInt();
					t.mostraListaV2(t.buscarSeccion(estado));
					break;
					
					
				case 0:
					System.out.println("Ha salido del programa.");
					break;
				default:
					System.out.println("Opción no válida.");
					break;
			}
		}while(opcion!=0);
	}
	
	public static void imprimirMenu() {
		
		System.out.println("""
				\n---------------------------------------------------------------
					0 - Salir.
					1 - Agregar un corredor.
					2 - Calcular el tiempo.
					3 - Devolver los corredores veteranos .
					4 - Modificar el tiempo.
					5 - Calcular la media de tiempo en minutos por kilómetro.
					6 - Mostra la lista de sección que deses.
				---------------------------------------------------------------

				""");
	}
}

