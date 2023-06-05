import java.util.Scanner;

public class Promedio {

	public static void main(String [] args) {
		
		Scanner valor=new Scanner(System.in);
		
	int[] edades= {};
		int totalalu=0;
		int sum = 0;
		int i=0;
        int promedio=0;
		
        
        do {  	System.out.println("Favor ingresar el total de alumnos:");
    	        totalalu=valor.nextInt();
    	        
               edades= new int[totalalu];
            
               for (int j = 0; j <totalalu; j++) {
            	   
            	System.out.println("ingresar la edad: "+j);
            	edades[j]=valor.nextInt();    
            	//System.out.println("Valor"+edades[j]);

            	sum+=edades[j];
            	//System.out.println(+sum);     
            	promedio = (sum / totalalu);
            	if(promedio>= 25) {
            		break;
            	}
            	 
    								
    		
    	}
			
		} while (promedio >= 25);
        System.out.println("El promedio de alumnos es mayor o igual a 25");
		
    
	}

	
	
}
