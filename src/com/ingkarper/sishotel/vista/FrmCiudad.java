/**
 * 
 */
package com.ingkarper.sishotel.vista;

import com.ingkarper.sishotel.modelo.Ciudad;
import com.ingkarper.sishotel.modelo.Provincia;
import com.ingkarper.sishotel.modelo.Usuario;
import com.ingkarper.sishotel.negocio.CiudadTrs;
import com.ingkarper.sishotel.negocio.ProvinciaTrs;
import com.ingkarper.sishotel.negocio.util.UtilLectura;

/**
 * @author CPerez Fecha: Mar 2, 2019 Clase que representa al formulario de las
 *         ciudades
 */
public class FrmCiudad {

	public FrmCiudad(Usuario userUsuario) {
		creaMenuCiudad(userUsuario);
	}

	private void creaMenuCiudad(Usuario userUsuario) {
		Ciudad ciudad = new Ciudad();
		CiudadTrs adminCiudad = new CiudadTrs();
		Provincia provincia = new Provincia();
		ProvinciaTrs adminPro = new ProvinciaTrs();
		String nombre = null;
		String descripcion = null;
		int idPro = 0;
		int opcion = 0;
		do {
			System.out.println("\n\n");
			System.out.println("***********************************************");
			System.out.println("** Sistema de Gestión Hotelera V1.0 - Ciudad **");
			System.out.println("***********************************************");
			System.out.println("Usuario: " + userUsuario.getUserIdUsu());
			System.out.println("\n");
			System.out.println("1. Listar");
			System.out.println("2. Guardar");
			System.out.println("3. Actualizar");
			System.out.println("4. Eliminar");
			System.out.println("5. Regresar....");

			try {
				System.out.print("\n Ingrese una opción (1-5):");
				opcion = Integer.parseInt(UtilLectura.leerDesdeTeclado());
			} catch (NumberFormatException e1) {
				System.err.println("Ingrese solo números");
			}

			switch (opcion) {
			case 1:
				System.out.println("Listar Ciudades");
				try {
					for (Object ciu : adminCiudad.consultarTodos()) {
						System.out.println(ciu);
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 2:
				// 1.- Recuperar los datos
				System.out.println("Ingresar Datos Ciudad:");
				String mensaje= null;
				int id= 0;
				boolean estado = true;
				try {
					System.out.print("Id: ");
					id = Integer.parseInt(UtilLectura.leerDesdeTeclado());
					System.out.print("Ciudad: ");
					nombre = UtilLectura.leerDesdeTeclado();
					System.out.print("Descripción: ");
					descripcion = UtilLectura.leerDesdeTeclado();
					System.out.println("Provincias:");
					System.out.println(adminPro.imprimirListaFormateada());
					System.out.print("Ingrese Id de Provincia: ");
					idPro = Integer.parseInt(UtilLectura.leerDesdeTeclado());
					try {
						provincia = (Provincia) adminPro.consultarPorId(idPro);
						if (provincia == null) {
							System.err.println("Seleccione una provincia");;
							return;
						}
						estado = true;
						try {
							// 2. Llamar al constructor que tiene las clases
							ciudad = new Ciudad(id, nombre, descripcion, estado, provincia);
							// 3.- Procesar información
							mensaje = adminCiudad.guardar(ciudad);
							// 4.- Procesar información
							System.out.println(mensaje);
						} catch (Exception e) {
							System.err.println(e.getMessage());
						}

					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				} catch (NumberFormatException e1) {
					System.err.println("Ingrese solo números!!!");
				}


				break;
			case 3:
				// 1.- Listar Datos para seleccionar un registro
				System.out.println("Lista de Ciudades:");
				try {
					for (Object ciu : adminCiudad.consultarTodos()) {
						System.out.println(ciu);
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				// 2.- Seleccionar el Id y nombre
				System.out.print("\n Ingrese el Id de la ciudad que desea Actualizar:");
				int idAct = Integer.parseInt(UtilLectura.leerDesdeTeclado());
				System.out.print("Ciudad: ");
				nombre = UtilLectura.leerDesdeTeclado();
				// 3.- Ingresar datos para Modificar
				System.out.print("Descripción:");
				descripcion = UtilLectura.leerDesdeTeclado();
				System.out.println("Provincias:");
				System.out.println(adminPro.imprimirListaFormateada());
				System.out.print("Ingrese Id de Provincia: ");
				idPro = Integer.parseInt(UtilLectura.leerDesdeTeclado());
				try {
					provincia = (Provincia) adminPro.consultarPorId(idPro);
					estado = true;
					try {
						// 4.- Llamar al constructor que tiene la clase
						ciudad = new Ciudad(idAct, nombre, descripcion, estado, provincia);
						// 5.-Procesar Información
						mensaje = adminCiudad.actualizar(ciudad);
						// 6.- Visualizar Información
						System.out.println(mensaje);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} catch (Exception e1) {
					System.err.println(e1.getMessage());
				}


				break;
			case 4:
				// 1.- Listar Datos para seleccionar un registro
				System.out.println("Eliminar Ciudad");
				try {
					for (Object ciu : adminCiudad.consultarTodos()) {
						System.out.println(ciu);
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				// 2.- Seleccionar el Id
				int idEli = 0;
				System.out.print("\n Ingrese el Id de la Ciudad que desea Eliminar:");
				idEli = Integer.parseInt(UtilLectura.leerDesdeTeclado());

				// 3.-Consultar el Id
				Ciudad ciudadEli;
				try {
					// 3.-Procesar Información
					ciudadEli = (Ciudad) adminCiudad.consultaPorId(idEli);
					mensaje = adminCiudad.eliminar(ciudadEli);
					// 4.- Visualizar Información
					System.out.println(mensaje);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

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
