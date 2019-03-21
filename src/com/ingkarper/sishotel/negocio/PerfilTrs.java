/**
 * 
 */
package com.ingkarper.sishotel.negocio;

import com.ingkarper.sishotel.modelo.MemoriaBD;
import com.ingkarper.sishotel.modelo.Perfil;

/**
 * @author CPerez
 * Fecha: Mar 2, 2019
 * Clase que tendrá las operaciones del negocio relacionadas con el Perfil
 */
public class PerfilTrs implements ICrud {

	@Override
	public String guardar(Object registro) {
		if (registro != null) {
			MemoriaBD.perfiles[0] = (Perfil) registro;
			return "Datos almacenados correctamente...";
		}else {
			return "Debe llenar los datos!!!";
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
		return MemoriaBD.perfiles;
	}

	@Override
	public Object[] consultarPorId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
