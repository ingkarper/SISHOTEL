/**
 * 
 */
package com.ingkarper.sishotel.vista;

import com.ingkarper.sishotel.modelo.Pais;
import com.ingkarper.sishotel.modelo.Provincia;
import com.ingkarper.sishotel.modelo.Usuario;
import com.ingkarper.sishotel.negocio.PaisTrs;
import com.ingkarper.sishotel.negocio.ProvinciaTrs;
import com.ingkarper.sishotel.negocio.util.UtilLectura;

/**
 * @author CPerez Fecha: Mar 2, 2019 Clase que representa al formulario de la
 *         Provincia
 */
public class FrmProvincia {

	public FrmProvincia(Usuario userUsuario) {
		creaMenuProvincia(userUsuario);
	}

	private void creaMenuProvincia(Usuario userUsuario) {
		Provincia provincia = new Provincia();
		ProvinciaTrs adminProvincia = new ProvinciaTrs();
		Pais pais = new Pais();
		PaisTrs adminPais = new PaisTrs();
		String mensaje = null;
		String nombre = null;
		String descripcion = null;
		Boolean estado = null;
		int idPais = 0;
		int opcion = 0;
		
		do {
			System.out.println("\n\n");
			System.out.println("**************************************************");
			System.out.println("** Sistema de Gestión Hotelera V1.0 - Provincia **");
			System.out.println("**************************************************");
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
				for (Object pro : adminProvincia.listar()) {
					System.out.println(pro);
				}
				break;
			case 2:
				// 1.- Recuperar los datos
				System.out.println("Ingresar Datos Provincia:");
				System.out.print("Id: ");
				int id = Integer.parseInt(UtilLectura.leerDesdeTeclado());
				System.out.print("Provincia: ");
				nombre = UtilLectura.leerDesdeTeclado();
				System.out.print("Descripción: ");
				descripcion = UtilLectura.leerDesdeTeclado();
				System.out.print("Descripción: ");
				descripcion = UtilLectura.leerDesdeTeclado();
				System.out.println("Paises:");
				System.out.println(adminPais.imprimirListaFormateada());
				System.out.print("Ingresar el id del País:");
				idPais =  Integer.parseInt(UtilLectura.leerDesdeTeclado());
				pais = (Pais) adminPais.consultarPorId(idPais);
				estado = true;

				// 2. Crear un registro del objeto Tipo de Identificación
				provincia = new Provincia(id, nombre, descripcion, estado,pais);

				// 3.- Procesar información
				mensaje = adminProvincia.guardar(provincia);

				// 4.- Visualizar información
				System.out.println(mensaje);
				break;
			case 3:
				//1.- Listar Datos para seleccionar un registro 
				System.out.println("Lista de Paises:");
				for (Object pro : adminProvincia.listar()) {
					System.out.println(pro);
				}
				
				//2.- Seleccionar el Id y nombre
				System.out.print("\n Ingrese el Id de la Provincia que desea Actualizar:");
				int idAct = Integer.parseInt(UtilLectura.leerDesdeTeclado());
				System.out.print("Provincia: ");
				nombre = UtilLectura.leerDesdeTeclado();
				
				//3.- Ingresar datos para Modificar
				System.out.print("Descripción:");
				descripcion = UtilLectura.leerDesdeTeclado();
				System.out.print("Ingresar el id del País:");
				idPais =  Integer.parseInt(UtilLectura.leerDesdeTeclado());
				pais = (Pais) adminPais.consultarPorId(idPais);
				estado = true;
				
				//4.- Llamar al constructor que tiene la clase
				provincia = new Provincia(idAct, nombre, descripcion, estado, pais);
				
				//5.-Procesar Información
				mensaje = adminProvincia.actualizar(idAct, provincia);
				
				//6.- Visualizar Información
				System.out.println(mensaje);
				break;
			case 4:
				//1.- Listar Datos para seleccionar un registro 
				System.out.println("Eliminar Provincia");
				for (Object pro : adminProvincia.listar()) {
					System.out.println(pro);
				}
				
				//2.- Seleccionar el Id
				System.out.print("\n Ingrese el Id de Provincia que desea Eliminar:");
				int idEli = Integer.parseInt(UtilLectura.leerDesdeTeclado());
				
				//3.-Procesar Información
				mensaje = adminProvincia.eliminar(idEli);

				//4.- Visualizar Información
				System.out.println(mensaje);

				break;
			case 5:
				FrmCatalogos frmCatalogos = new FrmCatalogos(userUsuario);
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
