/**
 * 
 */
package com.ingkarper.sishotel.modelo;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import com.ingkarper.sishotel.negocio.EstadoCivilTrs;
import com.ingkarper.sishotel.negocio.PaisTrs;
import com.ingkarper.sishotel.negocio.ProvinciaTrs;
import com.ingkarper.sishotel.negocio.TipoIdentificacionTrs;

/**
 * @author CPerez
 * Fecha: Mar 2, 2019
 * Clase que representa en memoria a los registros almacenados en una Base de Datos
 * 	-Estructura de datos (Estaticas o dinamicas) 
 * 	-Varias tablas (contenedores de información de un cierto tipo) 
 * 	-Relaciones (Forma se articula esos contenedores) 
 * 	-Lenguaje  para consultar esta información 
 * 	-Operación CRUD  se realizan sobre una o varias tablas 
 *  	C (Create o insertar o guardar), 
 *  	R (Retrieve - Consultar), 
 *  	U (Update, actualizar o modificar), 
 *  	D (Delete o eliminar o remover)
 */
public class MemoriaBD {
	/*
	 * Cuando se coloca a una variable como static solamente se crea un espacio de memoria independientemente, 
	 * si crean n objetos Ejemplo: Contador de paginas Web 
	 */
	public static Perfil[] perfiles;
	public static RolEmpleado[] rolEmpleados;
	public static ArrayList<Persona> personas;
	public static Usuario[] usuarios;
	public static TipoIdentificacion[] tipoIdentificaciones;
	public static ArrayList<Ciudad> ciudades;
	public static Provincia[] provincias;
	public static EstadoCivil[] estadoCiviles;
	public static Pais[] paises;
	public static int maximoNumeroVeces = 3;
	
	//Bloque Static es un bloque automático que solo soporta temas static 
	static {
		perfiles = new Perfil[5];
		rolEmpleados = new RolEmpleado[5];
		tipoIdentificaciones = new TipoIdentificacion[4];
		rolEmpleados = new RolEmpleado[5];
		personas = new ArrayList<Persona>();
		usuarios = new Usuario[5];
		ciudades = new ArrayList<Ciudad>();
		provincias = new Provincia[24];
		estadoCiviles = new EstadoCivil[6];
		paises = new Pais[5];
		inicializarUsuario();
	}
	
