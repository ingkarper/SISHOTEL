/**
 * 
 */
package com.ingkarper.sishotel.vista;

import com.ingkarper.sishotel.modelo.EstadoCivil;
import com.ingkarper.sishotel.modelo.TipoIdentificacion;
import com.ingkarper.sishotel.modelo.Usuario;
import com.ingkarper.sishotel.negocio.EstadoCivilTrs;
import com.ingkarper.sishotel.negocio.util.UtilLectura;

/**
 * @author CPerez Fecha: Mar 2, 2019 Clase que representa al formulario de los
 *         Estados Civiles
 */
public class FrmEstadoCivil {

	public FrmEstadoCivil(Usuario userUsuario) {
		creaMenuEstadoCivil(userUsuario);
	}

	private void creaMenuEstadoCivil(Usuario userUsuario) {
		EstadoCivil estadocivil = new EstadoCivil();
		EstadoCivilTrs adminEstadoCivil = new EstadoCivilTrs();
		String nombre = null;
		String descripcion = null;
		Boolean estado = null;
		int opcion = 0;
		
		do {
			System.out.println("\n\n");
			System.out.println("*****************************************************");
			System.out.println("** Sistema de Gestión Hotelera V1.0 - Estado Civil **");
			System.out.println("*****************************************************");
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
				System.out.println("Listar Estados Civiles");
				for (Object estadoCivil : adminEstadoCivil.listar()) {
					System.out.println(estadoCivil);
				}
				break;
			case 2:
				// 1.- Recuperar los datos
				System.out.println("Ingresar Datos Estado Civil:");
				System.out.print("Id: ");
				int id = Integer.parseInt(UtilLectura.leerDesdeTeclado());
				System.out.print("Estado Civil: ");
				nombre = UtilLectura.leerDesdeTeclado();
				System.out.print("Descripción: ");
				descripcion = UtilLectura.leerDesdeTeclado();
				estado = true;

				// 2. Crear un registro del objeto Tipo de Identificación
				estadocivil = new EstadoCivil(id, nombre, descripcion, estado);

				// 3.- Llamar al constructor que tiene las clases
				String mensaje = adminEstadoCivil.guardar(estadocivil);

				// 4.- Procesar información
				System.out.println(mensaje);
				break;
			case 3:
				//1.- Listar Datos para seleccionar un registro 
				System.out.println("Lista de Estado Civiles:");
				for (Object estadoCivil : adminEstadoCivil.listar()) {
					System.out.println(estadoCivil);
				}
				
				//2.- Seleccionar el Id y nombre
				System.out.print("\n Ingrese el Id de Estado Civil que desea Actualizar:");
				int idAct = Integer.parseInt(UtilLectura.leerDesdeTeclado());
				System.out.print("Estado Civil: ");
				nombre = UtilLectura.leerDesdeTeclado();
				
				//3.- Ingresar datos para Modificar
				System.out.print("Descripción:");
				descripcion = UtilLectura.leerDesdeTeclado();
				estado = true;
				
				//4.- Llamar al constructor que tiene la clase
				estadocivil = new EstadoCivil(idAct, nombre, descripcion, estado);
				
				//5.-Procesar Información
				mensaje = adminEstadoCivil.actualizar(idAct, estadocivil);
				
				//6.- Visualizar Información
				System.out.println(mensaje);

				break;
			case 4:
				//1.- Listar Datos para seleccionar un registro 
				System.out.println("Eliminar Estado Civil");
				for (Object estadoCivil : adminEstadoCivil.listar()) {
					System.out.println(estadoCivil);
				}
				
				//2.- Seleccionar el Id
				System.out.print("\n Ingrese el Id de Estado Civil que desea Eliminar:");
				int idEli = Integer.parseInt(UtilLectura.leerDesdeTeclado());
				
				//3.-Procesar Información
				mensaje = adminEstadoCivil.eliminar(idEli);

				//4.- Visualizar Información
				System.out.println(mensaje);

				break;
			case 5:
				FrmCatalogos frmCatalogos = new FrmCatalogos(userUsuario);
				break;
			default:
				System.err.println("Opción no valida");
				break;
			}

		} while (opcion != 5);

	}

}
