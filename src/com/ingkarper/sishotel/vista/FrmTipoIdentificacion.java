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
 *         de Identificación
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
			System.out.println("** Sistema de Gestión Hotelera V1.0 - Tipo Identificación **");
			System.out.println("************************************************************");
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
				switch (opcion) {
				case 1:
					System.out.println("Listar Tipos de Identificación");
					for (Object tipoIden : adminTipoIdentificacion.listar()) {
						System.out.println(tipoIden);
					}
					break;
				case 2:
					//1.- Recuperar los datos
					System.out.println("Ingresar Datos Tipo Identificación:");
					System.out.print("Id: ");
					int id = Integer.parseInt(UtilLectura.leerDesdeTeclado());
					System.out.print("Nombre Identificación: ");
					nombre = UtilLectura.leerDesdeTeclado();
					System.out.print("Descripción Identificación:");
					descripcion = UtilLectura.leerDesdeTeclado();
					estado = true;
					
					//2. Crear un registro del objeto Tipo de Identificación
					tipoIdentificacion = new TipoIdentificacion(id, nombre, descripcion, estado);
					
					//3.- Procesar Información
					mensaje = adminTipoIdentificacion.guardar(tipoIdentificacion);
					
					//4.- Visualizar información
					System.out.println(mensaje);
					break;
				case 3:
					//1.- Listar Datos para seleccionar un registro 
					System.out.println("Lista de Tipos de Identificación:");
					for (Object tipoIden : adminTipoIdentificacion.listar()) {
						System.out.println(tipoIden);
					}
					
					//2.- Seleccionar el Id y nombre
					System.out.print("\n Ingrese el Id de Identificación que desea Actualizar:");
					int idAct = Integer.parseInt(UtilLectura.leerDesdeTeclado());
					System.out.print("Nombre Identificación: ");
					nombre = UtilLectura.leerDesdeTeclado();
					
					//3.- Ingresar datos para Modificar
					System.out.print("Descripción Identificación:");
					descripcion = UtilLectura.leerDesdeTeclado();
					estado = true;
					
					//4.- Llamar al constructor que tiene la clase
					tipoIdentificacion = new TipoIdentificacion(idAct, nombre, descripcion, estado);
					
					//5.-Procesar Información
					mensaje = adminTipoIdentificacion.actualizar(idAct, tipoIdentificacion);
					
					//6.- Visualizar Información
					System.out.println(mensaje);
					break;
				case 4:
					//1.- Listar Datos para seleccionar un registro 
					System.out.println("Eliminar Tipos de Identificación");
					for (Object tipoIden : adminTipoIdentificacion.listar()) {
						System.out.println(tipoIden);
					}
					
					//2.- Seleccionar el Id
					System.out.print("\n Ingrese el Id de Identificación que desea Eliminar:");
					int idEli = Integer.parseInt(UtilLectura.leerDesdeTeclado());
					
					//3.-Procesar Información
					mensaje = adminTipoIdentificacion.eliminar(idEli);

					//4.- Visualizar Información
					System.out.println(mensaje);
					
					break;
				case 5:
					FrmCatalogos frmCatalogos = new FrmCatalogos(userUsuario);
				default:
					System.err.println("Opción no valida");
					System.out.print("\n Ingrese una opción (1-5):");
					opcion = Integer.parseInt(UtilLectura.leerDesdeTeclado());
					break;
				}

			} catch (NumberFormatException e) {
				System.err.println("Seleccione solo números");
			}


		} while (opcion != 5);

	}

}
