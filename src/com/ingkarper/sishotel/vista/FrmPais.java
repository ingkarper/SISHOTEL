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
			System.out.println("** Sistema de Gesti�n Hotelera V1.0 - Pa�s **");
			System.out.println("*********************************************");
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
			} catch (NumberFormatException e) {
				System.err.println("Seleccione solo n�meros");
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
				System.out.println("Ingresar Datos Pa�s:");
				System.out.print("Id: ");
				int id = Integer.parseInt(UtilLectura.leerDesdeTeclado());
				System.out.print("Pa�s: ");
				nombre = UtilLectura.leerDesdeTeclado();
				System.out.print("Descripci�n: ");
				descripcion = UtilLectura.leerDesdeTeclado();
				estado = true;

				// 2. Crear un registro del objeto Tipo de Identificaci�n
				pais = new Pais(id, nombre, descripcion, estado);

				// 3.- Procesar Informaci�n
				mensaje = adminPais.guardar(pais);

				// 4.- Visualizar informaci�n
				System.out.println(mensaje);
				break;
			case 3:
				//1.- Listar Datos para seleccionar un registro 
				System.out.println("Lista de Paises:");
				for (Object paisL : adminPais.listar()) {
					System.out.println(paisL);
				}
				
				//2.- Seleccionar el Id y nombre
				System.out.print("\n Ingrese el Id de Pa�s que desea Actualizar:");
				int idAct = Integer.parseInt(UtilLectura.leerDesdeTeclado());
				System.out.print("Pa�s: ");
				nombre = UtilLectura.leerDesdeTeclado();
				
				//3.- Ingresar datos para Modificar
				System.out.print("Descripci�n:");
				descripcion = UtilLectura.leerDesdeTeclado();
				estado = true;
				
				//4.- Llamar al constructor que tiene la clase
				pais = new Pais(idAct, nombre, descripcion, estado);
				
				//5.-Procesar Informaci�n
				mensaje = adminPais.actualizar(idAct, pais);
				
				//6.- Visualizar Informaci�n
				System.out.println(mensaje);

				break;
			case 4:
				//1.- Listar Datos para seleccionar un registro 
				System.out.println("Eliminar Pa�s");
				for (Object paisL : adminPais.listar()) {
					System.out.println(paisL);
				}
				
				//2.- Seleccionar el Id
				System.out.print("\n Ingrese el Id de Pa�s que desea Eliminar:");
				int idEli = Integer.parseInt(UtilLectura.leerDesdeTeclado());
				
				//3.-Procesar Informaci�n
				mensaje = adminPais.eliminar(idEli);

				//4.- Visualizar Informaci�n
				System.out.println(mensaje);

				break;
			case 5:
				FrmCatalogos frmCatalogos = new FrmCatalogos(userUsuario);
				break;
			default:
				System.err.println("Opci�n no valida");
				break;
			}

		} while (opcion != 5);

	}

}
