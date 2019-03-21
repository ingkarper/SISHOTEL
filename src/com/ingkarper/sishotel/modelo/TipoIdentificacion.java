/**
 * 
 */
package com.ingkarper.sishotel.modelo;

/**
 * @author CPerez
 * Fecha: Feb 24, 2019
 * Clase que representa Tipo de Identificación que puede tener una identificación (Cédula, Ruc, Pasaporte)
 */
public class TipoIdentificacion extends Tipo{
	public TipoIdentificacion() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param idTipIden
	 * @param nombreTipIden
	 * @param descripcionTipIden
	 * @param estadoTipIden
	 */
	public TipoIdentificacion(int idTipIden, String nombreTipIden, String descripcionTipIden, boolean estadoTipIden) {
		super(idTipIden, nombreTipIden, descripcionTipIden, estadoTipIden);
		// TODO Auto-generated constructor stub
	}

}
