/**
 * 
 */
package com.ingkarper.sishotel.modelo;

/**
 * @author CPerez Fecha: Feb 24, 2019 Clase que representa a los Paises 
 */
public class Pais extends Tipo {
	
	private Provincia provincias[]; 
	public Pais() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param idPais
	 * @param nombrePais
	 * @param descripcionPais
	 * @param estadoPais
	 */
	public Pais(int idPais, String nombrePais,String descripcionPais, boolean estadoPais) {
		super(idPais, nombrePais, descripcionPais, estadoPais);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Pais [Id: " + getIdTip() + ", Nombre: " + getNombreTip() + ", Descripcion: "
				+ getDescripcionTip() + "]";
	}
	
}
