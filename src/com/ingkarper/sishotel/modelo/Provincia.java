/**
 * 
 */
package com.ingkarper.sishotel.modelo;

/**
 * @author CPerez
 * Fecha: Feb 24, 2019
 * Clase que representa a las Provincias o Estados
 */
public class Provincia extends Tipo{
	private Pais pais;
	private Ciudad [] ciudades;
	public Provincia() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param idPro
	 * @param nombrePro
	 * @param descripcionPro
	 * @param estadoPro
	 * @param paisPro
	 */
	
	public Provincia(int idPro, String nombrePro, String descripcionPro , boolean estadoPro, Pais pais) {
		super(idPro, nombrePro, descripcionPro ,estadoPro);
		this.pais = pais;
	}
	/**
	 * @param pais
	 */
	public Provincia(Pais pais) {
		super();
		this.pais = pais;
	}
	/**
	 * @return the pais
	 */
	public Pais getPais() {
		return pais;
	}
	/**
	 * @param pais the pais to set
	 */
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Provincia [ID: " + getIdTip() + ", Nombre: " + getNombreTip()
				+ ", Descripción: " + getDescripcionTip() + " " + pais + "]";
	}
	
		
	
}
