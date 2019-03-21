/**
 * 
 */
package com.ingkarper.sishotel.modelo;

import java.util.Date;

/**
 * @author CPerez
 * Fecha: Feb 24, 2019
 * Clase que representa Ficha Laboral
 */
public class FichaLaboral {
	private int idFla;
	private Hotel hotel;
	private RolEmpleado rolempleado;
	private Empleado empleado;
	private Date fechaInicioFla;
	private Date fechaFinFla;
	private boolean estadofla;
	
	public FichaLaboral() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param idFla
	 * @param hotel
	 * @param rolempleado
	 * @param empleado
	 * @param fechaInicioFla
	 * @param fechaFinFla
	 * @param estadofla
	 */
	public FichaLaboral(int idFla, Hotel hotel, RolEmpleado rolempleado, Empleado empleado, Date fechaInicioFla,
			Date fechaFinFla, boolean estadofla) {
		super();
		this.idFla = idFla;
		this.hotel = hotel;
		this.rolempleado = rolempleado;
		this.empleado = empleado;
		this.fechaInicioFla = fechaInicioFla;
		this.fechaFinFla = fechaFinFla;
		this.estadofla = estadofla;
	}

	/**
	 * @return the idFla
	 */
	public int getIdFla() {
		return idFla;
	}

	/**
	 * @param idFla the idFla to set
	 */
	public void setIdFla(int idFla) {
		this.idFla = idFla;
	}

	/**
	 * @return the hotel
	 */
	public Hotel getHotel() {
		return hotel;
	}

	/**
	 * @param hotel the hotel to set
	 */
	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	/**
	 * @return the rolempleado
	 */
	public RolEmpleado getRolempleado() {
		return rolempleado;
	}

	/**
	 * @param rolempleado the rolempleado to set
	 */
	public void setRolempleado(RolEmpleado rolempleado) {
		this.rolempleado = rolempleado;
	}

	/**
	 * @return the empleado
	 */
	public Empleado getEmpleado() {
		return empleado;
	}

	/**
	 * @param empleado the empleado to set
	 */
	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	/**
	 * @return the fechaInicioFla
	 */
	public Date getFechaInicioFla() {
		return fechaInicioFla;
	}

	/**
	 * @param fechaInicioFla the fechaInicioFla to set
	 */
	public void setFechaInicioFla(Date fechaInicioFla) {
		this.fechaInicioFla = fechaInicioFla;
	}

	/**
	 * @return the fechaFinFla
	 */
	public Date getFechaFinFla() {
		return fechaFinFla;
	}

	/**
	 * @param fechaFinFla the fechaFinFla to set
	 */
	public void setFechaFinFla(Date fechaFinFla) {
		this.fechaFinFla = fechaFinFla;
	}

	/**
	 * @return the estadofla
	 */
	public boolean isEstadofla() {
		return estadofla;
	}

	/**
	 * @param estadofla the estadofla to set
	 */
	public void setEstadofla(boolean estadofla) {
		this.estadofla = estadofla;
	}	
}
