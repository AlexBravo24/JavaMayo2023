package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class FileReadWrite_AVG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//LA CLASE FILE NOS PERMITE ACCEDER A ARCHIVOS EXTERNOS
		//UBICARLOS EN NUESTRO EQUIPO PARA POSTERIORMENTE
		//PODER MANIPULAR CON EL APOYO DE OTRA CLASES
		
		//intentar realizar una lectura de archivo
		
		
		//try CTRL + Espacio
		//declaramos un string donde vamos a resibir las lineas de texto
		
		
		
		
		String linea;
		
		try {// intentamos ejecutar el siguiente codigo
			//la clase file nos permite tener acceso a la ubicacion del archivo 
			// y tener una representacion del mismo en memoria
//			File archivo = new File("C:\\Users\\teona\\OneDrive\\Escritorio\\fichero.txt");
//			// Hay que saber leer el archivo
//			FileReader fr = new FileReader(archivo);
//			//Hay que cargar el contenido del archivo o leerlo como tal
//			//para poder visualizar/manipular
//			BufferedReader buffer = new BufferedReader(new InputStreamReader(new FileInputStream(archivo), "utf-8"));
//			
//			//ya que lo podemos leer y cargar de este lado, pues procedemos 
//			//a darle una salida en la consola
//			
//			while((linea = buffer.readLine()) != null){
//				System.out.println(linea);
//			}
				
			
			String abc = "\nabcdghi\n";
			File archivo = new File("C:\\Users\\teona\\OneDrive\\Escritorio\\fichero.txt");
			//Ahora podemos manipularlos con la escritura mediante la clase  dilewrite
			FileWriter line= new FileWriter(archivo, true);
			
			for (int i = 0; i < abc.length(); i++) {
				line.write(abc.charAt(i)+ "\n");
			}
			line.close();
			
		} catch (Exception e) {
			e.printStackTrace(); //si ocurre algun error o excepcion//se imprimira en consola esta ocurriendo
			//dicho error
			System.out.println("no se encontro el archivo");
		}

	}

}
