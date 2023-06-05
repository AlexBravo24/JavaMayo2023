package com;

import java.util.Scanner;

public class Ejercicio12_JHC {

	public static void main(String[] args) {
		// 12.Construir un programa que calcule el �ndice de masa corporal de una persona (IMC = peso [kg] / 
		//altura2 [m]) e indique el estado en el que se encuentra esa persona en funci�n del valor de IMC:

		int peso;
		double IMC;
		double altura;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Este programa calcula el indice de masa corporal");

        System.out.println("Ponga su peso");
        peso = entrada.nextInt();
      
          
        //Datos del usuario
        System.out.println("Ponga su altura");  
        altura = entrada.nextDouble();
      
    IMC=peso/(altura*altura);
   
    System.out.println(IMC);
    
    //Procedimiento
   
    if(peso<16)
    {
        System.out.println("Ingreso hospital");
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
    
    entrada.close();
    
}

}
