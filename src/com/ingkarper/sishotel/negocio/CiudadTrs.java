/**
 * 
 */
package com.ingkarper.sishotel.negocio;

import java.util.List;

import com.ingkarper.sishotel.modelo.Ciudad;
import com.ingkarper.sishotel.modelo.MemoriaBD;

/**
 * @author CPerez Fecha: Mar 2, 2019 Clase que tendrá las operaciones del
 *         negocio relacionadas con la ciudad
 */
public class CiudadTrs implements ICrudC {

	@Override
	public String guardar(Object registro) throws Exception {
		//Verifica que el objeto no este nulo
		if (registro != null) {
			//Si se inserta los registros devuleve true
			boolean banIng = MemoriaBD.ciudades.add((Ciudad) registro);
			if (banIng) {
				return "Datos Ingresados correctamente...";
			} else {
				//Valor duplicado
				return "El registro ya se encuentra ingresado!!!";
			}
		} else {
			return "Debe llenar todos los datos!!!";
		}
	}

	@Override
	public String actualizar(Object registro) throws Exception {
		//Verificar si se encuentra el nulo
		if (registro != null) {
			//Recupera la última posición del objeto envoado 
			int pos = MemoriaBD.ciudades.lastIndexOf(registro);
			//Si la posición es mayor que cero encontró
			if (pos >= 0) {
				//Reemplazar el objeto
				MemoriaBD.ciudades.set(pos, (Ciudad) registro);
				return "Datos Actualizados correctamente...";
			} else {
				return "No se encuentran datos ingresados";
			}
		} else {
			return "Debe ingresar todos los datos!!!";
		}

	}

	@Override
	public String eliminar(Object registro) throws Exception {
		
		if (registro != null) {
			int pos = MemoriaBD.ciudades.lastIndexOf(registro);
			if (pos >= 0) {
				MemoriaBD.ciudades.remove(pos);
				return "Datos Eliminados correctamente";
			} else {
				return "No se encuentran datos ingresados";
			}
		} else {
			return "Debe ingresar todos los datos!!!";
		}
	}

	@Override
	public List<?> consultarTodos() throws Exception {
		return MemoriaBD.ciudades;
	}

	@Override
	public Object consultaPorId(int id) throws Exception {
		Ciudad ciudadEnc = null;
		for (Ciudad ciudadTmp : MemoriaBD.ciudades) {
			if (ciudadTmp.getIdTip() == id) {
				ciudadEnc = ciudadTmp;
			}
		}
		return ciudadEnc;
	}

}
