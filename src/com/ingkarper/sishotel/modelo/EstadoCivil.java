/**
 * 
 */
package com.ingkarper.sishotel.modelo;

/**
 * @author CPerez Fecha: Feb 24, 2019 Clase que representa a los Estados Civiles (Casado, Soltero, Viudo )
 */
public class EstadoCivil extends Tipo {

	public EstadoCivil() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param idEstCiv
	 * @param nombreEstCiv
	 * @param descripcionEstCiv
	 * @param estadoEstCiv
	 */
	public EstadoCivil(int idEstCiv, String nombreEstCiv, String descripcionEstCiv, boolean estadoEstCiv) {
		super(idEstCiv, nombreEstCiv, descripcionEstCiv,  estadoEstCiv);	
	}

}
