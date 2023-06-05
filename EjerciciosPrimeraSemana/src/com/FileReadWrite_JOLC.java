package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileReadWrite_JOLC {

	public static void main(String[] args) {
		
		//la clase file nos permite acceder a archivos externos
		//ubicarlos en nuestro equipo para posteriormente 
		//poder manipularlos con el apoyo de otras clases
		
		//intentar realizar una lectura de archivos
		//try ctrl + espacio
		//declaramos un string donde vayamos a poder recibir las lineas de texto
		
		String linea;
		
		try {
			//  intentar ejecutar el siguiente codigo
			//la clase file nos permite tener acceso a la ultima ubicacion
			// y tener una representacion del mismo en memoria
			
//			File archivo = new File("C:\\Users\\user\\Desktop\\fichero.txt");
//			//hay que saber leer el archivo
//			FileReader fr = new FileReader(archivo);
//			// hay que cargar  el contenido del archivo o 
//			//leerlo como tal para poder visualizarlo / manipularlo
//	
//			BufferedReader buffer = new BufferedReader(fr);
//			// yq que o podemos leer y cargar de este lado, pues 
//			//precedemos a darle una salida en consola
//			
//			while((linea = buffer.readLine()) !=null) {
//				System.out.println(linea);			
//			}
			
		String abc = "\nabcdefghi\n";
		File archivo = new File ("C:\\Users\\user\\Desktop\\fichero.txt");
		
			// ahora podemos manipularo con escritura mediante la clase
		//FilerWriter
		
		FileWriter line =  new FileWriter(archivo , true);
		
		for(int i=0; i<abc.length(); i++) {
			line.write(abc.charAt(i)+"\n");
			
		}
		line.close();
		
		
		
			
			
	}catch (Exception e) {
		
		e.printStackTrace();// si ocurre algun error o exepcion 
		//se imprimira en consola donde esta ocurriendo dicho error
		System.out.println("no se encontro el archivo");
		
		
	}
		
		}
	}


