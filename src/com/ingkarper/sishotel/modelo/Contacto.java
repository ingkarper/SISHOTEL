/**
 * 
 */
package com.ingkarper.sishotel.modelo;

/**
 * @author CPerez
 * Fecha: Feb 24, 2019
 * Clase que representa
 */
public class Contacto {
	private int idCon;
	private TipoContacto tipocontacto;
	private boolean estadoCon;
	
	public Contacto() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param idCon
	 * @param tipocontacto
	 * @param estadoCon
	 */
	public Contacto(int idCon, TipoContacto tipocontacto, boolean estadoCon) {
		super();
		this.idCon = idCon;
		this.tipocontacto = tipocontacto;
		this.estadoCon = estadoCon;
	}

	/**
	 * @return the idCon
	 */
	public int getIdCon() {
		return idCon;
	}

	/**
	 * @param idCon the idCon to set
	 */
	public void setIdCon(int idCon) {
		this.idCon = idCon;
	}

	/**
	 * @return the tipocontacto
	 */
	public TipoContacto getTipocontacto() {
		return tipocontacto;
	}

	/**
	 * @param tipocontacto the tipocontacto to set
	 */
	public void setTipocontacto(TipoContacto tipocontacto) {
		this.tipocontacto = tipocontacto;
	}

	/**
	 * @return the estadoCon
	 */
	public boolean isEstadoCon() {
		return estadoCon;
	}

	/**
	 * @param estadoCon the estadoCon to set
	 */
	public void setEstadoCon(boolean estadoCon) {
		this.estadoCon = estadoCon;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Contacto [idCon=" + idCon + ", tipocontacto=" + tipocontacto + "]";
	}

	
	
}
