/*
 * 
 */
package com.devpredator.projectjsf.controllers;

import javax.faces.bean.ManagedBean;
import javax.annotation.PostConstruct;
import javax.faces.bean.SessionScoped;

import com.devpredator.projectjsf.dto.UsuarioDTO;

/**
 * @author FernandoMZ
 * Clase que se encarga de mantener la informacion del Usuario que ingresa al aplicativo en la sesion
 */

@ManagedBean
@SessionScoped
public class SessionController {
	
	/**
	 * Usuario que se mantendra en sesion
	 */
	private UsuarioDTO usuarioDTO;
	
	/**
	 * Inicializa la sesion del Usuario
	 */
	@PostConstruct
	public void init() {
		System.out.println("Cargando Informacion del Usuario en la sesion");
	}

	public UsuarioDTO getUsuarioDTO() {
		return usuarioDTO;
	}

	public void setUsuarioDTO(UsuarioDTO usuarioDTO) {
		this.usuarioDTO = usuarioDTO;
	}
	
	
	
	

}
