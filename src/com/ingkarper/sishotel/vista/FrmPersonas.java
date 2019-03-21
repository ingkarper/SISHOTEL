/**
 * 
 */
package com.ingkarper.sishotel.vista;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.ingkarper.sishotel.modelo.Ciudad;
import com.ingkarper.sishotel.modelo.EstadoCivil;
import com.ingkarper.sishotel.modelo.Persona;
import com.ingkarper.sishotel.modelo.TipoIdentificacion;
import com.ingkarper.sishotel.modelo.Usuario;
import com.ingkarper.sishotel.negocio.EstadoCivilTrs;
import com.ingkarper.sishotel.negocio.PersonaTrs;
import com.ingkarper.sishotel.negocio.TipoIdentificacionTrs;
import com.ingkarper.sishotel.negocio.util.UtilLectura;
import com.sun.javafx.css.CalculatedValue;

/**
 * @author CPerez Fecha: Mar 2, 2019 Clase que representa al Formulario de
 *         registro de Personas
 */
public class FrmPersonas {

	public FrmPersonas(Usuario userUsuario) {
		creaMenuPersonas(userUsuario);
	}

	private void creaMenuPersonas(Usuario userUsuario) {
		Persona persona = new Persona();
		PersonaTrs adminpersona = new PersonaTrs();
		Object listaTipIden = null;
		TipoIdentificacionTrs adminTipIden = new TipoIdentificacionTrs();
		Object listaEstCiv = null;
		EstadoCivilTrs adminEstCiv = new EstadoCivilTrs();
		String identificacion = null;
		String apellidoPaterno = null;
		String apellidoMaterno = null;
		String primerNombre = null;
		String segundoNombre = null;
		Date fechaNacimiento = null;
		SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
		boolean estado = false;
		int idTipIden = 0;
		int idEstCiv = 0;
		int opcion = 0;
		int id = 0;
		int edad = 0;
		Calendar fechaCal = Calendar.getInstance();
		do {
			System.out.println("\n\n");
			System.out.println("**************************************************");
			System.out.println("** Sistema de Gestión Hotelera V1.0 - Personas  **");
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
				System.out.println("Lista de Personas");
				try {
					for (Object per : adminpersona.consultarTodos()) {
						System.out.println(per);
					}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				break;
			case 2:
				String mensaje;
				try {
					// 1.- Recuperar los datos
					System.out.println("Ingresar Datos Persona:");
					System.out.print("Id: ");
					id = Integer.parseInt(UtilLectura.leerDesdeTeclado());
					System.out.println("Tipo de Identificaciones:");
					System.out.println(adminTipIden.impimirListaFormateada());
					System.out.print("Ingrese Id Tipo de Identificación: ");
					idTipIden = Integer.parseInt(UtilLectura.leerDesdeTeclado());
					try {
						listaTipIden = adminTipIden.consultarPorId(idTipIden);

						System.out.print("Identificación: ");
						identificacion = UtilLectura.leerDesdeTeclado();
						String valIden = adminpersona.validarCedula((TipoIdentificacion) listaTipIden, identificacion);
						if (valIden != null) {
							System.err.println(valIden);
							break;
						}
						System.out.print("Apellido Paterno:");
						apellidoPaterno = UtilLectura.leerDesdeTeclado();
						System.out.print("Apellido Materno: ");
						apellidoMaterno = UtilLectura.leerDesdeTeclado();
						System.out.print("Primer Nombre: ");
						primerNombre = UtilLectura.leerDesdeTeclado();
						System.out.print("Segundo Nombre: ");
						segundoNombre = UtilLectura.leerDesdeTeclado();
						System.out.print("Fecha Nacimiento (dd/MM/yyyy): ");
						try {
							fechaNacimiento = formatoFecha.parse(UtilLectura.leerDesdeTeclado());
							System.out.print("Edad: ");
							fechaCal.setTime(fechaNacimiento);
							edad =  adminpersona.calculaEdadv2(fechaCal) ;
							System.out.println(edad);
							System.out.println("Estado Civil");
							System.out.println(adminEstCiv.imprimirListaFormateada());
							System.out.print("Ingrese Id de Estado Civil: ");
							idEstCiv = Integer.parseInt(UtilLectura.leerDesdeTeclado());
							try {
								listaEstCiv = adminEstCiv.consultarPorId(idEstCiv);
								if (listaEstCiv == null) {
									System.err.println("Estado Civil no válido");
									return;
								}

								estado = true;
								// 2.- Llamar al constructor que tiene las clases
								persona = new Persona(id, (TipoIdentificacion) listaTipIden, identificacion,
										apellidoPaterno, apellidoMaterno, primerNombre, segundoNombre, fechaNacimiento,
										(EstadoCivil) listaEstCiv, estado);

								mensaje = adminpersona.guardar(persona);

								// 5.- Visualizar información
								System.out.println(mensaje);

							} catch (Exception e) {
								System.err.println(e.getMessage());
							}
						} catch (ParseException ex) {
							System.err.println("Fecha Incorrecta dd/MM/yyyy");
						}
					} catch (Exception e) {
						System.err.println(e.getMessage());
					}
				} catch (NumberFormatException e) {
					System.err.println("Ingrese solo números");
				}
				break;
			case 3:
				System.out.println("Lista de Personas:");
				listaTipIden = null;
				// 1.- Listar Datos para seleccionar un registro
				try {
					for (Object per : adminpersona.consultarTodos()) {
						System.out.println(per);
					}
				} catch (Exception e2) {
					System.err.println(e2.getMessage());
				}
				// 2.- Seleccionar el Id y nombre
				try {
					System.out.print("\n Ingrese el Id de la Persona que desea Actualizar:");
					int idAct = Integer.parseInt(UtilLectura.leerDesdeTeclado());
					System.out.println("Tipo de Identificaciones:");
					System.out.println(adminTipIden.impimirListaFormateada());
					System.out.print("Ingrese Id Tipo de Identificación: ");
					idTipIden = Integer.parseInt(UtilLectura.leerDesdeTeclado());

					try {
						listaTipIden = adminTipIden.consultarPorId(idTipIden);

						System.out.print("Identificación: ");
						identificacion = UtilLectura.leerDesdeTeclado();
						String valIden = adminpersona.validarCedula((TipoIdentificacion) listaTipIden, identificacion);
						if (valIden != null) {
							System.err.println(valIden);
							break;
						}
						// 3.- Ingresar datos para Modificar
						System.out.print("Apellido Paterno:");
						apellidoPaterno = UtilLectura.leerDesdeTeclado();
						System.out.print("Apellido Materno: ");
						apellidoMaterno = UtilLectura.leerDesdeTeclado();
						System.out.print("Primer Nombre: ");
						primerNombre = UtilLectura.leerDesdeTeclado();
						System.out.print("Segundo Nombre: ");
						segundoNombre = UtilLectura.leerDesdeTeclado();
						System.out.print("Fecha Nacimiento: ");
						try {
							fechaNacimiento = formatoFecha.parse(UtilLectura.leerDesdeTeclado());
							edad = adminpersona.calculaEdad(fechaNacimiento);
							
							System.out.println("Estado Civil");
							
							System.out.println("Edades : ");
							System.out.println(edad);

							
							
							System.out.println(adminEstCiv.imprimirListaFormateada());
							System.out.print("Ingrese Id de Estado Civil: ");
							idEstCiv = Integer.parseInt(UtilLectura.leerDesdeTeclado());
							listaEstCiv = adminEstCiv.consultarPorId(idEstCiv);
							estado = true;

							// 4.- Llamar al constructor que tiene la clase
							persona = new Persona(idAct, (TipoIdentificacion) listaTipIden, identificacion,
									apellidoPaterno, apellidoMaterno, primerNombre, segundoNombre, fechaNacimiento,
									(EstadoCivil) listaEstCiv, estado);

							// 5.-Procesar Información
							mensaje = adminpersona.actualizar(persona);

							// 6.- Visualizar Información
							System.out.println(mensaje);
						} catch (ParseException ex) {
							System.err.println("Ingrese solo fecha!!! \n");
						}

					} catch (Exception e1) {
						System.err.println(e1.getMessage());
					}

				} catch (NumberFormatException e) {
					System.err.println("Ingrese solo números!!!");
				}

				break;
			case 4:
				System.out.println("Eliminar Personas:");
				listaTipIden = null;
				Persona persEli = null;
				// 1.- Listar Datos para seleccionar un registro
				try {
					for (Object per : adminpersona.consultarTodos()) {
						System.out.println(per);
					}
					try {
						System.out.print("\n Ingrese el Id de la Persona que desea Eliminar:");
						int idEli = Integer.parseInt(UtilLectura.leerDesdeTeclado());
						try {
							persEli = (Persona) adminpersona.consultaPorId(idEli);

							mensaje = adminpersona.eliminar(persEli);
							System.out.println(mensaje);

						} catch (Exception e) {
							System.err.println(e.getMessage());
						}
					} catch (NumberFormatException e) {
						System.err.println("Ingrese solo números");
					}
				} catch (Exception e) {
					System.err.println("No se visualizan los datos de Consulta");
				}
				break;
			case 5:
				FrmPrincipal frmPrincipal = new FrmPrincipal(userUsuario);
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
