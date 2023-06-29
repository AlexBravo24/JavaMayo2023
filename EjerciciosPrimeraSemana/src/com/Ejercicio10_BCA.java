package com;
import java.util.Scanner;
public class Ejercicio10_BCA {

	public static void main(String[] args) {
		
		int mes;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresar un numero entre el 1 y el 12: ");
        
        
        mes = entrada.nextInt();
    
            switch (mes) {
                case 1:
                    System.out.println("Mes: Enero, Dias: 31");
                    break;
                case 2:
                    System.out.println("Mes: Febrero, Dias: 28");
                    break;
                case 3:
                    System.out.println("Mes: Marzo, Dias: 31");
                    break;
                case 4:
                    System.out.println("Mes: Abril, Dias: 30");
                    break;
                case 5:
                    System.out.println("Mes: Mayo, Dias: 31");
                    break;
                case 6:
                    System.out.println("Mes: Junio, Dias: 30");
                    break;
                case 7:
                    System.out.println("Mes: Julio, Dias: 31");
                    break;
                case 8:
                    System.out.println("Mes: Agosto, Dias: 31");
                    break;
                case 9:
                    System.out.println("Mes: Septiembre, Dias: 30");
                    break;
                case 10:
                    System.out.println("Mes: Octubre, Dias: 31");
                    break;
                case 11:
                    System.out.println("Mes: Noviembre, Dias: 30");
                    break;
                case 12:
                    System.out.println("Mes: Diciembre, Dias: 31");
                    
                   break;
            }
		

	}

}
