/**
 * 
 */
package com.ingkarper.sishotel.vista;

import java.math.BigDecimal;
import java.util.Date;

import com.ingkarper.sishotel.modelo.RolEmpleado;
import com.ingkarper.sishotel.modelo.Usuario;
import com.ingkarper.sishotel.negocio.RolEmpleadoTrs;
import com.ingkarper.sishotel.negocio.util.UtilLectura;

/**
 * @author CPerez Fecha: Mar 2, 2019 Clase que representa al formulario de Roles
 *         de Empleados
 */
public class FrmRolEmlpeado {

	public FrmRolEmlpeado(Usuario userUsuario) {
		creaMenuRolEmpelado(userUsuario);
	}

	private void creaMenuRolEmpelado(Usuario userUsuario) {
		RolEmpleado rolEmpleado = new RolEmpleado();
		RolEmpleadoTrs adminRolEmpleado = new RolEmpleadoTrs();
		int opcion = 0;
		do {
			System.out.println("\n\n");
			System.out.println("*****************************************************");
			System.out.println("** Sistema de Gestión Hotelera V1.0 - Rol Empleado **");
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
				System.out.println("Listar Roles de Empleado");
				adminRolEmpleado.listar();
				System.out.print("\n Ingrese una opción (1-5):");
				opcion = Integer.parseInt(UtilLectura.leerDesdeTeclado());
				break;
			case 2:
				// 1.- Recuperar los datos
				System.out.println("Ingresar Datos Rol Empleado:");
				System.out.print("Id: ");
				int id = Integer.parseInt(UtilLectura.leerDesdeTeclado());
				System.out.print("Rol Empleado: ");
				String nombre = UtilLectura.leerDesdeTeclado();
				System.out.print("Descripción:");
				String descripcion = UtilLectura.leerDesdeTeclado();
				System.out.print("Salario: ");
				BigDecimal salario = new BigDecimal (UtilLectura.leerDesdeTeclado());
				
				// 2. Crear un registro del objeto Tipo de Identificación
				rolEmpleado.setIdTip(id);
				rolEmpleado.setNombreTip(nombre);
				rolEmpleado.setEstadoTip(true);
				rolEmpleado.setDescripcionTip(descripcion);
				rolEmpleado.setSalarioRem(salario);
				// 3.- Llamar al contrucotor que tiene las clases
				String mensaje = adminRolEmpleado.guardar(rolEmpleado);

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
				FrmAdminPersonal frmAdministracionPersonal = new FrmAdminPersonal(userUsuario);
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
