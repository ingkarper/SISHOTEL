/**
 * 
 */
package com.ingkarper.sishotel.vista;

import com.ingkarper.sishotel.modelo.Usuario;
import com.ingkarper.sishotel.negocio.util.UtilLectura;

/**
 * @author CPerez
 * Fecha: Mar 2, 2019
 * Clase que representa el Formulario de Administración Usuario
 */
public class FrmAdminSitio {

	public FrmAdminSitio(Usuario userUsuario) {
		creaMenuAdminSitio(userUsuario);
	}
	private void creaMenuAdminSitio(Usuario userUsuario) {
		int opcion = 0;
		do {
			System.out.println("\n\n");
			System.out.println("*************************************************************");
			System.out.println("** Sistema de Gestión Hotelera V1.0 - Administración Sitio **");
			System.out.println("*************************************************************");
			System.out.println("Usuario: " + userUsuario.getUserIdUsu());
			System.out.println("\n");
			System.out.println("1. Perfil");
			System.out.println("2. Usuarios");
			System.out.println("3. Regresar....");
			System.out.print("\n Ingrese una opción (1-3):");
			try {
				opcion = Integer.parseInt(UtilLectura.leerDesdeTeclado());
			} catch (NumberFormatException e) {
				System.err.println("Seleccione solo números");
			}

			switch (opcion) {
			case 1:
				FrmPerfil frmPerfil = new FrmPerfil(userUsuario);
				break;
			case 2:
				FrmUsuario frmUsuario = new FrmUsuario(userUsuario);
				break;
			case 3:
				FrmAdministracion frmAdministracion = new FrmAdministracion(userUsuario);
				break;
			default:
				System.err.println("Opción no valida");
				break;
			}

		} while (opcion != 3);

		
	}

}
