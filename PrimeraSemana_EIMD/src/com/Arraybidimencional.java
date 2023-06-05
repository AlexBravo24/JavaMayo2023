package com;

public class Arraybidimencional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [][]numeros=new int[3][3];
numeros[0][0]=1;
numeros[0][1]=2;
numeros[0][2]=3;

numeros[1][0]=4;
numeros[1][1]=5;
numeros[1][2]=6;

numeros[2][0]=7;
numeros[2][1]=8;
numeros[2][2]=9;


int [][] numeros2= {{1,2,3},{4,5,6},{7,8,9}};


for (int i = 0; i < numeros2.length; i++) {
	System.out.println();
	for (int j = 0; j < numeros2.length; j++) {
	System.out.print(numeros2[i][j]+ " ");	
		
		
	}
	
}
	}

}
