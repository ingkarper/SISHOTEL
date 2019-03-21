/**
 * 
 */
package com.ingkarper.sishotel.modelo;


/**
 * @author CPerez
 * Fecha: Feb 24, 2019
 * Clase que representa Hotel
 */
public class Hotel extends Tipo{
	private TipoIdentificacion tipoIdentificacion;
	private String identificacion;
	private Direccion direccion;
	private Contacto contacto[];
	
	public Hotel() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param tipoIdentificacion
	 * @param identificacion
	 * @param direccion
	 * @param contacto
	 */
	public Hotel(TipoIdentificacion tipoIdentificacion, String identificacion, Direccion direccion,
			Contacto[] contacto) {
		super();
		this.tipoIdentificacion = tipoIdentificacion;
		this.identificacion = identificacion;
		this.direccion = direccion;
		this.contacto = contacto;
	}

	/**
	 * @param idTip
	 * @param nombreTip
	 * @param descripcionTip
	 * @param estadoTip
	 */
	public Hotel(int idTip, String nombreTip, String descripcionTip, boolean estadoTip) {
		super(idTip, nombreTip, descripcionTip, estadoTip);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the tipoIdentificacion
	 */
	public TipoIdentificacion getTipoIdentificacion() {
		return tipoIdentificacion;
	}

	/**
	 * @param tipoIdentificacion the tipoIdentificacion to set
	 */
	public void setTipoIdentificacion(TipoIdentificacion tipoIdentificacion) {
		this.tipoIdentificacion = tipoIdentificacion;
	}

	/**
	 * @return the identificacion
	 */
	public String getIdentificacion() {
		return identificacion;
	}

	/**
	 * @param identificacion the identificacion to set
	 */
	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	/**
	 * @return the direccion
	 */
	public Direccion getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	/**
	 * @return the contacto
	 */
	public Contacto[] getContacto() {
		return contacto;
	}

	/**
	 * @param contacto the contacto to set
	 */
	public void setContacto(Contacto[] contacto) {
		this.contacto = contacto;
	}	
	
}
