/**
 * 
 */
package com.ingkarper.sishotel.modelo;

/**
 * @author CPerez
 * Fecha: Feb 24, 2019
 * Clase que representa
 */
public class Direccion {
	private int idDir;
	private Ciudad ciudad;
	private String callePrincipalDir;
	private String numeracionDir;
	private String calleSecundariaDir;
	private String referenciaDir;
	private boolean estadoDir;
	
	public Direccion() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param idDir
	 * @param ciudad
	 * @param callePrincipalDir
	 * @param numeracionDir
	 * @param calleSecundariaDir
	 * @param referenciaDir
	 * @param estadoDir
	 */
	public Direccion(int idDir, Ciudad ciudad, String callePrincipalDir, String numeracionDir,
			String calleSecundariaDir, String referenciaDir, boolean estadoDir) {
		super();
		this.idDir = idDir;
		this.ciudad = ciudad;
		this.callePrincipalDir = callePrincipalDir;
		this.numeracionDir = numeracionDir;
		this.calleSecundariaDir = calleSecundariaDir;
		this.referenciaDir = referenciaDir;
		this.estadoDir = estadoDir;
	}

	/**
	 * @return the idDir
	 */
	public int getIdDir() {
		return idDir;
	}

	/**
	 * @param idDir the idDir to set
	 */
	public void setIdDir(int idDir) {
		this.idDir = idDir;
	}

	/**
	 * @return the ciudad
	 */
	public Ciudad getCiudad() {
		return ciudad;
	}

	/**
	 * @param ciudad the ciudad to set
	 */
	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}

	/**
	 * @return the callePrincipalDir
	 */
	public String getCallePrincipalDir() {
		return callePrincipalDir;
	}

	/**
	 * @param callePrincipalDir the callePrincipalDir to set
	 */
	public void setCallePrincipalDir(String callePrincipalDir) {
		this.callePrincipalDir = callePrincipalDir;
	}

	/**
	 * @return the numeracionDir
	 */
	public String getNumeracionDir() {
		return numeracionDir;
	}

	/**
	 * @param numeracionDir the numeracionDir to set
	 */
	public void setNumeracionDir(String numeracionDir) {
		this.numeracionDir = numeracionDir;
	}

	/**
	 * @return the calleSecundariaDir
	 */
	public String getCalleSecundariaDir() {
		return calleSecundariaDir;
	}

	/**
	 * @param calleSecundariaDir the calleSecundariaDir to set
	 */
	public void setCalleSecundariaDir(String calleSecundariaDir) {
		this.calleSecundariaDir = calleSecundariaDir;
	}

	/**
	 * @return the referenciaDir
	 */
	public String getReferenciaDir() {
		return referenciaDir;
	}

	/**
	 * @param referenciaDir the referenciaDir to set
	 */
	public void setReferenciaDir(String referenciaDir) {
		this.referenciaDir = referenciaDir;
	}

	/**
	 * @return the estadoDir
	 */
	public boolean isEstadoDir() {
		return estadoDir;
	}

	/**
	 * @param estadoDir the estadoDir to set
	 */
	public void setEstadoDir(boolean estadoDir) {
		this.estadoDir = estadoDir;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Direccion [idDir=" + idDir + ", callePrincipalDir=" + callePrincipalDir + ", numeracionDir="
				+ numeracionDir + ", calleSecundariaDir=" + calleSecundariaDir + ", referenciaDir=" + referenciaDir
				+ "]";
	}

	
	
}


