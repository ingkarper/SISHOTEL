/**
 * 
 */
package com.ingkarper.sishotel.vista;

import com.ingkarper.sishotel.modelo.Pais;
import com.ingkarper.sishotel.modelo.Usuario;
import com.ingkarper.sishotel.negocio.PaisTrs;
import com.ingkarper.sishotel.negocio.util.UtilLectura;

/**
 * @author CPerez Fecha: Mar 2, 2019 Clase que representa al formulario de los
 *         paises
 */
public class FrmPais {

	public FrmPais(Usuario userUsuario) {
		creaMenuPais(userUsuario);
	}

	private void creaMenuPais(Usuario userUsuario) {
		Pais pais = new Pais();
		PaisTrs adminPais = new PaisTrs();
		String mensaje = null;
		String nombre = null;
		String descripcion = null;
		Boolean estado = null;
		int opcion = 0;
		
		do {
			System.out.println("\n\n");
			System.out.println("*********************************************");
			System.out.println("** Sistema de Gestión Hotelera V1.0 - País **");
			System.out.println("*********************************************");
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
				System.out.println("Listar Paises");
				for (Object paisLi : adminPais.listar()) {
					System.out.println(paisLi);
				}
				break;
			case 2:
				// 1.- Recuperar los datos
				System.out.println("Ingresar Datos País:");
				System.out.print("Id: ");
				int id = Integer.parseInt(UtilLectura.leerDesdeTeclado());
				System.out.print("País: ");
				nombre = UtilLectura.leerDesdeTeclado();
				System.out.print("Descripción: ");
				descripcion = UtilLectura.leerDesdeTeclado();
				estado = true;

				// 2. Crear un registro del objeto Tipo de Identificación
				pais = new Pais(id, nombre, descripcion, estado);

				// 3.- Procesar Información
				mensaje = adminPais.guardar(pais);

				// 4.- Visualizar información
				System.out.println(mensaje);
				break;
			case 3:
				//1.- Listar Datos para seleccionar un registro 
				System.out.println("Lista de Paises:");
				for (Object paisL : adminPais.listar()) {
					System.out.println(paisL);
				}
				
				//2.- Seleccionar el Id y nombre
				System.out.print("\n Ingrese el Id de País que desea Actualizar:");
				int idAct = Integer.parseInt(UtilLectura.leerDesdeTeclado());
				System.out.print("País: ");
				nombre = UtilLectura.leerDesdeTeclado();
				
				//3.- Ingresar datos para Modificar
				System.out.print("Descripción:");
				descripcion = UtilLectura.leerDesdeTeclado();
				estado = true;
				
				//4.- Llamar al constructor que tiene la clase
				pais = new Pais(idAct, nombre, descripcion, estado);
				
				//5.-Procesar Información
				mensaje = adminPais.actualizar(idAct, pais);
				
				//6.- Visualizar Información
				System.out.println(mensaje);

				break;
			case 4:
				//1.- Listar Datos para seleccionar un registro 
				System.out.println("Eliminar País");
				for (Object paisL : adminPais.listar()) {
					System.out.println(paisL);
				}
				
				//2.- Seleccionar el Id
				System.out.print("\n Ingrese el Id de País que desea Eliminar:");
				int idEli = Integer.parseInt(UtilLectura.leerDesdeTeclado());
				
				//3.-Procesar Información
				mensaje = adminPais.eliminar(idEli);

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
