import java.util.Scanner;

public class PalabrasPalindromos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String palabra1;
String palabra2;
Scanner valor=new Scanner(System.in);
       
      System.out.println("Ingrese la cadena para saber si es un palindromo:");
      palabra1=valor.nextLine();
      palabra2=palabra1.replace(" ", "");
	  StringBuffer re =new StringBuffer(palabra2);
       re=re.reverse();
      if(palabra2.equalsIgnoreCase(re.toString())) {
    	  System.out.println("La palabra "+palabra2+" SI es Polindromo" );
      }else {
    	  System.out.println("La palabra "+palabra2+" NO es Polindromo" );
      }

	}

}
