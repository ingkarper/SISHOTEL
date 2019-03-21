/**
 * 
 */
package com.ingkarper.sishotel.negocio;

import com.ingkarper.sishotel.modelo.EstadoCivil;
import com.ingkarper.sishotel.modelo.MemoriaBD;

/**
 * @author CPerez Fecha: Mar 2, 2019 Clase que tendrá las operaciones del
 *         negocio relacionadas con los Estados Civiles
 */
public class EstadoCivilTrs implements ICrud {

	@Override
	public String guardar(Object registro) {
		boolean banIns = false;
		int posInt = 0;
		if (registro != null) {
			for (int i = 0; i < MemoriaBD.estadoCiviles.length; i++) {
				if (MemoriaBD.estadoCiviles[i] == null) {
					banIns = true;
					posInt = i;
					break;
				}
			}
			if (banIns) {
				MemoriaBD.estadoCiviles[posInt] = (EstadoCivil) registro;
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
			for (int i = 0; i < MemoriaBD.estadoCiviles.length; i++) {
				if (MemoriaBD.estadoCiviles[i].getIdTip() == id) {
					banAlm = true;
					posAlm = i;
					break;
				}
			}
			if (banAlm) {
				MemoriaBD.estadoCiviles[posAlm] = (EstadoCivil) registro;
				return "Datos Actualizados correctamente...";
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
		for (int i = 0; i < MemoriaBD.estadoCiviles.length; i++) {
			if (MemoriaBD.estadoCiviles[i].getIdTip() == id) {
				banEli = true;
				posEli = i;
				break;
			}
		}
		if (banEli) {
			MemoriaBD.estadoCiviles[posEli] = null;
			return "Datos Eliminados correctamente...";
		} else {
			return "No se encuentra datos ingresados!!!";
		}
	}

	@Override
	public Object[] listar() {
		return MemoriaBD.estadoCiviles;
	}

	@Override
	public Object consultarPorId(int id) throws Exception {
		EstadoCivil estCivEnc = null;
		try {
			for (int i = 0; i < MemoriaBD.estadoCiviles.length; i++) {
				if (MemoriaBD.estadoCiviles[i].getIdTip() == id) {
					estCivEnc = MemoriaBD.estadoCiviles[i];
					break;
				}
			}
		} catch (Exception e) {
			throw new Exception("Estado Civil no encontrado!!!");
		}
		return estCivEnc;
	}

	public String imprimirListaFormateada() {
		StringBuilder estCivLis = new StringBuilder();
		for (EstadoCivil estCivTmp : MemoriaBD.estadoCiviles) {
			if (estCivTmp != null) {
				estCivLis.append(estCivTmp.getIdTip()).append("-").append(estCivTmp.getNombreTip()).append("  !! ");
			}
		}
		return estCivLis.toString();
	}

}
