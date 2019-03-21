/**
 * 
 */
package com.ingkarper.sishotel.negocio;

/**
 * @author CPerez
 * Fecha: Mar 3, 2019
 * Tipo de Clase que representa el contrato del negocio para las operaciones de la BD
 */
public interface ICrud {
	public String guardar(Object registro) throws Exception;
	
	public String actualizar(int id, Object registro) throws Exception;
	
	public String eliminar(int id) throws Exception;
	
	public Object[] listar() throws Exception;
	
	public Object consultarPorId(int id) throws Exception;

}
