import java.util.Scanner;

public class LetraEnFrase {

	public static void main(String[] args) {
		String frase;
		char letra;
		char letra2;
		int tamaño;
		int b=0;
		Scanner valor=new Scanner(System.in);
		       
		      System.out.println("Ingrese una frase:");
		      frase=valor.nextLine();

		      System.out.println("Ingrese una Letra:");
		      letra=valor.next().charAt(0);
		      
		      tamaño=frase.length();
		      
		      for(int i=0; i<tamaño; i++) {
		    	
		    	  letra2=frase.charAt(i);
		    	  
		    	  if(letra2==letra) {
		    		 b++;
	    	        }else if (b==0) {
	  		    	  System.out.println("Caracter "+letra+" no se encontrado " );
	  		    	  break;
	  		      	}else {
	  		      	System.out.println("La palabra "+letra+" se repite: "+b+" Veces");
	  		        break;
	  		      	}
		      }

		      

		      

	}

}
