/**
 * 
 */
package com.devpredator.projectjsf.controllers;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import com.devpredator.projectjsf.dto.UsuarioDTO;

/**
 * @author Fernando Martinez Z
 * Clase que permite controlar el funcionamiento  de la pantalla de login.xhtml.
 */
@ManagedBean
public class LoginController {
	
	private String usuario;
	private String password;
	
	
	/**
	 * Bean que mantiene la informacion de la sesion
	 */
	@ManagedProperty("#{sessionController}")
	private SessionController sesionController;
	
	
	
	
	

	public SessionController getSesionController() {
		return sesionController;
	}
	public void setSesionController(SessionController sesionController) {
		this.sesionController = sesionController;
	}
	/**
	 * Metodo que nos va permitir entrar a la pantalla principal del sistema
	 */
	public void ingresar()
	{
		System.out.println("El nombre de la persona es " + usuario);
		if(usuario.equals("Fernando") && password.equals("12345"))
		{
			try {
				UsuarioDTO usuarioDTO = new UsuarioDTO();
				usuarioDTO.setUsuario(usuario);
				usuarioDTO.setPassword(password);
				this.sesionController.setUsuarioDTO(usuarioDTO);
				this.redireccionar("principal.xhtml");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				FacesContext.getCurrentInstance().addMessage("formLogin:txtUsuario", new FacesMessage(FacesMessage.SEVERITY_FATAL, "Pagina no existe", "") );
				e.printStackTrace();
			}
		}else{
			FacesContext.getCurrentInstance().addMessage("formLogin:txtUsuario", new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuario y/o Password InCorrecto", "") );
		}
	}
	/**
	 * @return the usuario
	 */
	public String getUsuario() {
		return usuario;
	}
	
	private void redireccionar(String pagina) throws IOException
	{
		ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
		ec.redirect(pagina);
	}
	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
