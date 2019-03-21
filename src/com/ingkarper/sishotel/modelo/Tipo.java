/**
 * 
 */
package com.ingkarper.sishotel.modelo;

import java.util.Date;

/**
 * 
 * @author CPerez
 * Fecha: Feb 24, 2019
 * Clase que representa el tipo. Plantilla en la que se basa a mayoría de clases
 */
public class Tipo {
	private int idTip;
	private String nombreTip;
	private String descripcionTip;
	private boolean estadoTip;
	private Date fechaRegTip;
	private String usuarioRegTip;
	
	public Tipo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param idTip
	 * @param nombreTip
	 * @param descripcionTip
	 * @param estadoTip
	 * @param fechaRegTip
	 * @param usuarioRegTip
	 */
	public Tipo(int idTip, String nombreTip, String descripcionTip, boolean estadoTip, Date fechaRegTip,
			String usuarioRegTip) {
		super();
		this.idTip = idTip;
		this.nombreTip = nombreTip;
		this.descripcionTip = descripcionTip;
		this.estadoTip = estadoTip;
		this.fechaRegTip = fechaRegTip;
		this.usuarioRegTip = usuarioRegTip;
	}

	/**
	 * @param idTip
	 * @param nombreTip
	 * @param descripcionTip
	 * @param estadoTip
	 */
	public Tipo(int idTip, String nombreTip, String descripcionTip, boolean estadoTip) {
		super();
		this.idTip = idTip;
		this.nombreTip = nombreTip;
		this.descripcionTip = descripcionTip;
		this.estadoTip = estadoTip;
	}

	/**
	 * @param idTip
	 * @param nombreTip
	 * @param estadoTip
	 */
	public Tipo(int idTip, String nombreTip, boolean estadoTip) {
		super();
		this.idTip = idTip;
		this.nombreTip = nombreTip;
		this.estadoTip = estadoTip;
	}
	
	

	/**
	 * @param idTip
	 * @param nombreTip
	 * @param estadoTip
	 * @param fechaRegTip
	 * @param usuarioRegTip
	 */
	public Tipo(int idTip, String nombreTip, boolean estadoTip, Date fechaRegTip, String usuarioRegTip) {
		super();
		this.idTip = idTip;
		this.nombreTip = nombreTip;
		this.estadoTip = estadoTip;
		this.fechaRegTip = fechaRegTip;
		this.usuarioRegTip = usuarioRegTip;
	}

	/**
	 * @return the idTip
	 */
	public int getIdTip() {
		return idTip;
	}

	/**
	 * @param idTip the idTip to set
	 */
	public void setIdTip(int idTip) {
		this.idTip = idTip;
	}

	/**
	 * @return the nombreTip
	 */
	public String getNombreTip() {
		return nombreTip;
	}

	/**
	 * @param nombreTip the nombreTip to set
	 */
	public void setNombreTip(String nombreTip) {
		this.nombreTip = nombreTip;
	}

	/**
	 * @return the descripcionTip
	 */
	public String getDescripcionTip() {
		return descripcionTip;
	}

	/**
	 * @param descripcionTip the descripcionTip to set
	 */
	public void setDescripcionTip(String descripcionTip) {
		this.descripcionTip = descripcionTip;
	}

	/**
	 * @return the estadoTip
	 */
	public boolean isEstadoTip() {
		return estadoTip;
	}

	/**
	 * @param estadoTip the estadoTip to set
	 */
	public void setEstadoTip(boolean estadoTip) {
		this.estadoTip = estadoTip;
	}

	/**
	 * @return the fechaRegTip
	 */
	public Date getFechaRegTip() {
		return fechaRegTip;
	}

	/**
	 * @param fechaRegTip the fechaRegTip to set
	 */
	public void setFechaRegTip(Date fechaRegTip) {
		this.fechaRegTip = fechaRegTip;
	}

	/**
	 * @return the usuarioRegTip
	 */
	public String getUsuarioRegTip() {
		return usuarioRegTip;
	}

	/**
	 * @param usuarioRegTip the usuarioRegTip to set
	 */
	public void setUsuarioRegTip(String usuarioRegTip) {
		this.usuarioRegTip = usuarioRegTip;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "[id=" + idTip + ", Nombre=" + nombreTip + ", Descripción=" + descripcionTip + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idTip;
		result = prime * result + ((nombreTip == null) ? 0 : nombreTip.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tipo other = (Tipo) obj;
		if (idTip != other.idTip)
			return false;
		if (nombreTip == null) {
			if (other.nombreTip != null)
				return false;
		} else if (!nombreTip.equals(other.nombreTip))
			return false;
		return true;
	}


	
}
