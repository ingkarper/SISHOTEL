/**
 * 
 */
package com.ingkarper.sishotel.modelo;

/**
 * @author CPerez
 * Fecha: Feb 24, 2019
 * Clase que representa Tipo de Identificaci�n que puede tener una identificaci�n (C�dula, Ruc, Pasaporte)
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
