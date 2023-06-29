import java.util.Scanner;

public class Ejercicio4_OBA {    //Realiza un programa que lea una cadena por teclado y compruebe si es una letra mayúscula.
                                 
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);    //pido la importacion de Scanner a java para leer lo que le pido al usuario
		System.out.println("Por favor escriba una letra aquí: ");   //mensaje para el usuario
		
		String cadena = scanner.nextLine();      //para leer la letra del usuario y guardarla en cadena
		
		if (cadena.length() == 1 && Character.isUpperCase(cadena.charAt(0))) {//para saber si la cadena es solo de un dígito y mayúscula
			System.out.println("La letra proporcionada por usted es Mayúscula.");  //respuesta en caso de ser mayúscula
			
		}else 	{  //en caso de que lo anterior no se cumpla osea que nos de una letra minúscula se muestra lo siguiente.
			System.out.println("La letra proporcionada por usted no es Mayúscula.");   
			
			
		}
		
		
		
		

	}

}
