package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintStream;

public class FileReadWrite_MBR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//la calse File nos permite acceder a archivos externos 
		//ubicarlos en nuestro quipo para posteriormente 
		//poder manipularlos con el apoyo de otras calses
		
		//Intentar realizar una lectura de archivos
		//try ctrl+ espacio
		//Declaramos un Stream donde vamos  a poder recibir
		//las lineas de texto
		
		String linea;
		try {//intentamos ejecutar el siguiente codigo 
//			//la calse file nos permite tener acceso a la ubicaccion de archivo
//			//y tener una representacion del mismo en memoria
//			File archivo = new File("C:\\Users\\Maricela Bautista\\Desktop\\fichero.txt");
//			//hay que saber leer el archivo
//			FileReader fr = new FileReader(archivo);
//			// hay que cargar  el contenido del archivo o leerlo como 
//			//para poder visualizarlo/manipularlo
//			BufferedReader buffer = new BufferedReader(fr);
//			//fr = new FileReader (archivo, "UTF-8");
//			// ya que lo podemos leer y cargar de este lado , pues 
//			//procedemos a darle una salida en consola 
//			while((linea = buffer.readLine()) != null) {
//				System.out.println(linea);
//				
//				//System.setOut(new PrintStream(System.out, true, "utf-8"));
//				
//			}
			String abc = "\nabcdefghi\n";
			File archivo = new File("C:\\Users\\Maricela Bautista\\Desktop\\fichero.txt");
			//Ahora podemos manipularlo con escritura mediante la clase FileWriter
			FileWriter line = new FileWriter(archivo, true);
			
			for (int i = 0; i < abc.length(); i++) {
				line.write(abc.charAt(i)+"\n");
				
			}
			line.close();
			
		} catch (Exception e) {
			e.printStackTrace(); //Si ocurrre algun error o exception
			//Se imprme en consola donde esta ocurriendo dicho error
			System.out.println("No se encontro el archico");
		}

	}

}
