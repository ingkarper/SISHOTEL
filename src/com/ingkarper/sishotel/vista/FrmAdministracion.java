/**
 * 
 */
package com.ingkarper.sishotel.vista;

import com.ingkarper.sishotel.modelo.Usuario;
import com.ingkarper.sishotel.negocio.util.UtilLectura;

/**
 * @author CPerez
 * Fecha: Mar 2, 2019
 * Clase que representa al formulario de administraci�n del sistema
 */
public class FrmAdministracion {

	public FrmAdministracion(Usuario userUsuario) {
		creaMenuAdministracion(userUsuario);
	}
	
	private void creaMenuAdministracion(Usuario userUsuario) {
		int opcion = 0;
		do {
			System.out.println("\n\n");
			System.out.println("*******************************************************");
			System.out.println("** Sistema de Gesti�n Hotelera V1.0 - Administraci�n **");
			System.out.println("*******************************************************");
			System.out.println("Usuario: " + userUsuario.getUserIdUsu());
			System.out.println("\n");
			System.out.println("1. Administraci�n de Personal");
			System.out.println("2. Administraci�n del Sitio");
			System.out.println("3. Regresar....");
			System.out.print("\n Ingrese una opci�n (1-3):");
			try {
				opcion = Integer.parseInt(UtilLectura.leerDesdeTeclado());
			} catch (NumberFormatException e) {
				System.err.println("Seleccione solo n�meros");
			}

			switch (opcion) {
			case 1:
				FrmAdminPersonal frmAdminPersonal = new FrmAdminPersonal(userUsuario);
				break;
			case 2:
				FrmAdminSitio frmAdminSitio = new FrmAdminSitio(userUsuario);
				break;
			case 3:
				FrmPrincipal frmPrincipal = new FrmPrincipal(userUsuario);		
				break;
			default:
				System.err.println("Opci�n no valida");
				break;
			}

		} while (opcion != 3);

		
	}


}
