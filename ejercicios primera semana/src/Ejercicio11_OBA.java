import java.util.Scanner;

public class Ejercicio11_OBA {  // Ejercicio de paquetes

	public static void main(String[] args) { 
		
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el peso del paquete en kilogramos: ");
        double peso = scanner.nextDouble();

        System.out.print("Ingrese la zona a la que va dirigido el paquete (1-5): ");
        int zona = scanner.nextInt();

        double costoTransporte = calcularCostoTransporte(peso, zona);

        if (costoTransporte == -1) {
            System.out.println("El paquete excede el peso máximo permitido. No se puede transportar.");
        } else {
            System.out.println("El costo por la entrega del paquete es de " + costoTransporte + " euros.");
        }
	}

    public static double calcularCostoTransporte(double peso, int zona) {
        double costo = 0;

        if (peso > 5) {
            return -1; // Peso excede el límite máximo
        }

        switch (zona) {
            case 1: // América del Norte
                costo = 24.00;
                break;
            case 2: // América Central
                costo = 20.00;
                break;
            case 3: // América del Sur
                costo = 21.00;
                break;
            case 4: // Europa
                costo = 10.00;
                break;
            case 5: // Asia
                costo = 18.00;
                break;
            default:
                return -1; // Zona inválida
        }

        return costo * peso;
    
}

		
		
		
		
	}


