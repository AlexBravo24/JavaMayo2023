package com;

public class Ciclo3_JAVC {

	public static void main(String[] args)  {
		
		String sPalabra = " somos o no somos ";
		
		int inc = 0;
		int des = sPalabra.length() - 1;
		boolean bError = false;
		
		while ((inc<des) && (!bError)) {
		
	     if (sPalabra.charAt(inc) == sPalabra.charAt(des)) {
	    	 
	    	 inc++;
	    	 des--;
	    	 
	     } else {
	    	 
	    	 bError = true;
	     }
	     }
		
		if(!bError) {
			
			System.out.println(sPalabra + " es un PALINDROMO ");
			
		}else {
				
				System.out.println(sPalabra + " No es un palindromo ");
		}
			
		
		// 3. Realiza un programa para determinar si un String es palíndromo. 
		
		
		
		
	}

}
