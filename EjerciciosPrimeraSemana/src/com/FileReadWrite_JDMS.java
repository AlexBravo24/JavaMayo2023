package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileReadWrite_JDMS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//La clase File permite obtener datos ubicar esos  archivos
		//para posteriormente  manipularlos
		
		
		//intentar realizar una lectura de archivos
		
		//declaramos un  string donde vamos a recibir las lineas de texto
		String linea;
		
		try { //intentamos ejecutar el siguiente codigo
			//la clase  file permite tener acceso a la ubicacion del  archivo
			//y tener una representacion  del mismo
		   //	File archivo=new File("C:\\Users\\KatPC\\Desktop\\fichero.txt");
            //Hay que saber leer el  archivo
			//FileReader fr= new FileReader(archivo);
			
			//Hay que cargar el contenido del  archivo o leerlo como
		
		    //BufferedReader buffer= new BufferedReader(fr);
		    //Ya que lo podemos leer y cargar de este lada, pues procedemos a darle una salida en consola
		    //while((linea = buffer.readLine())!=null) {
		    	//System.out.println(linea);
		    //}
			String abc="\nabcdefghi\n";
			File archivo =new File("C:\\Users\\KatPC\\Desktop\\fichero.txt");
		    
			FileWriter line= new FileWriter(archivo,true);
			
			for (int i = 0; i < abc.length(); i++) {
	        line.write(abc.charAt(i)+"\n");			
			}
			line.close();
			
		} catch (Exception e) {
			e.printStackTrace();//Si ocurre un error aparecera en consola
			System.out.println("No se encontro el  archivo");
			// TODO: handle exception
		}
		
		
	}    

}
