package com;

public class Arrays2CienNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int numeros[]=new int[100];
	  int suma=0;
	  int media=0;
      for (int i = 0; i < numeros.length; i++) {
    	  numeros[i] = (int) (Math.random()*100)+1;
    	  System.out.println(numeros[i]);
    	  suma+=numeros[i];
    	  media=suma / numeros.length;
    	}
  	System.out.println("La suma del total es :"+suma+" y la media es: "+media);	
	}

}
