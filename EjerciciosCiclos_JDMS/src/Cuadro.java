import java.util.Scanner;

public class Cuadro {

public static void main(String [] args) {
	int relleno;
	Scanner leer=new Scanner(System.in);
	int fila=10;
	int columna=10;
	System.out.println("Vacio -->0 / Relleno -->1 :");
    relleno=leer.nextInt();        
    System.out.println("\t DIBUJANDO EL CUADRILATERO \n");
    for (int f=0; f<fila; f++) {
        for (int c = 0; c < columna; c++) {
            //logica para la primera y ultima fila
            if(f==0||f==(fila-1)){
                //las esquinas se dibujan con +
                if(c==0||c==(columna-1)){
                    System.out.print("+");
                }
                //la primera y ultima fila quitando los extremos van con -
                else{
                    System.out.print("-");
                }
            }
            //logica para las filas que no sean la primera ni la ultima
            else{
                //la primera y ultima columna van con |
                if(c==0||c==(columna-1)){
                    System.out.print("|");
                }
                //logica las columnas internos
                else
                    //sin relleno
                    if(relleno==0){
                        System.out.print(" ");
                    }
                    //con relleno, digitamos el numero de fila
                    else{
                        System.out.print(f);
                    }
            }
        }
        System.out.println("");
    } 
     }
}
	
	

