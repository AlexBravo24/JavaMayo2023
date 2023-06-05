package com;

import java.util.Scanner;

public class Ejercicio13_MBR {

	public static void main(String[] args) {
		/*13. Una institución benéfica recibe anualmente una donación proveniente de Europa y lo reparte entre un centro de salud, 
		 * un comedor de niños y una parte lo invierte en la bolsa de acuerdo a lo siguiente:
Si el monto de la donación es de $10000 o más: 30% se destina al centro de salud, 50% al comedor de niños y el resto se invierte en la bolsa.
Si el monto de la donación es menor que $10000: 25% se destina al centro de salud, 60% al comedor de niños y el resto se invierte en la bolsa.
La institución desea saber cuánto de dinero destinará a cada rubro anualmente.
		 * 
		 */
		Scanner entrada = new Scanner(System.in);
		double donacion, centrosalud, comedorniños, bolsa;
		
        System.out.println("SE MUESTRA CUANTO DINERO SE DESTINARA A CADA RUBRO ANUALMENTE ");
        //Se solicitan datos a usuario
        System.out.println("Ingrese la cantidad de la donación:");  
        donacion=entrada.nextFloat();
        
         //Se realiza un condicional con if

		if(donacion>= 10000){
			centrosalud = 0.30 * donacion;
			comedorniños = 0.50 * donacion;
			bolsa = 0.20 * donacion;
		           
		}else{
			centrosalud = 0.25 * donacion;
			comedorniños = 0.60 * donacion;
			bolsa = 0.15 * donacion;
		            
		}

		//Se manda a consola los resultados 
		System.out.println("La donacion se debe repartir de la siguiente manera");

		System.out.println("Centro de salud:" + centrosalud);
		System.out.println("Comedor de niños:" + comedorniños);
		System.out.println("Inversionn en labolsa:" + bolsa);

	}

}

