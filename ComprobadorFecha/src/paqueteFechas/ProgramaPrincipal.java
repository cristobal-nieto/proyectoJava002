package paqueteFechas;

import java.util.Scanner;

/**RETO:REALIZACIÓN COMPROBADOR DE FECHAS
   El usuario introducirá un número entre el 1 y el 12 que se corresponderá con el mes.
   El usuario introducirá un número entre el 1 y el 31 que se corresponderá con el día del mes.
   El programa deberá mostrar la fecha resultante indicando el mes en texto y el día en número.
*/



public class ProgramaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//DECLARACIÓN DE VARIABLES
		Scanner sc = new Scanner(System.in);
		
		
		//ENTRADA DE DATOS
		System.out.print("Introduce el mes (un número entre 1 y 12): ");
        int mes = sc.nextInt();
        
        System.out.print("Introduce el día (entre 1 y 31): ");
        int dia = sc.nextInt();
	
        //TRANSFORMACIÓN DE LA INFORMACIÓN
        if (mes >= 1 && mes <= 12 && dia >= 1 && dia <= 31) {
            // Mostramos la fecha en texto
            String nombrarMes = "";
            switch (mes) {
                case 1:
                	nombrarMes  = "enero";
                    break;
                case 2:
                	nombrarMes  = "febrero";
                    break;
                case 3:
                	nombrarMes  = "marzo";
                    break;
                case 4:
                	nombrarMes  = "abril";
                    break;
                case 5:
                	nombrarMes  = "mayo";
                    break;
                case 6:
                	nombrarMes  = "junio";
                    break;
                case 7:
                	nombrarMes  = "julio";
                    break;
                case 8:
                	nombrarMes  = "agosto";
                    break;
                case 9:
                	nombrarMes  = "septiembre";
                    break;
                case 10:
                	nombrarMes  = "octubre";
                    break;
                case 11:
                	nombrarMes  = "noviembre";
                    break;
                case 12:
                	nombrarMes  = "diciembre";
                    break;
                default:
                    break;
            }
            
            //SALIDA DE LA INFORMACIÓN
            System.out.printf("Se ha introducido el día" + dia + "de" + nombrarMes );
        } else {
            System.out.println("La fecha introducida es incorrecta.");
        }
        
        sc.close();
		
	
	
	
	}

}
