/**
 * 
 */
package com.ingkarper.sishotel.negocio;

import com.ingkarper.sishotel.modelo.MemoriaBD;
import com.ingkarper.sishotel.modelo.TipoIdentificacion;

/**
 * @author CPerez Fecha: Mar 2, 2019 Clase que representa a las operaciones de
 *         negocio para el tipo de Identificaci�n
 */
public class TipoIdentificacionTrs implements ICrud {

	@Override
	public String guardar(Object registro) {
		boolean banIng = false;
		int posIng = 0;
		//Verificar el registro no sea nulo
		if (registro != null) {
			//Recorrer los regitros uno por uno 
			for (int i = 0; i < MemoriaBD.tipoIdentificaciones.length; i++) {
				//Identificar si la posici�n es nula
				if (MemoriaBD.tipoIdentificaciones[i] == null) {
					//Activa bandera que encontr�
					banIng = true;
					//Captura la posici�n
					posIng = i;
					break;
				}
			}
			//Si se activa la bandera que encontro algun nulo
			if (banIng) {
				//Se inerta el registro
				MemoriaBD.tipoIdentificaciones[posIng] = (TipoIdentificacion) registro;
				return "Datos Ingresados Correctamente...";
			}

			else {
				//Sobrepaso el l�mite del arreglo
				return "N�mero m�ximo registrados para la versi�n demo!!!";
			}

		} else {
			return "Debe llenar los datos!!!";

		}
	}

	@Override
	public String actualizar(int id, Object registro) {
		boolean banAct = false;
		int posAct = 0;
		//Verificar que no se encuentre el registro nulo
		if (registro != null) {
			//Barrer todos los registros
			for (int i = 0; i < MemoriaBD.tipoIdentificaciones.length; i++) {
				//Verifica si encuentra el id enviado desde el formulario
				if (MemoriaBD.tipoIdentificaciones[i].getIdTip() == id) {
					//Activar que se encontro el registro
					banAct = true;
					//Capturar la posici�n
					posAct = i;
					break;
				}
			}
			//Se verifica si se activo la bandera que se encontro el ID
			if (banAct) {
				//Se reemplaza el registro enviado por el formulario 
				MemoriaBD.tipoIdentificaciones[posAct] = (TipoIdentificacion) registro;
				return "Datos Actualizados correctamente...";
			} else {
				return "No se encontr� registro ingresado!!!";
			}
		} else {
			return "El resgitro no puede ser nulo!!!";
		}
	}

	@Override
	public String eliminar(int id) {
		boolean banEnc = false;
		int posEli = 0;
		//Recorrer todo el arreglo
		for (int i = 0; i < MemoriaBD.tipoIdentificaciones.length; i++) {
			//Si se encuentra la identificaci�n que se envia por el formulario
			if (MemoriaBD.tipoIdentificaciones[i].getIdTip() == id) {
				//Se activa bandera que se encontro 
				banEnc = true;
				//Se captura posici�n encontrada 
				posEli = i;
				break;
			}
		}
		//Si se activa bandera que encontr�
		if (banEnc) {
			//Se coloca null para simular el eliminado
			MemoriaBD.tipoIdentificaciones[posEli] = null;
			return "Datos Eliminados correctamente...";
		} else {
			return "No se encontr� registro!!!";
		}
	}

	@Override
	public Object[] listar() {
		//Recuperar todos registros
		return MemoriaBD.tipoIdentificaciones;
	}

	@Override
	public Object consultarPorId(int id) throws Exception {
		TipoIdentificacion tipIdenEnc = null;
		try {
			for (int i = 0; i < MemoriaBD.tipoIdentificaciones.length; i++) {
				if (MemoriaBD.tipoIdentificaciones[i].getIdTip() == id) {
					tipIdenEnc = MemoriaBD.tipoIdentificaciones[i];
					break;
				}
			}
		} catch (Exception e) {
			throw new Exception("Tipo de identificaci�n no existe");
		}
		return tipIdenEnc;

	}

	public String impimirListaFormateada() {
		StringBuilder tipIdenLis = new StringBuilder();
		for (TipoIdentificacion tipIdeTmp : MemoriaBD.tipoIdentificaciones) {
			if (tipIdeTmp != null) {
				tipIdenLis.append(tipIdeTmp.getIdTip()).append("-").append(tipIdeTmp.getNombreTip()).append(" !! ");
			}
		}
		return tipIdenLis.toString();
	}
}
