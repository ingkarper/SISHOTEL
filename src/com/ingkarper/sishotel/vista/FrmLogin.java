/**
 * 
 */
package com.ingkarper.sishotel.vista;

import com.ingkarper.sishotel.modelo.MemoriaBD;
import com.ingkarper.sishotel.modelo.Usuario;
import com.ingkarper.sishotel.negocio.UsuarioTrs;
import com.ingkarper.sishotel.negocio.util.UtilLectura;

/**
 * @author CPerez Fecha: Mar 2, 2019 Clase que representa al formulario de login
 */
public class FrmLogin {
	
	public static Usuario usuarioSesion;
	
	public static void main(String[] args) {
		System.out.println("******************************************");
		System.out.println("**   Sistema de Gestión Hotelera V1.0   **");
		System.out.println("******************************************");
		System.out.println("\n");
		boolean banIng = false;
		for (int i = 0; i < MemoriaBD.maximoNumeroVeces; i++) {
			//1.- Recuperar valores
			System.out.print("Usuario:");
			String usuario =  UtilLectura.leerDesdeTeclado();
			System.out.print("Contraseña:"); 
			String clave = UtilLectura.leerDesdeTeclado();
			
			//2.- Enviar valoes y verificar si es el usuario 
			UsuarioTrs usuarioTrs = new UsuarioTrs(); 
			usuarioSesion = usuarioTrs.validarUsuario(usuario, clave);
			
			//3.- Usuario correcto llamar a formulario principal
			if (usuarioSesion != null) {
				banIng = true;
				FrmPrincipal frmPrincipal = new FrmPrincipal(usuarioSesion);
			}else {
				System.err.println("Usuario no encontrado!!!");
			}
			System.out.println("\n Ingresar nuevamente \n");
		}
		
		if (banIng == false)
		{
			System.out.println("Superó el número máximo de intentos"); 
		}
	}
}
