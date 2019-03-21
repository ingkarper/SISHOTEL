/**
 * 
 */
package com.ingkarper.sishotel.modelo;

/**
 * @author CPerez
 * Fecha: Feb 24, 2019
 * Clase que representa a las ciudades
 */
public class Ciudad extends Tipo{
	private Provincia provincia;
	
	public Ciudad() {
		// TODO Auto-generated constructor stub
	}

	
	/**
	 * @param provincia
	 */
	public Ciudad(Provincia provincia) {
		super();
		this.provincia = provincia;
	}

	/**
	 * @param idCiu
	 * @param nombreCiu
	 * @param descripcionCiu
	 * @param estadoCiu
	 * @param provincia
	 */
	public Ciudad(int idCiu, String nombreCiu, String descripcionCiu, boolean estadoCiu, Provincia provincia) {
		super(idCiu, nombreCiu, descripcionCiu,estadoCiu);
		this.provincia = provincia;
	}

	/**
	 * @return the provincia
	 */
	public Provincia getProvincia() {
		return provincia;
	}

	/**
	 * @param provincia the provincia to set
	 */
	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Ciudad [Id: " + getIdTip() + ", Nombre: " + getNombreTip()
				+ ", Descripcion: " + getDescripcionTip() + " " + provincia + "]";
	}
	
	
}
