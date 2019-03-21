/**
 * 
 */
package com.ingkarper.sishotel.vista;

import java.util.Date;

import com.ingkarper.sishotel.modelo.Perfil;
import com.ingkarper.sishotel.modelo.Usuario;
import com.ingkarper.sishotel.negocio.PerfilTrs;
import com.ingkarper.sishotel.negocio.util.UtilLectura;

/**
 * @author CPerez Fecha: Mar 2, 2019 Clase que representa al formulario de
 *         Perfiles
 */
public class FrmPerfil {

	public FrmPerfil(Usuario userUsuario) {
		creamenuPerfil(userUsuario);
	}

	private void creamenuPerfil(Usuario userUsuario) {
		Perfil perfil = new Perfil();
		PerfilTrs adminPerfil = new PerfilTrs();
		int opcion = 0;
		do {
			System.out.println("\n\n");
			System.out.println("***********************************************");
			System.out.println("** Sistema de Gestión Hotelera V1.0 - Perfil **");
			System.out.println("***********************************************");
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
				System.out.println("Listar Perfiles");
				adminPerfil.listar();
				System.out.print("\n Ingrese una opción (1-5):");
				opcion = Integer.parseInt(UtilLectura.leerDesdeTeclado());
				break;
			case 2:
				// 1.- Recuperar los datos
				System.out.println("Ingresar Datos Perfil:");
				System.out.print("Id: ");
				int id = Integer.parseInt(UtilLectura.leerDesdeTeclado());
				System.out.print("Perfil: ");
				String nombre = UtilLectura.leerDesdeTeclado();
				System.out.print("Descripción:");
				String descripcion = UtilLectura.leerDesdeTeclado();
				boolean estado = true;

				// 2. Crear un registro del objeto Tipo de Identificación
				perfil.setIdTip(id);
				perfil.setNombreTip(nombre);
				perfil.setEstadoTip(estado);
				perfil.setDescripcionTip(descripcion);
				perfil.setFechaRegTip(new Date());
				perfil.setUsuarioRegTip(userUsuario.getUserIdUsu());
				// 3.- Llamar al contrucotor que tiene las clases
				String mensaje = adminPerfil.guardar(perfil);

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
