/**
 * 
 */
package com.ingkarper.sishotel.modelo;

import java.math.BigDecimal;

/**
 * @author CPerez
 * Fecha: Feb 24, 2019
 * Clase que representa Roles de Empleados Gerente / Jefe / Supervisor
 */
public class RolEmpleado extends Tipo{
	private BigDecimal salarioRem;
	private Empleado reportaRem;
	private Perfil perfil;
	
	public RolEmpleado() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param salarioRem
	 * @param reportaRem
	 * @param perfil
	 */
	public RolEmpleado(BigDecimal salarioRem, Empleado reportaRem, Perfil perfil) {
		super();
		this.salarioRem = salarioRem;
		this.reportaRem = reportaRem;
		this.setPerfil(perfil);
	}

	/**
	 * @param idTip
	 * @param nombreTip
	 * @param descripcionTip
	 * @param estadoTip
	 */
	public RolEmpleado(int idTip, String nombreTip, String descripcionTip, boolean estadoTip) {
		super(idTip, nombreTip, descripcionTip, estadoTip);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the salarioRem
	 */
	public BigDecimal getSalarioRem() {
		return salarioRem;
	}

	/**
	 * @param salarioRem the salarioRem to set
	 */
	public void setSalarioRem(BigDecimal salarioRem) {
		this.salarioRem = salarioRem;
	}

	/**
	 * @return the reportaRem
	 */
	public Empleado getReportaRem() {
		return reportaRem;
	}

	/**
	 * @param reportaRem the reportaRem to set
	 */
	public void setReportaRem(Empleado reportaRem) {
		this.reportaRem = reportaRem;
	}

	/**
	 * @return the perfil
	 */
	public Perfil getPerfil() {
		return perfil;
	}

	/**
	 * @param perfil the perfil to set
	 */
	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "RolEmpleado [salarioRem=" + salarioRem + ", reportaRem=" + reportaRem + ", perfil=" + perfil + "]";
	}

	

}
