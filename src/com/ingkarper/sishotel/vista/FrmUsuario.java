/**
 * 
 */
package com.ingkarper.sishotel.vista;

import com.ingkarper.sishotel.modelo.Usuario;
import com.ingkarper.sishotel.negocio.UsuarioTrs;
import com.ingkarper.sishotel.negocio.util.UtilLectura;

/**
 * @author CPerez Fecha: Mar 2, 2019 Clase que representa a los formularios de
 *         Usuarios
 */
public class FrmUsuario {

	public FrmUsuario(Usuario userUsuario) {
		creaMenuUsuario(userUsuario);
	}

	private void creaMenuUsuario(Usuario userUsuario) {
		Usuario usuario = new Usuario();
		UsuarioTrs adminUsuario = new UsuarioTrs();

		int opcion = 0;
		do {
			System.out.println("\n\n");
			System.out.println("************************************************");
			System.out.println("** Sistema de Gestión Hotelera V1.0 - Usuario **");
			System.out.println("************************************************");
			System.out.println("Usuario: " + userUsuario.getUserIdUsu());
			System.out.println("\n");
			System.out.println("1. Listar");
			System.out.println("2. Guardar");
			System.out.println("3. Actualizar");
			System.out.println("4. Eliminar");
			System.out.println("5. Regresar....");
			System.out.print("\n Ingrese una opción (1-5):");
			try {
				opcion = Integer.parseInt(UtilLectura.leerDesdeTeclado());
			} catch (NumberFormatException e) {
				System.err.println("Seleccione solo números");
			}

			switch (opcion) {
			case 1:
				System.out.println("Lista Usuarios");
				adminUsuario.listar();
				System.out.print("\n Ingrese una opción (1-5):");
				opcion = Integer.parseInt(UtilLectura.leerDesdeTeclado());
				break;
			case 2:
				// 1.- Recuperar los datos
				System.out.println("Ingresar Datos Usuario:");
				System.out.print("User Id: ");
				String userid = UtilLectura.leerDesdeTeclado();
				System.out.print("Contraseña: ");
				String contrasenia = UtilLectura.leerDesdeTeclado();
				System.out.print("Confirmar Contraseña:");
				String confirmaContrasenia = UtilLectura.leerDesdeTeclado();
				String mensaje;
				if (contrasenia.equals(confirmaContrasenia)) {
					// 2. Crear un registro del objeto Tipo de Identificación
					usuario.setUserIdUsu(userid);;
					usuario.setPasswordUsu(contrasenia);;
					usuario.setCambioPasswordUsu(false);
					// 3.- Llamar al contrucotor que tiene las clases
					mensaje = adminUsuario.guardar(usuario);
	
				}else {
					mensaje = "Contraseñas no son iguales";
				}
				
				// 4.- Procesar información
				System.out.println(mensaje);

				System.out.print("\n Ingrese una opción (1-5):");
				opcion = Integer.parseInt(UtilLectura.leerDesdeTeclado());

				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				FrmAdminSitio frmAdministracionSitio = new FrmAdminSitio(userUsuario);
				break;
			default:
				System.err.println("Opción no valida");
				System.out.print("\n Ingrese una opción (1-5):");
				opcion = Integer.parseInt(UtilLectura.leerDesdeTeclado());
				break;
			}

		} while (opcion != 5);

	}

}
