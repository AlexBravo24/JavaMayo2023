package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileReadWrite_FCV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// La clase File nos permite acceder a archivos
		//externos ubicarlos en nuestro equipo para
		//posteriormente poder manipular con el apoyo
		//de otras clases.
		
		//Intentar relaizar una lectura de archivos
		//DEclaramos un String donde vamos a poder 
		//recibir las lineas de texto
		
		String linea;
		
		try {//Intentamos ejecutar el siguiente codigo
			// Debe quedar con dos diagonales invertidas
			
//		   //File archivo = new File("C:\\Users\\Lenovo\\Desktop\\fichero.txt");
//			//Hay que saber leer el archivo
//			//FileReader fr = new FileReader(archivo);
//			//Hay que cargar el contenido del archivo
//			//o leerlo como tal para poder visualizarlo
//			// o manipularlo
		//BufferedReader buffer = new BufferedReader(fr);
//			//Ya que lo podemos leer y cargar de este lado, pues
//			//procedemos a darle una salida en consola
//			while((linea = buffer.readLine()) != null) {
//				//System.out.println(linea);
//				
//			//}
		String abc = "\nadndufdd\n";
		File archivo = new File("C:\\Users\\Lenovo\\Desktop\\fichero.txt");
	    FileWriter line = new FileWriter(archivo,true);
		for(int i = 0; i<abc.length(); i++) {
			line.write(abc.charAt(i)+"\n");
		}
		line.close();
		} catch (Exception e) {
			e.printStackTrace();//Si ocurre algun error o 
			//excepcion se imprimira en consola donde esta 
			//ocurriendo dicho error
			System.out.println("No se encontró el archivo");
			
		}

	}

}
