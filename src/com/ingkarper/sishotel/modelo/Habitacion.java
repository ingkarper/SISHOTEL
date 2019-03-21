/**
 * 
 */
package com.ingkarper.sishotel.modelo;

/**
 * @author CPerez Fecha: Feb 24, 2019 Clase que representa la habitación
 */
public class Habitacion {
	private int id_hab;
	private TipoHabitacion tipohabitacion;
	private PisoHabitacion pisoHabitacion;
	private EstadoHabitacion estadohabitacion;

	public Habitacion() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id_hab
	 * @param tipohabitacion
	 * @param pisoHabitacion
	 * @param estadohabitacion
	 */
	public Habitacion(int id_hab, TipoHabitacion tipohabitacion, PisoHabitacion pisoHabitacion,
			EstadoHabitacion estadohabitacion) {
		super();
		this.id_hab = id_hab;
		this.tipohabitacion = tipohabitacion;
		this.pisoHabitacion = pisoHabitacion;
		this.estadohabitacion = estadohabitacion;
	}

	/**
	 * @return the id_hab
	 */
	public int getId_hab() {
		return id_hab;
	}

	/**
	 * @param id_hab the id_hab to set
	 */
	public void setId_hab(int id_hab) {
		this.id_hab = id_hab;
	}

	/**
	 * @return the tipohabitacion
	 */
	public TipoHabitacion getTipohabitacion() {
		return tipohabitacion;
	}

	/**
	 * @param tipohabitacion the tipohabitacion to set
	 */
	public void setTipohabitacion(TipoHabitacion tipohabitacion) {
		this.tipohabitacion = tipohabitacion;
	}

	/**
	 * @return the pisoHabitacion
	 */
	public PisoHabitacion getPisoHabitacion() {
		return pisoHabitacion;
	}

	/**
	 * @param pisoHabitacion the pisoHabitacion to set
	 */
	public void setPisoHabitacion(PisoHabitacion pisoHabitacion) {
		this.pisoHabitacion = pisoHabitacion;
	}

	/**
	 * @return the estadohabitacion
	 */
	public EstadoHabitacion getEstadohabitacion() {
		return estadohabitacion;
	}

	/**
	 * @param estadohabitacion the estadohabitacion to set
	 */
	public void setEstadohabitacion(EstadoHabitacion estadohabitacion) {
		this.estadohabitacion = estadohabitacion;
	}
	

}
