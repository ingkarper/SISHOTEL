/**
 * 
 */
package com.ingkarper.sishotel.modelo;

import java.util.Date;

/**
 * @author CPerez
 * Fecha: Feb 24, 2019
 * Clase que representa el perfil de usuario / Administrador - Recepcionista - Usuario, etc
 */
public class Perfil extends Tipo {
	public Perfil() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param idTip
	 * @param nombreTip
	 * @param descripcionTip
	 * @param estadoTip
	 * @param fechaRegTip
	 * @param usuarioRegTip
	 */
	public Perfil(int idTip, String nombreTip, String descripcionTip, boolean estadoTip, Date fechaRegTip,
			String usuarioRegTip) {
		super(idTip, nombreTip, descripcionTip, estadoTip, fechaRegTip, usuarioRegTip);
		// TODO Auto-generated constructor stub
	}

	
}
