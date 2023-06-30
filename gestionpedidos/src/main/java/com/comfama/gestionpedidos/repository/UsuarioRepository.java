package com.comfama.gestionpedidos.repository;

import com.comfama.gestionpedidos.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
