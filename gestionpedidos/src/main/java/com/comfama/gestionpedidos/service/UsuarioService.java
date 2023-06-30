package com.comfama.gestionpedidos.service;

import com.comfama.gestionpedidos.domain.UsuarioDTO;

import java.util.List;

public interface UsuarioService {

    List<UsuarioDTO> obtenerTodosLosUsuarios();

    String insertarUsuario (UsuarioDTO dto);

    UsuarioDTO obtenerById (Long idUsuario);

    String actualizar (UsuarioDTO dto);

    String eliminarUsuarioById (Long idUsuario);
}
