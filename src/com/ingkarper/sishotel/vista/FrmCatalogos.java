/**
 * 
 */
package com.ingkarper.sishotel.vista;

import com.ingkarper.sishotel.modelo.Usuario;
import com.ingkarper.sishotel.negocio.util.UtilLectura;

/**
 * @author CPerez
 * Fecha: Mar 2, 2019
 * Clase que representa a las tablas de catálogos
 */
public class FrmCatalogos {

	public FrmCatalogos(Usuario userUsuario) {
		creaMenuCatalogos(userUsuario);
	}

	private void creaMenuCatalogos(Usuario userUsuario) {
		int opcion = 0;
		do {
			System.out.println("\n\n");
			System.out.println("**************************************************");
			System.out.println("** Sistema de Gestión Hotelera V1.0 - Catálogos **");
			System.out.println("**************************************************");
			System.out.println("Usuario: " + userUsuario.getUserIdUsu());
			System.out.println("\n");
			System.out.println("1. Tipo de Identificación");
			System.out.println("2. Estado Civil");
			System.out.println("3. Paises");
			System.out.println("4. Provincia");
			System.out.println("5. Ciudad");
			System.out.println("6. Regresar....");
			System.out.print("\n Ingrese una opción (1-6):");
			
			try {
				opcion = Integer.parseInt(UtilLectura.leerDesdeTeclado());
			} catch (NumberFormatException e) {
				System.err.println("Seleccione solo números");
			}

			switch (opcion) {
			case 1:
				FrmTipoIdentificacion frmTipoIdentificacion = new FrmTipoIdentificacion(userUsuario);
				break;
			case 2:
				FrmEstadoCivil frmEstadoCivil = new FrmEstadoCivil(userUsuario);
				break;
			case 3:
				FrmPais frmPais = new FrmPais(userUsuario);
				break;
			case 4:
				FrmProvincia frmProvincia = new FrmProvincia(userUsuario);
				break;
			case 5:
				FrmCiudad frmCiudad = new FrmCiudad(userUsuario);
				break;
			case 6:
				FrmPrincipal frmPrincipal = new FrmPrincipal(userUsuario);
				break;
			default:
				System.err.println("Opción no valida");
				break;
			}

		} while (opcion != 6);

		
	}

}
