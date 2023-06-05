package com;

import java.util.Scanner;

public class Ejercicio12_BCA {

	public static void main(String[] args) {
		// IMC
		
		 Scanner entrada=new Scanner(System.in);
			
			Double Estatura, Peso, IMC, Operacion;
			
			System.out.println("Bienvenidos al centro medico");
			System.out.println("Por favor indique su estatura en metros");
			Estatura = entrada.nextDouble();
			System.out.println("Por favor indique su peso");
			Peso = entrada.nextDouble();
			Operacion=Math.pow(Estatura, 2);
			IMC=Peso/Operacion;
			
			
			if(IMC<16) {
				
				System.out.println("Debe ser ingresado");
				
			}
			else if(IMC>16 && IMC<17) {
				System.out.println("Infrapeso");
				
			}
			else if(IMC>17 && IMC<18) {
				System.out.println("Bajo peso");
				
			}
			else if(IMC>18 && IMC<25) {
				System.out.println("Saludable");
				
			}
			else if(IMC>25 && IMC<30) {
				System.out.println("Obesidad grado 1");
				
			}
			else if(IMC>30 && IMC<35) {
				System.out.println("Obesidad grado 2");
				
			}
			else if(IMC>35 && IMC<40) {
				System.out.println("Obesidad grado 3");
				
			}
			else if(IMC>40) {
				System.out.println("Obesidad grado 4");
				
			}


	}

}
