package com;

import java.util.Scanner;

public class Ciclos8_MBR {

	public static void main(String[] args) {
		/*8. Programa Java que lea dos números y muestre los números desde el menor hasta el mayor*/
		int n1, n2;
		Scanner e = new Scanner(System.in);
		System.out.println("Se muestran los numeros entre el mayor y el menor");
		System.out.println("Introduce el primer numero");
		n1=e.nextInt();
		System.out.println("Introduce el segundo numero");
		n2=e.nextInt();
		if(n1>n2) {
			System.out.println("Valores entre "+ n2 + "y" + n1);
			while(n2 < n1) {
				System.out.println(n2);
				n2++;
			}
			
		}else {
			System.out.println("Valores entre "+ n1+ "y " +n2);
			while(n1<n2) {
				System.out.println(n1);
				n1++;
			}
		}
		

	}

}
