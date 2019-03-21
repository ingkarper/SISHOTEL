/**
 * 
 */
package com.ingkarper.sishotel.negocio;

import java.util.List;

/**
 * @author CPerez
 * Fecha: Mar 17, 2019
 * Interface para definir los métodos CRUD utilizando Collections
 */
public interface ICrudC {
	/**
	 * Definición de método para guardar
	 * @param registro
	 * @return
	 */
	public String guardar(Object registro) throws Exception;
	/**
	 * Definición de método para actualizar
	 * @param registro
	 * @return
	 */
	public String actualizar(Object registro) throws Exception;
	
	/**
	 * Definición de método para eliminar
	 * @param registro
	 * @return
	 */
	public String eliminar(Object registro) throws Exception;
	/**
	 * Definición de método para consultar
	 * @return
	 */
	/*
	 * Con el wildcard ? se devuelve cualquier lista de objetos de algún tipo
	 */
	public List<?> consultarTodos() throws Exception;
	
	/**
	 * Definición de método para conusltar por la identificación
	 */
	public Object consultaPorId (int id) throws Exception;
}
