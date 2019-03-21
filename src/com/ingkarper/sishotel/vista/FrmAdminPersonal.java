/**
 * 
 */
package com.ingkarper.sishotel.vista;

import com.ingkarper.sishotel.modelo.Usuario;
import com.ingkarper.sishotel.negocio.util.UtilLectura;

/**
 * @author CPerez
 * Fecha: Mar 3, 2019
 * Clase que representa el formulario de Administraci�n de Empleos
 */
public class FrmAdminPersonal {

	public FrmAdminPersonal(Usuario userUsuario) {
		creaMenuAdminPersonal(userUsuario);
	}
	private void creaMenuAdminPersonal(Usuario userUsuario) {
		int opcion = 0;
		do {
			System.out.println("\n\n");
			System.out.println("****************************************************************");
			System.out.println("** Sistema de Gesti�n Hotelera V1.0 - Administraci�n Personal **");
			System.out.println("****************************************************************");
			System.out.println("Usuario: " + userUsuario.getUserIdUsu());
			System.out.println("\n");
			System.out.println("1. Rol Empleado");
			System.out.println("2. Ficha Laboral");
			System.out.println("3. Tipo Horarios");
			System.out.println("4. Horario Laboral");
			System.out.println("5. Regresar....");
			System.out.print("\n Ingrese una opci�n (1-5):");
			try {
				opcion = Integer.parseInt(UtilLectura.leerDesdeTeclado());
			} catch (NumberFormatException e) {
				System.err.println("Seleccione solo n�meros");
			}

			switch (opcion) {
			case 1:
				FrmRolEmlpeado frmRolEmpleado = new FrmRolEmlpeado(userUsuario);
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				FrmAdministracion frmAdministracion = new FrmAdministracion(userUsuario);
				break;
			default:
				System.err.println("Opci�n no valida");
				break;
			}

		} while (opcion != 5);

		
	}

}
