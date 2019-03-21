/**
 * 
 */
package com.ingkarper.sishotel.vista;

import com.ingkarper.sishotel.modelo.Usuario;
import com.ingkarper.sishotel.negocio.util.UtilLectura;

/**
 * @author CPerez
 * Fecha: Mar 2, 2019
 * Clase que representa al formulario de administración del sistema
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
			System.out.println("** Sistema de Gestión Hotelera V1.0 - Administración **");
			System.out.println("*******************************************************");
			System.out.println("Usuario: " + userUsuario.getUserIdUsu());
			System.out.println("\n");
			System.out.println("1. Administración de Personal");
			System.out.println("2. Administración del Sitio");
			System.out.println("3. Regresar....");
			System.out.print("\n Ingrese una opción (1-3):");
			try {
				opcion = Integer.parseInt(UtilLectura.leerDesdeTeclado());
			} catch (NumberFormatException e) {
				System.err.println("Seleccione solo números");
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
				System.err.println("Opción no valida");
				break;
			}

		} while (opcion != 3);

		
	}


}
