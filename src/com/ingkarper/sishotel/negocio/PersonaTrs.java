/**
 * 
 */
package com.ingkarper.sishotel.negocio;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.ingkarper.sishotel.modelo.MemoriaBD;
import com.ingkarper.sishotel.modelo.Persona;
import com.ingkarper.sishotel.modelo.TipoIdentificacion;

/**
 * @author CPerez Fecha: Mar 2, 2019 Clase que tendrá las operaciones del
 *         negocio relacionadas con la Persona
 */
public class PersonaTrs implements ICrudC {

	@Override
	public String guardar(Object registro) throws Exception {
		if (registro != null) {
			boolean banIng = MemoriaBD.personas.add((Persona) registro);
			if (banIng) {
				return "Datos Ingresados correctamente...";
			} else {
				return "El registro ya se encuentran ingresados!!!";
			}
		} else {
			return "Debe llenar todos los datos!!!";
		}
	}

	@Override
	public String actualizar(Object registro) throws Exception {
		if (registro != null) {
			int pos = MemoriaBD.personas.lastIndexOf(registro);
			if (pos >= 0) {
				MemoriaBD.personas.set(pos, (Persona) registro);
				return "Datos Ingresados correctamente...";
			} else {
				return "No se encuentran los datos ingresados!!!";
			}
		} else {
			return "Debe ingresar todos los datos!!!";
		}
	}

	@Override
	public String eliminar(Object registro) throws Exception {
		if (registro != null) {
			int pos = MemoriaBD.personas.lastIndexOf(registro);
			if (pos >= 0) {
				MemoriaBD.personas.remove(pos);
				return "Datos Eliminados correctamente...";
			} else {
				return "No se encuentran los datos ingresados!!!";
			}
		} else {
			return "Debe ingresar todos los datos";
		}
	}

	@Override
	public List<?> consultarTodos() throws Exception {
		return MemoriaBD.personas;
	}

	@Override
	public Object consultaPorId(int id) throws Exception {
		Persona perEnc = null;
		try {
			for (Persona per : MemoriaBD.personas) {
				if (per.getIdPer() == id) {
					perEnc = per;
				}
			}
			
		} catch (Exception e) {
			throw new Exception("Persona no ingresada!!!");
		}
		return perEnc;
	}
	

	public int calculaEdad (Date fechaNacimiento) {
		Calendar fechaActual = Calendar.getInstance();
		Calendar fechaN = Calendar.getInstance();
		fechaN.setTime(fechaNacimiento); 
		int anios = fechaActual.get(Calendar.YEAR)- fechaN.get(Calendar.YEAR);
		int meses = fechaActual.get(Calendar.MONTH) - fechaN.get(Calendar.MONTH);
		int dias = fechaActual.get(Calendar.DAY_OF_MONTH) - fechaN.get(Calendar.DAY_OF_MONTH);
		
		if (meses<  0 || (meses==0 && dias < 0)) {
			anios --;
		}
		return anios;
		
	}
	
	public int calculaEdadv2 (Calendar fechaNacimiento) {
		Calendar fechaActual = Calendar.getInstance();
	
		int anios = fechaActual.get(Calendar.YEAR)- fechaNacimiento.get(Calendar.YEAR);
		int meses = fechaActual.get(Calendar.MONTH) - fechaNacimiento.get(Calendar.MONTH);
		int dias = fechaActual.get(Calendar.DAY_OF_MONTH) - fechaNacimiento.get(Calendar.DAY_OF_MONTH);
		
		if (meses<  0 || (meses==0 && dias < 0)) {
			anios --;
		}
		return anios;
		
	}


//	public static void main(String[] args) {
//		PersonaTrs persona = new PersonaTrs();
//		
//		
//		SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
//		
//		try {
//			int edad = persona.calculaEdad(formatoFecha.parse("17/12/1987"));
//			System.out.println(edad);
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	
	public String validarCedula(TipoIdentificacion tipIden, String identificacion) {
		int idTipIden = tipIden.getIdTip();
		int suma = 0;
		String mensaje = null;

		if (tipIden != null) {
			if (identificacion != null) {
				switch (idTipIden) {
				case 1:
					if (identificacion.length() == 10) {
						int a[] = new int[identificacion.length() / 2];
						int b[] = new int[(identificacion.length() / 2)];
						int c = 0;
						int d = 1;
						for (int i = 0; i < identificacion.length() / 2; i++) {
							a[i] = Integer.parseInt(String.valueOf(identificacion.charAt(c)));
							c = c + 2;
							if (i < (identificacion.length() / 2) - 1) {
								b[i] = Integer.parseInt(String.valueOf(identificacion.charAt(d)));
								d = d + 2;
							}
						}

						for (int i = 0; i < a.length; i++) {
							a[i] = a[i] * 2;
							if (a[i] > 9) {
								a[i] = a[i] - 9;
							}
							suma = suma + a[i] + b[i];
						}
						int aux = suma / 10;
						int dec = (aux + 1) * 10;
						if ((dec - suma) == Integer
								.parseInt(String.valueOf(identificacion.charAt(identificacion.length() - 1))))
							return null;
						else if (suma % 10 == 0 && identificacion.charAt(identificacion.length() - 1) == '0') {
							return null;
						} else {
							return "Cédula incorrecta!!!";
						}
					} else
						return "Número de Dígitos incorrectos!!!";
				case 3:
					if (identificacion.length() == 13) {
						if (identificacion.substring(10, 13).equals("001")) {
							String idenTmp = identificacion.substring(0, 10);
							int a[] = new int[idenTmp.length() / 2];
							int b[] = new int[(idenTmp.length() / 2)];
							int c = 0;
							int d = 1;
							for (int i = 0; i < idenTmp.length() / 2; i++) {
								a[i] = Integer.parseInt(String.valueOf(idenTmp.charAt(c)));
								c = c + 2;
								if (i < (idenTmp.length() / 2) - 1) {
									b[i] = Integer.parseInt(String.valueOf(idenTmp.charAt(d)));
									d = d + 2;
								}
							}

							for (int i = 0; i < a.length; i++) {
								a[i] = a[i] * 2;
								if (a[i] > 9) {
									a[i] = a[i] - 9;
								}
								suma = suma + a[i] + b[i];
							}
							int aux = suma / 10;
							int dec = (aux + 1) * 10;
							if ((dec - suma) == Integer.parseInt(String.valueOf(idenTmp.charAt(idenTmp.length() - 1))))
								return null;
							else if (suma % 10 == 0 && idenTmp.charAt(idenTmp.length() - 1) == '0') {
								return null;
							} else {
								return "Ruc incorrecto!!!";
							}
						}else return "Ruc no finaliza en 001";
					} else
						return "Número de Dígitos incorrectos!!!";

				default:
					return null;
				}

			} else {
				mensaje = "Identificación nula";
			}
		} else
			mensaje = "Tipo Identificación nula";

		return mensaje;
	}
}
