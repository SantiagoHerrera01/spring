package com.comfama.gestionpedidos.service;

import com.comfama.gestionpedidos.domain.UsuarioDTO;
import com.comfama.gestionpedidos.mapper.UsuarioMapper;
import com.comfama.gestionpedidos.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UsuarioServiceImpl implements UsuarioService {
    private final UsuarioRepository usuarioRepository;
    private final UsuarioMapper usuarioMapper;

    @Override
    public List<UsuarioDTO> obtenerTodosLosUsuarios() {
        var usuarioList= usuarioRepository.findAll();
        return usuarioList.stream().map(usuarioMapper::toUsuarioDto).toList();
    }

    @Override
    public String insertarUsuario(UsuarioDTO dto) {
        var insertar = usuarioMapper.toUsuario(dto);
        insertar = usuarioRepository.save(insertar);
        return "Se inserto correctamente";
    }

    @Override
    public UsuarioDTO obtenerById(Long idUsuario) {
        var obtener = usuarioRepository.findById(idUsuario);
        return obtener.map(usuarioMapper::toUsuarioDto).orElse(null);
    }

    @Override
    public String actualizar(UsuarioDTO dto) {
        var actualizar = usuarioMapper.toUsuario(dto);
        actualizar = usuarioRepository.save(actualizar);
        return "El usuario se actualizo correctamente";
    }

    @Override
    public String eliminarUsuarioById(Long idUsuario) {
        var usuario = usuarioRepository.findById(idUsuario);
        if (usuario.isPresent()) {
            usuarioRepository.delete(usuario.get());
            return "El dato se ha eliminado con éxito";
        }
        return "El usuario no se encontró en el repositorio";
    }

}


