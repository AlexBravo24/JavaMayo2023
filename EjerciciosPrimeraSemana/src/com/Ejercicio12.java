package com;
import java.util.Scanner;


public class Ejercicio12 {
    static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		/*12.Construir un programa que calcule el �ndice de masa corporal de una persona (IMC = peso [kg] / altura2 [m]) 
		 * e indique el estado en el que se encuentra esa persona en funci�n del valor de IMC:
		 * Nota 1: se recomienda el empleo de sentencias if�else anidadas. Nota 2: Los operandos (peso y altura) 
		 * deben ser introducidos por teclado por el usuario.*/
		//Atributos

        double IMC;
        int peso;
        double altura;
      
        System.out.println("SE MUESTRA SU IMC, AS� COMO SU DIAGNOSTICO ");
        
        //Se solicitan datos al usuario
        System.out.println("Ingrese su peso:");
        peso=sc.nextInt();
      
        System.out.println("Ingrese su altura");  
        altura=sc.nextDouble();
      // se realiza el calculo del IMC
    IMC=peso/(altura*altura);
    System.out.println("Su masa corporal es:");  
    System.out.println(IMC);
   //se comparan los datos �para indicar el diagnostico en consola
    if(peso<16)
    {
        System.out.println("Criterio de ingreso en hospital");
    }else if(peso>=16 && peso<=17)
    {
        System.out.println("Infrapeso");
    }
    else if(peso>=17 && peso<=18)
    {
        System.out.println("Bajo peso");
    }
    else if(peso>=18 && peso<=25)
    {
        System.out.println("peso normal");
    }
    else if(peso>=25 && peso<=30)
    {
        System.out.println("sobrepeso (obesidad grado 1)");
    }
    else if(peso>=30 && peso<=35)
    {
        System.out.println("sobrepeso cr�nico(obesidad grado 2)");
    }
    else if(peso>=35 && peso<=40)
    {
        System.out.println("obesidad prem�rbida(obesidad grado 3)");
    }
    else if(peso>40)
    {
        System.out.println("obesidad m�rbida (obesidad grado 4)");
    }
   

	}

}
