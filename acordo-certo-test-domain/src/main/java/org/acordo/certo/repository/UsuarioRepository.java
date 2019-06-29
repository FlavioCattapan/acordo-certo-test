package org.acordo.certo.repository;

import org.acordo.certo.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository  extends JpaRepository<Usuario,Integer> {

}
