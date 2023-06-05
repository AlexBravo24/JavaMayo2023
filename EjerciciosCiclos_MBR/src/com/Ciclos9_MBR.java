package com;

import java.util.Scanner;

public class Ciclos9_MBR {

	public static void main(String[] args) {
		/*9. Programa Java que lea dos números y muestre los números pares entre ellos*/
		int n1, n2;
		Scanner e = new Scanner(System.in);
		System.out.println("Se muestran los paares entre ambos números");
		System.out.println("Introduce el primer numero");
		n1=e.nextInt();
		System.out.println("Introduce el segundo numero");
		n2=e.nextInt();
		if(n1>n2) {
			System.out.println("Pares entre"+ n2 + "y" + n1);
			while(n2 < n1) {
				if((n2 % 2)==0) {
					System.out.println(n2);
				}
				n2++;
			}
			
		}else {
			System.out.println("Pares entre "+ n1+ "y " +n2);
			while(n1<n2) {
				if((n1 % 2)==0) {
					System.out.println(n1);
				}
				
				n1++;
			}
		}
		


	}

}
