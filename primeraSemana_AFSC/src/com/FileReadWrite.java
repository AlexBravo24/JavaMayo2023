package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileReadWrite {

	public static void main(String[] args) {
		// La clase File permite acceder a archivos externos
		//ubicarlos en nuestro equipo para posteriormente
		//poder maniularlos con el apoyo de otras clases
		
		//Intentar realizar una lectura de archivos
		
		//try ctrl+espacio
		//Declaramos un String donde vamos a poder recibir
		//las lineas de texto
		String linea;
		try {//intentamos ejecutar el sig. codigo
			//La clase file nos permite tener acceso a la ubicacion del archivo
			//y tener una representacion del mismo en memoria
//			File archivo = new File("C:\\Users\\Sandoval\\Desktop\\Fichero.txt");
//			//Hay que saber leer el archivo
//			FileReader fr= new FileReader(archivo);
//			//Hay que cargar el contenido del archivo o leerlo como
//			//para poder visualizarlo o manipularlo
//			BufferedReader buffer = new BufferedReader(fr);
//			//Ya que lo podemos leer y cargar de este lado, pues 
//			//procedemos a darle una salida en consola
//			while((linea=buffer.readLine()) !=null){
//				System.out.println(linea);
//			}
			String abc="\nabcdefghi\n";
			File archivo = new File("C:\\Users\\Sandoval\\Desktop\\Fichero.txt");
			//ahora podemos manipularlo con escritura mediante la clase 
			//FileWriter
			FileWriter line =new FileWriter(archivo,true);
			
			for (int i=0; i<abc.length(); i++) {
				line.write(abc.charAt(i)+"\n");
			}
			line.close();
					
		} catch (Exception e) {//Si ocurre algun error o excepcion
			//Se imprimira en consola donde esta ocurriendo dicho error 
			System.out.println("No se encontro el archivo");
		}

	}

}
