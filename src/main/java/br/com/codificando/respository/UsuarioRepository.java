package br.com.codificando.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.codificando.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{


}
