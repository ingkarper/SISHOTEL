/**
 * 
 */
package com.ingkarper.sishotel.modelo;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author CPerez
 * Fecha: Feb 24, 2019
 * Clase que representa accionistas
 */
public class Accionista {
	private int idAcc;
	private Hotel hotel;
	private Persona persona;
	private BigDecimal porcenatjeAccionesAcc;
	private BigDecimal montoAccionAcc;
	private Date fechaInicioAcc;
	private Date fechaFinAcc;
	private boolean estadoAcc;
	
	public Accionista() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param idAcc
	 * @param hotel
	 * @param persona
	 * @param porcenatjeAccionesAcc
	 * @param montoAccionAcc
	 * @param fechaInicioAcc
	 * @param fechaFinAcc
	 * @param estadoAcc
	 */
	public Accionista(int idAcc, Hotel hotel, Persona persona, BigDecimal porcenatjeAccionesAcc,
			BigDecimal montoAccionAcc, Date fechaInicioAcc, Date fechaFinAcc, boolean estadoAcc) {
		super();
		this.idAcc = idAcc;
		this.hotel = hotel;
		this.persona = persona;
		this.porcenatjeAccionesAcc = porcenatjeAccionesAcc;
		this.montoAccionAcc = montoAccionAcc;
		this.fechaInicioAcc = fechaInicioAcc;
		this.fechaFinAcc = fechaFinAcc;
		this.estadoAcc = estadoAcc;
	}

	/**
	 * @return the idAcc
	 */
	public int getIdAcc() {
		return idAcc;
	}

	/**
	 * @param idAcc the idAcc to set
	 */
	public void setIdAcc(int idAcc) {
		this.idAcc = idAcc;
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
	 * @return the persona
	 */
	public Persona getPersona() {
		return persona;
	}

	/**
	 * @param persona the persona to set
	 */
	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	/**
	 * @return the porcenatjeAccionesAcc
	 */
	public BigDecimal getPorcenatjeAccionesAcc() {
		return porcenatjeAccionesAcc;
	}

	/**
	 * @param porcenatjeAccionesAcc the porcenatjeAccionesAcc to set
	 */
	public void setPorcenatjeAccionesAcc(BigDecimal porcenatjeAccionesAcc) {
		this.porcenatjeAccionesAcc = porcenatjeAccionesAcc;
	}

	/**
	 * @return the montoAccionAcc
	 */
	public BigDecimal getMontoAccionAcc() {
		return montoAccionAcc;
	}

	/**
	 * @param montoAccionAcc the montoAccionAcc to set
	 */
	public void setMontoAccionAcc(BigDecimal montoAccionAcc) {
		this.montoAccionAcc = montoAccionAcc;
	}

	/**
	 * @return the fechaInicioAcc
	 */
	public Date getFechaInicioAcc() {
		return fechaInicioAcc;
	}

	/**
	 * @param fechaInicioAcc the fechaInicioAcc to set
	 */
	public void setFechaInicioAcc(Date fechaInicioAcc) {
		this.fechaInicioAcc = fechaInicioAcc;
	}

	/**
	 * @return the fechaFinAcc
	 */
	public Date getFechaFinAcc() {
		return fechaFinAcc;
	}

	/**
	 * @param fechaFinAcc the fechaFinAcc to set
	 */
	public void setFechaFinAcc(Date fechaFinAcc) {
		this.fechaFinAcc = fechaFinAcc;
	}

	/**
	 * @return the estadoAcc
	 */
	public boolean isEstadoAcc() {
		return estadoAcc;
	}

	/**
	 * @param estadoAcc the estadoAcc to set
	 */
	public void setEstadoAcc(boolean estadoAcc) {
		this.estadoAcc = estadoAcc;
	}

	
}
