/**
 * 
 */
package com.ingkarper.sishotel.vista;


import com.ingkarper.sishotel.modelo.TipoIdentificacion;
import com.ingkarper.sishotel.modelo.Usuario;
import com.ingkarper.sishotel.negocio.TipoIdentificacionTrs;
import com.ingkarper.sishotel.negocio.util.UtilLectura;

/**
 * @author CPerez Fecha: Mar 2, 2019 Clase que representa al formulario de Tipo
 *         de Identificaci�n
 */
public class FrmTipoIdentificacion {

	public FrmTipoIdentificacion(Usuario userUsuario) {
		creaMenuTipoIdentificacion(userUsuario);
	}

	private void creaMenuTipoIdentificacion(Usuario userUsuario) {

		TipoIdentificacionTrs adminTipoIdentificacion = new TipoIdentificacionTrs();
		TipoIdentificacion tipoIdentificacion = new TipoIdentificacion();
		String mensaje = null;
		String nombre = null;
		String descripcion = null;
		Boolean estado = null;
		int opcion = 0;
		
		do {
			System.out.println("\n\n");
			System.out.println("************************************************************");
			System.out.println("** Sistema de Gesti�n Hotelera V1.0 - Tipo Identificaci�n **");
			System.out.println("************************************************************");
			System.out.println("Usuario: " + userUsuario.getUserIdUsu());
			System.out.println("\n");
			System.out.println("1. Listar");
			System.out.println("2. Guardar");
			System.out.println("3. Actualizar");
			System.out.println("4. Eliminar");
			System.out.println("5. Regresar....");
			System.out.print("\n Ingrese una opci�n (1-5):");
			try {
				opcion = Integer.parseInt(UtilLectura.leerDesdeTeclado());
				switch (opcion) {
				case 1:
					System.out.println("Listar Tipos de Identificaci�n");
					for (Object tipoIden : adminTipoIdentificacion.listar()) {
						System.out.println(tipoIden);
					}
					break;
				case 2:
					//1.- Recuperar los datos
					System.out.println("Ingresar Datos Tipo Identificaci�n:");
					System.out.print("Id: ");
					int id = Integer.parseInt(UtilLectura.leerDesdeTeclado());
					System.out.print("Nombre Identificaci�n: ");
					nombre = UtilLectura.leerDesdeTeclado();
					System.out.print("Descripci�n Identificaci�n:");
					descripcion = UtilLectura.leerDesdeTeclado();
					estado = true;
					
					//2. Crear un registro del objeto Tipo de Identificaci�n
					tipoIdentificacion = new TipoIdentificacion(id, nombre, descripcion, estado);
					
					//3.- Procesar Informaci�n
					mensaje = adminTipoIdentificacion.guardar(tipoIdentificacion);
					
					//4.- Visualizar informaci�n
					System.out.println(mensaje);
					break;
				case 3:
					//1.- Listar Datos para seleccionar un registro 
					System.out.println("Lista de Tipos de Identificaci�n:");
					for (Object tipoIden : adminTipoIdentificacion.listar()) {
						System.out.println(tipoIden);
					}
					
					//2.- Seleccionar el Id y nombre
					System.out.print("\n Ingrese el Id de Identificaci�n que desea Actualizar:");
					int idAct = Integer.parseInt(UtilLectura.leerDesdeTeclado());
					System.out.print("Nombre Identificaci�n: ");
					nombre = UtilLectura.leerDesdeTeclado();
					
					//3.- Ingresar datos para Modificar
					System.out.print("Descripci�n Identificaci�n:");
					descripcion = UtilLectura.leerDesdeTeclado();
					estado = true;
					
					//4.- Llamar al constructor que tiene la clase
					tipoIdentificacion = new TipoIdentificacion(idAct, nombre, descripcion, estado);
					
					//5.-Procesar Informaci�n
					mensaje = adminTipoIdentificacion.actualizar(idAct, tipoIdentificacion);
					
					//6.- Visualizar Informaci�n
					System.out.println(mensaje);
					break;
				case 4:
					//1.- Listar Datos para seleccionar un registro 
					System.out.println("Eliminar Tipos de Identificaci�n");
					for (Object tipoIden : adminTipoIdentificacion.listar()) {
						System.out.println(tipoIden);
					}
					
					//2.- Seleccionar el Id
					System.out.print("\n Ingrese el Id de Identificaci�n que desea Eliminar:");
					int idEli = Integer.parseInt(UtilLectura.leerDesdeTeclado());
					
					//3.-Procesar Informaci�n
					mensaje = adminTipoIdentificacion.eliminar(idEli);

					//4.- Visualizar Informaci�n
					System.out.println(mensaje);
					
					break;
				case 5:
					FrmCatalogos frmCatalogos = new FrmCatalogos(userUsuario);
				default:
					System.err.println("Opci�n no valida");
					System.out.print("\n Ingrese una opci�n (1-5):");
					opcion = Integer.parseInt(UtilLectura.leerDesdeTeclado());
					break;
				}

			} catch (NumberFormatException e) {
				System.err.println("Seleccione solo n�meros");
			}


		} while (opcion != 5);

	}

}
