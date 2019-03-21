/**
 * 
 */
package com.ingkarper.sishotel.modelo;

import java.util.Date;

import com.sun.prism.Image;

/**
 * @author CPerez
 * Fecha: Feb 24, 2019
 * Clase que representa Empleado
 */
public class Empleado extends Persona{
	private Image fotoEmp;
	private String Referencias[];
	
	public Empleado() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param fotoEmp
	 * @param referencias
	 */
	public Empleado(Image fotoEmp, String[] referencias) {
		super();
		this.fotoEmp = fotoEmp;
		Referencias = referencias;
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
	public Empleado(int idPer, TipoIdentificacion tipoIdentificacion, String identificacionPer,
			String apellidoPaternoPer, String apellidoMaternoPer, String nombrePrincipalPer, String nombreSecundarioPer,
			Date fechanacimiento, EstadoCivil estadocivil, boolean estadoPer, Direccion direccion,
			Contacto[] contacto) {
		super(idPer, tipoIdentificacion, identificacionPer, apellidoPaternoPer, apellidoMaternoPer, nombrePrincipalPer,
				nombreSecundarioPer, fechanacimiento, estadocivil, estadoPer);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the fotoEmp
	 */
	public Image getFotoEmp() {
		return fotoEmp;
	}

	/**
	 * @param fotoEmp the fotoEmp to set
	 */
	public void setFotoEmp(Image fotoEmp) {
		this.fotoEmp = fotoEmp;
	}

	/**
	 * @return the referencias
	 */
	public String[] getReferencias() {
		return Referencias;
	}

	/**
	 * @param referencias the referencias to set
	 */
	public void setReferencias(String[] referencias) {
		Referencias = referencias;
	}

}
