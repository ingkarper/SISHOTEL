/**
 * 
 */
package com.ingkarper.sishotel.modelo;

import java.util.Date;

/**
 * @author CPerez Fecha: Feb 24, 2019 Clase que representa Cliente
 */
public class Cliente extends Persona {
	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param idPer
	 * @param tipoIdentificacion
	 * @param identificacionPer
	 * @param apellidoPaternoPer
	 * @param apellidoMaternoPer
	 * @param nombrePrincipalPer
	 * @param nombreSecundarioPer
	 * @param fechanacimiento
	 * @param estadocivil
	 * @param estadoPer
	 * @param direccion
	 * @param contacto
	 */
	public Cliente(int idPer, TipoIdentificacion tipoIdentificacion, String identificacionPer,
			String apellidoPaternoPer, String apellidoMaternoPer, String nombrePrincipalPer, String nombreSecundarioPer,
			Date fechanacimiento, EstadoCivil estadocivil, boolean estadoPer, Direccion direccion,
			Contacto[] contacto) {
		super(idPer, tipoIdentificacion, identificacionPer, apellidoPaternoPer, apellidoMaternoPer, nombrePrincipalPer,
				nombreSecundarioPer, fechanacimiento, estadocivil, estadoPer);
		// TODO Auto-generated constructor stub
	}

	
	
}
