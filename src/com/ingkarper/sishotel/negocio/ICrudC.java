/**
 * 
 */
package com.ingkarper.sishotel.negocio;

import java.util.List;

/**
 * @author CPerez
 * Fecha: Mar 17, 2019
 * Interface para definir los m�todos CRUD utilizando Collections
 */
public interface ICrudC {
	/**
	 * Definici�n de m�todo para guardar
	 * @param registro
	 * @return
	 */
	public String guardar(Object registro) throws Exception;
	/**
	 * Definici�n de m�todo para actualizar
	 * @param registro
	 * @return
	 */
	public String actualizar(Object registro) throws Exception;
	
	/**
	 * Definici�n de m�todo para eliminar
	 * @param registro
	 * @return
	 */
	public String eliminar(Object registro) throws Exception;
	/**
	 * Definici�n de m�todo para consultar
	 * @return
	 */
	/*
	 * Con el wildcard ? se devuelve cualquier lista de objetos de alg�n tipo
	 */
	public List<?> consultarTodos() throws Exception;
	
	/**
	 * Definici�n de m�todo para conusltar por la identificaci�n
	 */
	public Object consultaPorId (int id) throws Exception;
}
