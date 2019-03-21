/**
 * 
 */
package com.ingkarper.sishotel.modelo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.ingkarper.sishotel.negocio.PersonaTrs;

/**
 * @author CPerez Fecha: Feb 24, 2019 Clase que representa a las Personas que se registran en el hotel sean clientes o empleados 
 */
public class Persona {
	private int idPer;
	private TipoIdentificacion tipoIdentificacion;
	private String identificacionPer;
	private String apellidoPaternoPer;
	private String apellidoMaternoPer;
	private String nombrePrincipalPer;
	private String nombreSecundarioPer;
	private Date fechanacimiento;
	private EstadoCivil estadocivil;
	private boolean estadoPer;
	private SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");;
	
	public Persona() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param idPer
	 * @param tipoIdentificacion
	 * @param identificacionPer
	 * @param apellidoPaternoPer
	 * @param apellidoMaternoPer
	 * @param nombrePrincipalPer
	 * @param nombreSecundarioPer
	 * @param fechanacimiento
	 * @param estadocivil
	 * @param estadoPer
	 * @param direccion
	 * @param contacto
	 */
	
	public Persona(int idPer, TipoIdentificacion tipoIdentificacion, String identificacionPer,
			String apellidoPaternoPer, String apellidoMaternoPer, String nombrePrincipalPer, String nombreSecundarioPer,
			Date fechanacimiento,EstadoCivil estadocivil, boolean estadoPer) {
		super();
		this.idPer = idPer;
		this.tipoIdentificacion = tipoIdentificacion;
		this.identificacionPer = identificacionPer;
		this.apellidoPaternoPer = apellidoPaternoPer;
		this.apellidoMaternoPer = apellidoMaternoPer;
		this.nombrePrincipalPer = nombrePrincipalPer;
		this.nombreSecundarioPer = nombreSecundarioPer;
		this.fechanacimiento = fechanacimiento;
		this.estadocivil = estadocivil;
		this.estadoPer = estadoPer;
	}

	/**
	 * @return the idPer
	 */
	public int getIdPer() {
		return idPer;
	}

	/**
	 * @param idPer the idPer to set
	 */
	public void setIdPer(int idPer) {
		this.idPer = idPer;
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
	 * @return the identificacionPer
	 */
	public String getIdentificacionPer() {
		return identificacionPer;
	}

	/**
	 * @param identificacionPer the identificacionPer to set
	 */
	public void setIdentificacionPer(String identificacionPer) {
		this.identificacionPer = identificacionPer;
	}

	/**
	 * @return the apellidoPaternoPer
	 */
	public String getApellidoPaternoPer() {
		return apellidoPaternoPer;
	}

	/**
	 * @param apellidoPaternoPer the apellidoPaternoPer to set
	 */
	public void setApellidoPaternoPer(String apellidoPaternoPer) {
		this.apellidoPaternoPer = apellidoPaternoPer;
	}

	/**
	 * @return the apellidoMaternoPer
	 */
	public String getApellidoMaternoPer() {
		return apellidoMaternoPer;
	}

	/**
	 * @param apellidoMaternoPer the apellidoMaternoPer to set
	 */
	public void setApellidoMaternoPer(String apellidoMaternoPer) {
		this.apellidoMaternoPer = apellidoMaternoPer;
	}

	/**
	 * @return the nombrePrincipalPer
	 */
	public String getNombrePrincipalPer() {
		return nombrePrincipalPer;
	}

	/**
	 * @param nombrePrincipalPer the nombrePrincipalPer to set
	 */
	public void setNombrePrincipalPer(String nombrePrincipalPer) {
		this.nombrePrincipalPer = nombrePrincipalPer;
	}

	/**
	 * @return the nombreSecundarioPer
	 */
	public String getNombreSecundarioPer() {
		return nombreSecundarioPer;
	}

	/**
	 * @param nombreSecundarioPer the nombreSecundarioPer to set
	 */
	public void setNombreSecundarioPer(String nombreSecundarioPer) {
		this.nombreSecundarioPer = nombreSecundarioPer;
	}

	/**
	 * @return the fechanacimiento
	 */
	public Date getFechanacimiento() {
		return fechanacimiento;
	}

	/**
	 * @param fechanacimiento the fechanacimiento to set
	 */
	public void setFechanacimiento(Date fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}

	/**
	 * @return the estadocivil
	 */
	public EstadoCivil getEstadocivil() {
		return estadocivil;
	}

	/**
	 * @param estadocivil the estadocivil to set
	 */
	public void setEstadocivil(EstadoCivil estadocivil) {
		this.estadocivil = estadocivil;
	}

	/**
	 * @return the estadoPer
	 */
	public boolean isEstadoPer() {
		return estadoPer;
	}

	/**
	 * @param estadoPer the estadoPer to set
	 */
	public void setEstadoPer(boolean estadoPer) {
		this.estadoPer = estadoPer;
	}

	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idPer;
		result = prime * result + ((identificacionPer == null) ? 0 : identificacionPer.hashCode());
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
		Persona other = (Persona) obj;
		if (idPer != other.idPer)
			return false;
		if (identificacionPer == null) {
			if (other.identificacionPer != null)
				return false;
		} else if (!identificacionPer.equals(other.identificacionPer))
			return false;
		return true;
	}

	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		PersonaTrs adminPer = new PersonaTrs();
		Calendar calendarA = Calendar.getInstance();
		int edad = 0;
		calendarA.setTime(fechanacimiento);
		edad = adminPer.calculaEdadv2(calendarA);
		//calendarA.setTime(fechaNacimiento);
		//int edad = adminPer.calculaEdad(fechanacimiento);

		return "Persona [Id: " + idPer + " " + tipoIdentificacion +", Identificación: " + identificacionPer + ", Apellido Paterno: "
				+ apellidoPaternoPer + ", Apellido Materno: " + apellidoMaternoPer + ", Primer Nombre: "
				+ nombrePrincipalPer + ", Segundo Nombre: " + nombreSecundarioPer + ", Fecha Nacimiento: "
				+ formatoFecha.format(fechanacimiento) + " Edad:" + edad + estadocivil+ "]";
	}

	
	
	
}
