import java.util.Scanner;

public class TablaPorUsario {

	public static void main(String[] args) {
		Scanner valor=new Scanner(System.in);
		int tabla;
		int limite;
		System.out.println("Cual es la tabla que quiere:");
		tabla=valor.nextInt();
		System.out.println("Hasta que numero desea multiplicar:");
		limite=valor.nextInt();
		
		int i=1;
		   while(i<=limite) {
	          		System.out.println(tabla+"*"+i+"="+tabla*i);   
	          		i++;
		   }
	}

}
