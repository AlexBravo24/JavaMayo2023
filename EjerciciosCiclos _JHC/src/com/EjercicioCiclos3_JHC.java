package com;

public class EjercicioCiclos3_JHC {
	
	
	public static void main(String[] args) {
		
		
		//3. Realiza un programa para determinar si un String es pal�ndromo. 
		
		System.out.println("Programa para determinar si un String es palindromo");
		
		String[] cadenas = { "Me gusta programar en Java", "La ruta natural", "Esto no es", "oso" };
		
		for (String cadena : cadenas) {
			
			System.out.println("�'" + cadena + "' es pal�ndromo? " + esPalindromo(cadena));
		}
		
	}

	public static boolean esPalindromo(String cadena) {
		
		cadena = cadena.toLowerCase().replace("�", "a").replace("�", "e").replace("�", "i").replace("�", "o")
				.replace("�", "u").replace(" ", "").replace(".", "").replace(",", "");
		
		// Invertir la cadena, y si es igual que la original entonces
		// son pal�ndromos
		
		String invertida = new StringBuilder(cadena).reverse().toString();
		//Invertir
		
		return invertida.equals(cadena);
		

	}

}

































//
//"A ti no, bonita",
//"Adivina ya te opina, ya ni miles origina, ya ni cetro me domina, ya ni monarcas, a repaso ni mulato carreta, acaso nicotina, ya ni cita vecino, anima cocina, pedazo gallina, cedazo terso nos retoza de canilla goza, de p�nico camina, �nice vaticina, ya ni tocino saca, a terracota luminosa pera, sacra n�mina y �nimo de mortecina, ya ni giros elimina, ya ni poeta, ya ni vida",
//"A mam�, Roma le aviva el amor a pap� y a pap�, Roma le aviva el amor a Mam�",