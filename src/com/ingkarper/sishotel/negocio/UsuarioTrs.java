/**
 * 
 */
package com.ingkarper.sishotel.negocio;

import com.ingkarper.sishotel.modelo.MemoriaBD;
import com.ingkarper.sishotel.modelo.Usuario;

/**
 * @author CPerez
 * Fecha: Mar 2, 2019
 *  * Clase que tendrá las operaciones del negocio relacionadas con el Usuario
 */
public class UsuarioTrs implements ICrud {
	/**
	 * Método para validar el usuario a través del usuario y contraseña
	 * @param usuario
	 * @param clave
	 * @return
	 */
	public Usuario validarUsuario (String usuario, String clave) {
		Usuario usuarioRec = null;
		
		for (Usuario alias : MemoriaBD.usuarios) {
			if (alias != null && alias.getUserIdUsu().equals(usuario) && alias.getPasswordUsu().equals(clave)) {
				usuarioRec = alias;
				break;
			}
		}
		
		return usuarioRec;
	}

	@Override
	public String guardar(Object registro) {
		if (registro != null) {
			MemoriaBD.usuarios[0] = (Usuario) registro;
			return "Datos almacenados correctamente!!!";
		}else {
			return "Debe llenar todos los datos!!!";
		}

	}

	@Override
	public String actualizar(int id, Object registro) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String eliminar(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] listar() {
		return MemoriaBD.usuarios;
	}

	@Override
	public Object[] consultarPorId(int id) {
		// TODO Auto-generated method stub
		return null;
	}
}
