/**
 * 
 */
package com.ingkarper.sishotel.vista;

import com.ingkarper.sishotel.modelo.Persona;
import com.ingkarper.sishotel.modelo.Usuario;
import com.ingkarper.sishotel.negocio.PersonaTrs;
import com.ingkarper.sishotel.negocio.util.UtilLectura;

/**
 * @author CPerez Fecha: Mar 2, 2019 Clase que representa
 */
public class FrmReserva {
	public FrmReserva(Usuario userUsuario) {
		creaMenuReserva(userUsuario);
	}

	private void creaMenuReserva(Usuario userUsuario) {
		Persona persona = new Persona();
		PersonaTrs adminPersona = new PersonaTrs();
		int opcion = 0;
		do {
			System.out.println("\n\n");
			System.out.println("*************************************************");
			System.out.println("** Sistema de Gestión Hotelera V1.0 - Reservas **");
			System.out.println("*************************************************");
			System.out.println("Usuario: " + userUsuario.getUserIdUsu());
			System.out.println("\n");
			System.out.println("1. Listar");
			System.out.println("2. Guardar");
			System.out.println("3. Actualizar");
			System.out.println("4. Cancelar");
			System.out.println("5. Detalle Reserva");
			System.out.println("6. Regresar....");
			System.out.print("\n Ingrese una opción (1-6):");
		
			try {
				opcion = Integer.parseInt(UtilLectura.leerDesdeTeclado());
			} catch (NumberFormatException e) {
				System.err.println("Seleccione solo números");
			}

			switch (opcion) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				FrmPrincipal frmPrincipal = new FrmPrincipal(userUsuario);
				break;
			default:
				System.err.println("Opción no valida");
				break;
			}

		} while (opcion != 5);

	}

}
