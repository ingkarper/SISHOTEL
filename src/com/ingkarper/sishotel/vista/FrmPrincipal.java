/**
 * 
 */
package com.ingkarper.sishotel.vista;

import javax.sound.midi.SysexMessage;

import com.ingkarper.sishotel.modelo.Usuario;
import com.ingkarper.sishotel.negocio.util.UtilLectura;

/**
 * @author CPerez Fecha: Mar 2, 2019 Clase que representa al formulario
 *         Principal
 */
public class FrmPrincipal {

	public FrmPrincipal(Usuario usuarioSesion) {
		Usuario userSesion = usuarioSesion;
		creaMenuPrincipal(userSesion);
	}

	public FrmPrincipal() {
		// TODO Auto-generated constructor stub
	}

	public void creaMenuPrincipal(Usuario userUsuario) {
		int opcion = 0;
		do {
			System.out.println("\n\n");
			System.out.println("******************************************");
			System.out.println("**   Sistema de Gestión Hotelera V1.0   **");
			System.out.println("******************************************");
			System.out.println("Bienvenido: " + userUsuario.getUserIdUsu());
			System.out.println("\n");
			System.out.println("1. Catálogos");
			System.out.println("2. Personas");
			System.out.println("3. Habitaciones");
			System.out.println("4. Reservas");
			System.out.println("5. Administración");
			System.out.println("6. Salir....");
			System.out.print("\n Ingrese una opción (1-6):");
			try {
				opcion = Integer.parseInt(UtilLectura.leerDesdeTeclado());
			} catch (NumberFormatException e) {
				System.err.println("Seleccione solo números");
			}

			switch (opcion) {
			case 1:
				FrmCatalogos frmCatalogos = new FrmCatalogos(userUsuario);
				break;
			case 2:
				FrmPersonas frmPersonas = new FrmPersonas(userUsuario);
				break;
			case 3:
				FrmHabitaciones frmHabitaciones = new FrmHabitaciones(userUsuario);
				break;
			case 4:
				FrmReserva frmReserva = new FrmReserva(userUsuario);
				break;
			case 5:
				FrmAdministracion frmAdministracion = new FrmAdministracion(userUsuario);
				break;
			case 6:
				System.exit(0);
				break;
			default:
				System.err.println("Opción no valida");
				break;
			}

		} while (opcion != 6);
	}

}
