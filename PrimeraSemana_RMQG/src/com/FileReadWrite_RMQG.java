package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileReadWrite_RMQG {

	public static void main(String[] args) {
		// FILE CLASS 
		/*La clase file 
		 * ubicarlos ebn nuestro equip[o para posteriormenete
		 * poder manipularlos con el apoyo de otras clases
		 * Intentar realizar una lectura de archivos.
		 * try ctrl + espacio
		 */
		//System.setOut(new PrintStream(System.out, true, "utf-8"));
		String linea;
		try {//intentamos ejecutar el siguiente código
			//La clase file nos permite tener acceso a la ubicación del archivo
			//y tener una representación del mismo en memoria
			/*
			 * File archivo = new File("C:\\Users\\RafaQueb\\Desktop\\Fichero.txt"); //Hay
			 * que saber leer el archivo FileReader fr = new FileReader(archivo); //Hay que
			 * cargar el contenido del archivo o leerlo como tal BufferedReader buffer = new
			 * BufferedReader(fr); //Ya lo podemos leer y cargar de este lado //pues
			 * procedemos a darle una salida en consola while ((linea = buffer.readLine())
			 * != null) { System.out.println(linea); }
			 */
			String abc = "\nabcsdefghi\n";
			File archivo = new File("C:\\Users\\RafaQueb\\Desktop\\Fichero.txt");
			FileWriter line = new FileWriter(archivo, true);
			for (int i = 0; i < abc.length(); i++) {
				line.write(abc.charAt(i)+"\n");
			}
			line.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("No se encontró el archivo");
		}
	}

}
