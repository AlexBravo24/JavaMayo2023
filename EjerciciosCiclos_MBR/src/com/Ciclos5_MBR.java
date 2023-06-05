package com;

public class Ciclos5_MBR {

	public static void main(String[] args) {
		/*5. Simular el comportamiento de un reloj digital, imprimiendo la hora, 
		 * minutos y segundos de un día desde las 00:00:00 horas hasta las 23:59:59 horas*/
		int s=0;
		int m=0;
		int h=0;
		for (h=00; h<=23; h++) {
			System.out.println(h+":"+m+":"+s);
			for(m = 00; m<=59; m++) {
				System.out.println(h+":"+m+":"+s);
			}
			for(s= 00; s<=59; s++) {
				System.out.println(h+":"+m+":"+s);
			}
		}

	}

}
