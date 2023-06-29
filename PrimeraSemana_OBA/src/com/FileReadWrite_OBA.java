package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FileReadWrite_OBA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// la clase File nos ayuda a manipular los ficheros y nos permite obtener datos : ubicacion de archivos
		//poder manipularlos con ayuda de otras clases
		
		// intentar realizar una lectura de archivos
		String linea;
		
		try {  //try ctrl + espacio y nos da esta estructura para el comando 
			File archivo = new File("C:\\Users\\chosc\\Desktop\\fichero.txt");
			//hay que leer el archivo
			FileReader fr = new FileReader(archivo);
			//hay que cargar el contenido del archivo
			BufferedReader buffer = new BufferedReader(fr);
			
			while((linea = buffer.readLine()) != null) 
				System.out.println(linea);
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("su archivo no se encontro");
			// TODO: handle exception
		}
		
	}

	}
