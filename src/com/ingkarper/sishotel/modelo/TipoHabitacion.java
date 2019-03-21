/**
 * 
 */
package com.ingkarper.sishotel.modelo;

import com.sun.prism.Image;

/**
 * @author CPerez
 * Fecha: Feb 24, 2019
 * Clase que representa Tipo Habitación
 */
public class TipoHabitacion extends Tipo{
	private Image foto;
	public TipoHabitacion() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param foto
	 */
	public TipoHabitacion(Image foto) {
		super();
		this.foto = foto;
	}
	/**
	 * @param idTip
	 * @param nombreTip
	 * @param descripcionTip
	 * @param estadoTip
	 */
	public TipoHabitacion(int idTip, String nombreTip, String descripcionTip, boolean estadoTip) {
		super(idTip, nombreTip, descripcionTip, estadoTip);
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the foto
	 */
	public Image getFoto() {
		return foto;
	}
	/**
	 * @param foto the foto to set
	 */
	public void setFoto(Image foto) {
		this.foto = foto;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "TipoHabitacion [foto=" + foto + "]";
	}
	
	
	
	
}
