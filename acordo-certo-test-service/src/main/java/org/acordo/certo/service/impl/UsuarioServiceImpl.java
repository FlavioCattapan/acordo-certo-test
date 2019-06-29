package org.acordo.certo.service.impl;

import org.acordo.certo.entities.Usuario;
import org.acordo.certo.repository.UsuarioRepository;
import org.acordo.certo.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioService {
	 
	@Autowired
	private UsuarioRepository usuarioRepository;

	public void salvaUsuario(Usuario usuario) {
		
		usuarioRepository.save(usuario);
		
	}

	

	

}
