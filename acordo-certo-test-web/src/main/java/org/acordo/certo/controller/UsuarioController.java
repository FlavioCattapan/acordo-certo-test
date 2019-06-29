package org.acordo.certo.controller;

import org.acordo.certo.entities.Setor;
import org.acordo.certo.entities.Usuario;
import org.acordo.certo.service.UsuarioService;
import org.acordo.certo.vo.UsuarioVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/api")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;


	@GetMapping
	public String getTest() {

		return "hello";
	}
	
	@PostMapping
	public void salvaUsuario(@RequestBody  UsuarioVO usuarioVO) {
		
		Usuario usuario = new Usuario();
		usuario.setId(usuarioVO.getId());
		usuario.setNome(usuarioVO.getNome());
		Setor setor = new Setor();
		setor.setId(usuarioVO.getSetor());
		usuario.setSetor(setor);
		usuario.setValeRefeicao(usuarioVO.getValeRefeicao());
		
		usuarioService.salvaUsuario(usuario);
		
	}

}
