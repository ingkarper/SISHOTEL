/**
 * 
 */
package com.ingkarper.sishotel.modelo;

/**
 * @author CPerez
 * Fecha: Feb 24, 2019
 * Clase que representa a los empelados con sus respectivos usuarios de ingreso al sistema
 */
public class Usuario{
	private Persona persona;
	private String userIdUsu;
	private String passwordUsu;
	private boolean cambioPasswordUsu;
	private RolEmpleado rolEmpleado;

	public Usuario() {
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * @param userIdUsu
	 * @param passwordUsu
	 * @param cambioPasswordUsu
	 * @param rolEmpleado
	 */
	public Usuario(String userIdUsu, String passwordUsu, boolean cambioPasswordUsu, RolEmpleado rolEmpleado) {
		super();
		this.userIdUsu = userIdUsu;
		this.passwordUsu = passwordUsu;
		this.cambioPasswordUsu = cambioPasswordUsu;
		this.rolEmpleado = rolEmpleado;
	}


	/**
	 * @param persona 
	 * @param useridUsu
	 * @param passwordUsu
	 * @param cambioPasswordUsu
	 * @param rolEmpleado
	 */
	public Usuario(Persona persona, String userIdUsu ,String passwordUsu, boolean cambioPasswordUsu, RolEmpleado rolEmleado) {
		super();
		this.setPersona(persona);
		this.userIdUsu = userIdUsu;
		this.passwordUsu = passwordUsu;
		this.cambioPasswordUsu = cambioPasswordUsu;
		this.rolEmpleado = rolEmleado;
	}


	/**
	 * @return the passwordUsu
	 */
	public String getPasswordUsu() {
		return passwordUsu;
	}


	/**
	 * @param passwordUsu the passwordUsu to set
	 */
	public void setPasswordUsu(String passwordUsu) {
		this.passwordUsu = passwordUsu;
	}


	/**
	 * @return the cambioPasswordUsu
	 */
	public boolean isCambioPasswordUsu() {
		return cambioPasswordUsu;
	}


	/**
	 * @param cambioPasswordUsu the cambioPasswordUsu to set
	 */
	public void setCambioPasswordUsu(boolean cambioPasswordUsu) {
		this.cambioPasswordUsu = cambioPasswordUsu;
	}



	/**
	 * @return the rolEmpleado
	 */
	public RolEmpleado getRolEmpleado() {
		return rolEmpleado;
	}


	/**
	 * @param rolEmpleado the rolEmpleado to set
	 */
	public void setRolEmpleado(RolEmpleado rolEmpleado) {
		this.rolEmpleado = rolEmpleado;
	}


	/**
	 * @return the userIdUsu
	 */
	public String getUserIdUsu() {
		return userIdUsu;
	}


	/**
	 * @param usuario the userIdUsu to set
	 */
	public void setUserIdUsu(String userIdUsu) {
		this.userIdUsu = userIdUsu;
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


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Usuario [persona=" + persona + ", userIdUsu=" + userIdUsu + ", passwordUsu=" + passwordUsu
				+ ", cambioPasswordUsu=" + cambioPasswordUsu + "]";
	}

	
	
}
