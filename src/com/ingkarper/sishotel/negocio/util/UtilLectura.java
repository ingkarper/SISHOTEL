/**
 * 
 */
package com.ingkarper.sishotel.negocio.util;

import java.util.Scanner;

/**
 * @author CPerez
 * Fecha: Mar 2, 2019
 * Clase que contendr� las operaciones utilitarias de lectura
 */
public class UtilLectura {
	
	private static Scanner lector;

	/**
	 * M�todo para leer desde el teclado
	 * @return
	 */
	public static String leerDesdeTeclado() {
		String valorALeer = null;
		lector = new Scanner(System.in);
		//Leyendo el valor ingresado en formato cadena
		valorALeer = lector.next();
		//TODO Cerrar el lector
		//lector.close();
		return valorALeer;
	}
	
}