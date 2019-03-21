/**
 * 
 */
package com.ingkarper.sishotel.negocio;

import com.ingkarper.sishotel.modelo.MemoriaBD;
import com.ingkarper.sishotel.modelo.Provincia;

/**
 * @author CPerez Fecha: Mar 2, 2019 Clase que tendrá las operaciones del
 *         negocio relacionadas con la Provincia
 */
public class ProvinciaTrs implements ICrud {

	@Override
	public String guardar(Object registro) {
		boolean banIns = false;
		int posInt = 0;
		if (registro != null) {
			for (int i = 0; i < MemoriaBD.provincias.length; i++) {
				if (MemoriaBD.provincias[i] == null) {
					banIns = true;
					posInt = i;
					break;
				}
			}
			if (banIns) {
				MemoriaBD.provincias[posInt] = (Provincia) registro;
				return "Datos Ingresados correctamente...";
			} else {
				return "El tamaño máximo permitido superado para la versión demo!!!";
			}
		} else {
			return "Debe llenar todos los datos!!!";
		}

	}

	@Override
	public String actualizar(int id, Object registro) {
		boolean banAlm = false;
		int posAlm = 0;
		if (registro != null) {
			for (int i = 0; i < MemoriaBD.provincias.length; i++) {
				if (MemoriaBD.provincias[i].getIdTip() == id) {
					banAlm = true;
					posAlm = i;
					break;
				}
			}
			if (banAlm) {
				MemoriaBD.provincias[posAlm] = (Provincia) registro;
				return "Datos almacenados correctamente...";
			} else {
				return "El tamaño máximo permitido superado para la versión demo!!!";
			}
		} else {
			return "Debe llenar todos los datos!!!";
		}
	}

	@Override
	public String eliminar(int id) {
		boolean banEli = false;
		int posEli = 0;
		for (int i = 0; i < MemoriaBD.provincias.length; i++) {
			if (MemoriaBD.provincias[i].getIdTip() == id) {
				banEli = true;
				posEli = i;
				break;
			}
		}
		if (banEli) {
			MemoriaBD.provincias[posEli] = null;
			return "Datos Eliminados correctamente...";
		} else {
			return "El tamaño máximo permitido superado para la versión demo!!!";
		}
	}

	@Override
	public Object[] listar() {
		return MemoriaBD.provincias;
	}

	@Override
	public Object consultarPorId(int id) throws Exception{
		Provincia proLis = null;
		try {
			for (int i = 0; i < MemoriaBD.provincias.length; i++) {
				if (MemoriaBD.provincias[i].getIdTip() == id) {
					proLis = MemoriaBD.provincias[i];
				}
			}
		} catch (Exception e) {
			throw new Exception("No existen datos!!!");
		}
		return proLis;
	}
	
	public String imprimirListaFormateada() {
		StringBuilder provLis = new StringBuilder();
		for (Provincia provTmp : MemoriaBD.provincias) {
			if (provTmp != null) {
				provLis.append(provTmp.getIdTip()).append("-").append(provTmp.getNombreTip()).append("  !! ");
			}
		}
		return provLis.toString();
	}

}