	public static void inicializarUsuario () {
		
		tipoIdentificaciones[0] = new TipoIdentificacion(1, "Cédula", "Identificación de personas de un mismo país", true);
		tipoIdentificaciones[1] = new TipoIdentificacion(2,"Pasaporte","Identificación de personas de un país extranjero",true) ;
		tipoIdentificaciones[2] = new TipoIdentificacion(3,"Ruc","Identificación de Empresas", true);
		
		estadoCiviles[0] = new EstadoCivil(1, "Soltero/a", "Persona que se encuentra sin convivir con otra persona", true);
		estadoCiviles[1] = new EstadoCivil(2, "Casado/a","Persona que se encuentra convivinedo con una persona", true);
		estadoCiviles[2] = new EstadoCivil(3, "Unión Libre","Persona que vide con otra persona sin la necesidad de casamiento" , true) ;
		estadoCiviles[3] = new EstadoCivil(4, "Divorciado/a","Persona que estuvo casado, pero en la actualidad no se encuentra con esa persona", true);
		estadoCiviles[4] = new EstadoCivil(5, "Viudo/a", "Persona quien perdió a su conviviente",true);

		paises[0] = new Pais(1,"Ecuador","Ubicado en Sudaméria del continente Americano",true);
		
		PaisTrs adminPais = new PaisTrs();
		Pais pais = (Pais) adminPais.consultarPorId(1);
		
		provincias[0] = new Provincia(1, "Azuay","Sierra",true, pais);
		provincias[1] = new Provincia(2, "Bolivar","Sierra",true, pais);
		provincias[2] = new Provincia(3, "Cañar","Sierra",true, pais);
		provincias[3] = new Provincia(4, "Carchi","Sierra",true, pais);
		provincias[4] = new Provincia(5, "Chimborazo","Sierra",true, pais);
		provincias[5] = new Provincia(6, "Cotopaxi","Sierra",true, pais);
		provincias[6] = new Provincia(7, "El Oro","Costa",true, pais);
		provincias[7] = new Provincia(8, "Esmaraldas","Costa",true, pais);
		provincias[8] = new Provincia(9, "Galápagos","Insular",true, pais);
		provincias[9] = new Provincia(10, "Guayas","Costa",true, pais);
		provincias[10] = new Provincia(11, "Imbabura","Sierra",true, pais);
		provincias[11] = new Provincia(12, "Loja","Sierra",true, pais);
		provincias[12] = new Provincia(13, "Los Ríos","Costa",true, pais);
		provincias[13] = new Provincia(14, "Manabí","Costa",true, pais);
		provincias[14] = new Provincia(15, "Morona Santiago","Oriente",true, pais);
		provincias[15] = new Provincia(16, "Napo","Oriente",true, pais);
		provincias[16] = new Provincia(17, "Orellena","Oriente",true, pais);
		provincias[17] = new Provincia(18, "Pastaza","Oriente",true, pais);
		provincias[18] = new Provincia(19, "Pichincha","Sierra",true, pais);
		provincias[19] = new Provincia(20, "Santa Elena","Costa",true, pais);
		provincias[20] = new Provincia(21, "Santo Domingo de los Tsáchilas","Costa",true, pais);
		provincias[21] = new Provincia(22, "Sucumbíos","Oriente",true, pais);
		provincias[22] = new Provincia(23, "Tungurahua","Sierra",true, pais);
		provincias[23] = new Provincia(24, "Zamora Chinchipe","Oriente",true, pais);
	
		ProvinciaTrs adminPro = new ProvinciaTrs();
		Provincia provincia= null;
		
		try {
			provincia = (Provincia) adminPro.consultarPorId(1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ciudades.add(new Ciudad (1, "Cuenca","Capital", true, provincia));
		try {
			provincia = (Provincia) adminPro.consultarPorId(2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ciudades.add(new Ciudad(2, "Guaranda","Capital", true, provincia));
		try {
			provincia = (Provincia) adminPro.consultarPorId(3);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ciudades.add(new Ciudad(3, "Azogues", "Capital",true, provincia));
		try {
			provincia = (Provincia) adminPro.consultarPorId(4);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ciudades.add(new Ciudad(4, "Tulcán", "Capital",true, provincia));
		try {
			provincia = (Provincia) adminPro.consultarPorId(5);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ciudades.add(new Ciudad(5, "Riobamba","Capital" ,true, provincia));
		try {
			provincia = (Provincia) adminPro.consultarPorId(6);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ciudades.add(new Ciudad(6, "Latacunga","Capital", true, provincia));
		try {
			provincia = (Provincia) adminPro.consultarPorId(7);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ciudades.add(new Ciudad(7, "Machala","Capital", true, provincia));
		try {
			provincia = (Provincia) adminPro.consultarPorId(8);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ciudades.add(new Ciudad(8, "Esmeraldas","Capital", true, provincia));
		try {
			provincia = (Provincia) adminPro.consultarPorId(9);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ciudades.add(new Ciudad(9, "Puerto Baquerizo Moreno","Capital", true, provincia));
		try {
			provincia = (Provincia) adminPro.consultarPorId(10);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ciudades.add(new Ciudad(10, "Guayaquil","Capital", true, provincia));
		try {
			provincia = (Provincia) adminPro.consultarPorId(11);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ciudades.add(new Ciudad(11, "Ibarra","Capital", true, provincia));
		try {
			provincia = (Provincia) adminPro.consultarPorId(12);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ciudades.add(new Ciudad(12, "Loja","Capital", true, provincia));
		try {
			provincia = (Provincia) adminPro.consultarPorId(13);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ciudades.add(new Ciudad(13, "Babahoyo","Capital", true, provincia));
		try {
			provincia = (Provincia) adminPro.consultarPorId(14);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ciudades.add(new Ciudad(14, "Portoviejo","Capital", true, provincia));
		try {
			provincia = (Provincia) adminPro.consultarPorId(15);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ciudades.add(new Ciudad(15, "Macas","Capital", true, provincia));
		try {
			provincia = (Provincia) adminPro.consultarPorId(16);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ciudades.add(new Ciudad(16, "Tena","Capital", true, provincia));
		try {
			provincia = (Provincia) adminPro.consultarPorId(17);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ciudades.add(new Ciudad(17, "Francisco de Orellana","Capital", true, provincia));
		try {
			provincia = (Provincia) adminPro.consultarPorId(18);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ciudades.add(new Ciudad(18, "Puyo","Capital", true, provincia));
		try {
			provincia = (Provincia) adminPro.consultarPorId(19);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ciudades.add(new Ciudad(19, "Quito","Capital", true, provincia));
		try {
			provincia = (Provincia) adminPro.consultarPorId(20);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ciudades.add(new Ciudad(20, "Santa Elena","Capital", true, provincia));
		try {
			provincia = (Provincia) adminPro.consultarPorId(21);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ciudades.add(new Ciudad(21, "Santo Domingo","Capital", true, provincia));
		try {
			provincia = (Provincia) adminPro.consultarPorId(22);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ciudades.add(new Ciudad(22, "Nueva Loja","Capital", true, provincia));
		try {
			provincia = (Provincia) adminPro.consultarPorId(23);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ciudades.add(new Ciudad(23, "Ambato","Capital", true, provincia));
		try {
			provincia = (Provincia) adminPro.consultarPorId(24);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ciudades.add(new Ciudad(24, "Zamora","Capital", true, provincia));
		
		perfiles[0] = new Perfil(1, "Administrador", "Administración del sitio", true, new Date(), "Default");
//		perfiles[2] = new Perfil(1, "Gerencial", "Perfil para opciones administrativas", true, new Date(), "Default");
//		perfiles[3] = new Perfil(1, "Tactico", "Perfil para opciones de supervición", true, new Date(), "Default");
//		perfiles[4] = new Perfil(1, "Operativo", "Perfil para opciones de operativos", true, new Date(), "Default");
//		perfiles[5] = new Perfil(1, "Invitado", "Invitado del sitio", true, new Date(), "Default");
		
	
		rolEmpleados[0] = new RolEmpleado(1, "Administrador", "Administradores del sitio ", true);
		rolEmpleados[0] = new RolEmpleado(new BigDecimal("0.00"), null, new Perfil());
//		rolEmpleados[1] = new RolEmpleado(2, "Gerente", "Gestionar cada una de las áreas", true);
//		rolEmpleados[1] = new RolEmpleado(new BigDecimal("2000.00"), null, new Perfil());
//		rolEmpleados[2] = new RolEmpleado(3, "Jefe", "Jefe de cada una de las áreas", true);
//		rolEmpleados[2] = new RolEmpleado(new BigDecimal("1200.00"), null, new Perfil());
//		rolEmpleados[3] = new RolEmpleado(3, "Recepcionista", "Información y Reservas de clientes", true);
//		rolEmpleados[3] = new RolEmpleado(new BigDecimal("400.00"), null, new Perfil());
		
		TipoIdentificacionTrs adminTipIden = new TipoIdentificacionTrs();
		TipoIdentificacion tipIden = null;
		try {
			tipIden = (TipoIdentificacion) adminTipIden.consultarPorId(1);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		EstadoCivilTrs adminEstCiv = new EstadoCivilTrs();
		EstadoCivil estCiv= null;
		try {
			estCiv = (EstadoCivil) adminEstCiv.consultarPorId(1);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		SimpleDateFormat formatofecha = new SimpleDateFormat("dd/MM/yyyy");
		Date fecha = null;
		try {
			fecha = formatofecha.parse("17/12/1987");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		personas.add(new Persona(1, tipIden, "12345678901", "Perez", "Lascano", "Carlos", "Hernando", fecha, estCiv, true));
		
		usuarios[0] = new Usuario("cperez","1234", false, new RolEmpleado());
		
	}

}
