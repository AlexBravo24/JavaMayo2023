/**
 * 
 */
package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * @author Usuario
 *
 */
public class FileReadWrite_JAVC {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// LA CLASE FILE NOS PERMITE ACCEDER A ARCHIVOS EXTERNOS, UBICARLOS EN NUESTRO EQUIPO PARA POSTERIORMENTE PODER MANIPULARLOS
		// CON EL APOYO DE OTRAS CLASES
		
		// INTENTAR REALIZAR UNA LECTURA DE ARCHIVOS
		
		// try ctrl + espacio 
		
		//DECLARAMOS UN STRING DONDE VAMOS A PODER RECIBIR LAS LINEAS DEL TEXTO
		
		String linea;
		
		
		try {      // INTENTAMOS EJECUTAR EL SIGUIENTE CODIGO
			       // LA CLASE file NOS PERMITE TENER ACCESO A LA UBICACION DEL ARCHIVO Y TENER UNA REPRESENTACION DEL MISMO EN MEMORIA
			
//			File archivo = new File("D:\\Usuario\\Desktop\\FICHERO.txt");
//			
//			// HAY QUE SABER LEER EL ARCHIVO
//			
//			FileReader fr = new FileReader(archivo);
//			
//			// CARGAR EL CONTENIDO DEL ARCHIVO O LEERLO COMO TAL PARA PODER VISUALIZARLO / MANIPULARLO
//			
//			BufferedReader buffer = new BufferedReader(fr);
//			
//			// YA QUE LO PODEMOS LEER Y CARGAR DE ESTE LADO PODEMOS DARLE UNA SALIDA EN CONSOLA
//			
//			while((linea = buffer.readLine()) != null) {
//				System.out.println(linea);
//			}
			
			String abc = "\nabcdefghi\n";
			File archivo = new File("D:\\Usuario\\Desktop\\FICHERO.txt");
			
			// AHORA PODEMOS MANIPULARLO CON ESCRITURA MEDIANTE LA CLASE FileWriter
			
			FileWriter line = new FileWriter(archivo, true);
			
			for (int i = 0; i < args.length; i++) {
				line.write(abc.charAt(i) + "\n" );
				
			}
			
			line.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();     // SI OCURRE ALGUN ERROR O EXCEPCION, SE IMPRIMIRA EN CONSOLA DONDE ESTA OCURRIENDO DICHO ERROR
			System.out.println("No se encontro el Archivo ");
			
			
		}

	}

}
