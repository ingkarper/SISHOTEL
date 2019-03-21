/**
 * 
 */
package com.ingkarper.sishotel.vista;

import com.ingkarper.sishotel.modelo.Usuario;
import com.ingkarper.sishotel.negocio.util.UtilLectura;

/**
 * @author CPerez Fecha: Mar 2, 2019 Clase que representa al formulario de
 *         Habitaciones
 */
public class FrmHabitaciones {

	public FrmHabitaciones(Usuario userUsuario) {
		creaMenuHabitaciones(userUsuario);
	}

	private void creaMenuHabitaciones(Usuario userUsuario) {
		int opcion = 0;
		do {
			System.out.println("\n\n");
			System.out.println("*****************************************************");
			System.out.println("** Sistema de Gesti�n Hotelera V1.0 - Habitaciones **");
			System.out.println("*****************************************************");
			System.out.println("Usuario: " + userUsuario.getUserIdUsu());
			System.out.println("\n");
			System.out.println("1. Tipo de Habitaci�n");
			System.out.println("2. Piso Habitaci�n");
			System.out.println("3. Estado de Habitaciones");
			System.out.println("4. Regresar....");
			System.out.print("\n Ingrese una opci�n (1-6):");
			try {
				opcion = Integer.parseInt(UtilLectura.leerDesdeTeclado());
			} catch (NumberFormatException e) {
				System.err.println("Seleccione solo n�meros");
			}

			switch (opcion) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				FrmPrincipal frmPrincipal = new FrmPrincipal(userUsuario);
				break;
			default:
				System.err.println("Opci�n no valida");
				break;
			}

		} while (opcion != 4);

	}

}
