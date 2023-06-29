package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FilrReadWrite_BCA {

	public static void main(String[] args) {
		// La clase File nos permite acceder a archivos 
		//externos  y ubicarlos en nuestro equipo para posteriormente}
		//poder manipuklarlos con el apoyo de otras clases
		
		//Intentar realizar una lectura de archivos
		
		//try ctrl + espacio, te da el "try an catch"
		
		//Declaramos un string donde vamos a poder resi ir las lineas de texto de nuestro archivo
		
		String linea;
		
try {//intentamos ejecutar el siguiente codigo
	
//	//La clase File nos permite tener acceso a la ubicacion del archivo
//	//y tener una representacion del mismo en memoria
//	File archivo = new File("C:\\Users\\mssl_\\Desktop\\Fichero.txt");
//	
//	//Hay que saber leer el archivo
//	FileReader fr = new FileReader(archivo);
//	
//	//Hay que cargar el contenido del archivo o leerlo como tal
//	//para poder leerlo y visualizarlo/Manipularlo
//	
//	BufferedReader buffer = new BufferedReader(fr);
//	//ya que lo podemos leer y cargar de este lado, pues
//	//procedemos a darle una salida en consola
//	
//	while((linea = buffer.readLine()) != null) {
//		
//		System.out.println(linea);
//		
//	}
	
	String abc = "\nBenigno Contreras Altamirano\n";
	File archivo = new File ("C:\\\\Users\\\\mssl_\\\\Desktop\\\\Fichero.txt");
	FileWriter line = new FileWriter(archivo, true);
	for (int i = 0; i < abc.length(); i++) {
		line.write(abc.charAt(i));
		
	}
	line.close();
	
} catch (Exception e) {
	// 
	e.printStackTrace();// Si ocurre algun error o excepcion
	//se imprimira en consolaa donde esta ocurriendo dicho error
	System.out.println("No se encontro el archivo");
}
		
	}

}
