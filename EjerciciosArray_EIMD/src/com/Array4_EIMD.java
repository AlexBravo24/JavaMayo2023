package com;




public class Array4_EIMD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 4. Dado un array de números de 5 posiciones con los siguientes valores:
{1,2,3,4,5}. Guardar los valores de este array en otro array distinto pero con
los valores invertidos, es decir, que el segundo array deberá tener los valores
{5,4,3,2,1}.

 */
		int [] numeros = new int[5];
		int[]numerosR=new int [5];
		int a=0;
		for (int i = 0; i <=4; i++) {
			numeros[i]= i;
			System.out.println(numeros[i]);
		}
			for (int i = 4; i >= 0; i--) {
				numerosR[i]=numeros[a];
				
				a++;
				System.out.println(numerosR[i]);
			}
		
	

		

		
	}

}
