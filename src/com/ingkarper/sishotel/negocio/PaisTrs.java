/**
 * 
 */
package com.ingkarper.sishotel.negocio;

import com.ingkarper.sishotel.modelo.MemoriaBD;
import com.ingkarper.sishotel.modelo.Pais;

/**
 * @author CPerez
 * Fecha: Mar 2, 2019
 * Clase que tendrá las operaciones del negocio relacionadas con el País
 */
public class PaisTrs implements ICrud {

	@Override
	public String guardar(Object registro) {
		boolean banIns = false;
		int posInt = 0;
		if (registro != null) {
			for (int i = 0; i < MemoriaBD.paises.length; i++) {
				if (MemoriaBD.paises[i] == null) {
					banIns = true;
					posInt = i;
					break;
				}
			}
			if (banIns) {
				MemoriaBD.paises[posInt] = (Pais) registro;
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
			for (int i = 0; i < MemoriaBD.paises.length; i++) {
				if (MemoriaBD.paises[i].getIdTip() == id) {
					banAlm = true;
					posAlm = i;
					break;
				}
			}
			if (banAlm) {
				MemoriaBD.paises[posAlm] = (Pais) registro;
				return "Datos Almmacenados correctamente...";
			} else {
				return "No se encuentra datos ingresados!!!";
			}
		} else {
			return "Debe llenar todos los datos!!!";
		}
	}

	@Override
	public String eliminar(int id) {
		boolean banEli = false;
		int posEli = 0;
		for (int i = 0; i < MemoriaBD.paises.length; i++) {
			if (MemoriaBD.paises[i].getIdTip() == id) {
				banEli = true;
				posEli = i;
				break;
			}
		}
		if (banEli) {
			MemoriaBD.paises[posEli] = null;
			return "Datos Eliminados correctamente...";
		} else {
			return "No se encuentran datos ingresados!!!";
		}
	}

	@Override
	public Object[] listar() {
		return MemoriaBD.paises;
	}

	@Override
	public Object consultarPorId(int id) {
		Pais paisEnc = null;
		for (int i = 0; i < MemoriaBD.paises.length; i++) {
			if(MemoriaBD.paises[i].getIdTip()==id) {
				paisEnc = MemoriaBD.paises[i];
				break;
			}
		}
		return paisEnc;
	}
	
	public String imprimirListaFormateada() {
		StringBuilder paisLis = new StringBuilder();
		for (Pais paisTmp : MemoriaBD.paises) {
			if (paisTmp != null) {
				paisLis.append(paisTmp.getIdTip()).append("-").append(paisTmp.getNombreTip()).append("  !! ");
			}
		}
		return paisLis.toString();
	}

}
