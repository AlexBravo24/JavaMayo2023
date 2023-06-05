package com;
import java.util.Scanner;

public class Ejercicio12RMQG {
    public static void main(String[] args) {
		/*
		 * Construir un programa que calcule el índice de masa corporal de una persona
		 * (IMC = peso [kg] / altura2[m]) e indique el diagnóstico en el que se
		 * encuentra esa persona en función del valor de IMC de acuerdo a la siguiente
		 * tabla: Valor de IMC Diagnóstico
		 * 
		 * < 16 Criterio de ingreso en hospital
		 * 
		 * de 16 a 17 infrapeso
		 * 
		 * de 17 a 18 bajo peso
		 * 
		 * de 18 a 25 peso normal (saludable)
		 * 
		 * de 25 a 30 sobrepeso (obesidad de grado I)
		 * 
		 * de 30 a 35 sobrepeso crónico (obesidad de grado II)
		 * 
		 * de 35 a 40 obesidad premorbida (obesidad de grado III)
		 * 
		 * >40 obesidad mórbida (obesidad de grado IV)
		 * 
		 * Nota 1: se recomienda el empleo de sentencias if–else anidadas. Nota 2: Los
		 * operandos (peso y altura) debenser introducidos por teclado por el usuario.
		 */
        Scanner scanner = new Scanner(System.in);
        double peso;
        double altura;
        double imc;

        System.out.print("Ingresa tu peso en kilogramos: ");
        peso = scanner.nextDouble();

        System.out.print("Ingresa tu altura en metros: ");
        altura = scanner.nextDouble();
        scanner.close();

        imc = peso / (altura * altura);

        if (imc < 16) {
            System.out.println("Tu IMC es " + imc + ", debes ir a un hospital.");
        } else if (imc >= 16 && imc < 17) {
            System.out.println("Tu IMC es " + imc + ", tu diagnóstico es: infrapeso.");
        } else if (imc >= 17 && imc < 18) {
            System.out.println("Tu IMC es " + imc + ", tu diagnóstico es: bajo peso.");
        } else if (imc >= 18 && imc < 25) {
            System.out.println("Tu IMC es " + imc + ", tu diagnóstico es: un peso normal (saludable).");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Tu IMC es " + imc + ", tu diagnóstico es: sobrepeso (obesidad de grado I).");
        } else if (imc >= 30 && imc < 35) {
            System.out.println("Tu IMC es " + imc + ", tu diagnóstico es: sobrepeso crónico (obesidad de grado II).");
        } else if (imc >= 35 && imc < 40) {
            System.out.println("Tu IMC es " + imc + ", tu diagnóstico es: obesidad premorbida (obesidad de grado III).");
        } else {
            System.out.println("Tu IMC es " + imc + ", tu diagnóstico es: obesidad mórbida (obesidad de grado IV).");
        }
    }
}