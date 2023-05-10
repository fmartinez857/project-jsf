/**
 * 
 */
package com.devpredator.projectjsf.dto;

/**
 * @author FernandoMZ
 * Clase que permitira contener la informacion del usuario en sesion
 */
public class UsuarioDTO {
	
	/**
	 * Nickname
	 */
	private String usuario;
	
	/**
	 * Password
	 */
	private String password;

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	

}
