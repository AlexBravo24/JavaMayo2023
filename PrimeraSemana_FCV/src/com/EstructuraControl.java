package com;

public class EstructuraControl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Estructuras de decisión IF - Valores booleanos
		
		int x = 9;
		
		if (x<10) {
			System.out.println("Si es menor");
		}
		else {
			System.out.println("No es menor");
		}
		
		//Atajo para comentar masivamente
		//o descomectar
		// Seleccionamos las lineas que queremos comentar
		//Es Ctrl+7
		
		String nombre = "Programador";
		System.out.println(nombre.length());
		
		//Condiciones compuestas con operadores
		//Logicos AND, OR, DIFERENTE DE, IGUALDAD
		
		//AND - && - Devuelve TRUE cuando se cumplen las condiciones
		
		if (nombre.length()<10 && nombre.equals("Programador")) {
			System.out.println("si");
		}
		else
		{
			System.out.println("No");
		}
		
		//OR - || - Te devuelve TRUE cuando se cumpla la menos una condición
		
		if (nombre.length()<12 || nombre.equalsIgnoreCase("diseñador"))
		{
			System.out.println("SI");
		}
	
	else {
		System.out.println("NO");
	}
	
	//NOT - ! - Niega una condición o cambia el valor de TRUE a FALSE
	if (!(nombre.length()<12)) {
		System.out.println("Si");
		
	}
	else {
		System.out.println("No");
	}
	
	//IGUALDAD - == - Revisar el valor y compararlo contra otro
	//Si los valores son iguales entonces manda TRUE, si no, manda FALSE
	
	int y=20;
	
	if(y==20) {
		System.out.println("SI");
	}else {
		System.out.println("No");
	}
	
	//Diferente De -!= - compara el valor y si es diferente
	//manda a TRUE
	
	if (y!=15) {
		System.out.println("SI");
	}else {
		System.out.println("NO");
	}
	
	//Estructura if-else concatenado
	
	int d=5;
	
	if(d==1) {
		System.out.println("Lunes");
	}else if (d==2) {
		System.out.println("Martes");
	}else if(d==3) {
		System.out.println("Miercoles");
	}else if(d==4) {
		System.out.println("Jueves");
	}else if (d==5) {
		System.out.println("Viernes");
	}
	
	// Selec Switch-case
	
	switch (d) {
	case 1:
		System.out.println("Lunes");
		
		break;
	case 2:
		System.out.println("Martes");
		break;
	case 3:
		System.out.println("Miercoles");
		break;
	case 4:
		System.out.println("Jueves");
		break;
	case 5:
		System.out.println("viernes");
		break;
	default:
		System.out.println("Ninguno de los anteriores");
		break;
	}

}
}
