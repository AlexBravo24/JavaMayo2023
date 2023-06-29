package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class FileReadWrite_EIMD {

	public static void main(String[] args) {
		
		
		String linea;
		
	try {
		/** de aqui para leer
		 
		 
		 
		File archivo=new File("C:\\Users\\eduar\\OneDrive\\Escritorio\\Ceteq2023\\5dejunio\\Fichero.txt");
		//FileReader fr=new FileReader(archivo);
		//BufferedReader buffer=new BufferedReader(fr);
		
		BufferedReader buffer=new BufferedReader(new InputStreamReader(new FileInputStream(archivo),"utf-8"));
		while ((linea=buffer.readLine())!=null) {
			System.out.println(linea);
		
		
		
		
		}	
		
		buffer.close();
		hasta aqui para leer */
		//* de aqui para leer
		String abc="\nHola Generación\n";
		File archivo=new File("C:\\Users\\eduar\\OneDrive\\Escritorio\\Ceteq2023\\5dejunio\\Fichero.txt");
		FileWriter line=new FileWriter(archivo,true);
		for (int i = 0; i < abc.length(); i++) {
			line.write(abc.charAt(i)+"\n");
				
		}
		line.close();
//hasta aqui para leer	*/	
		/*
//		int []matriz=new int[1];
//		matriz[0]=1;
//		matriz[1]=2;
//		System.out.println(matriz[3]);
 * */
 
	} catch (Exception e) {
//		System.out.println("no se pudo ejecutar");
		e.printStackTrace();
		System.out.println("No se encontró el archivo");
	}
	}

}
