package com.comfama.gestionpedidos.mapper;

import com.comfama.gestionpedidos.domain.UsuarioDTO;
import com.comfama.gestionpedidos.model.Usuario;
import org.springframework.stereotype.Component;

@Component
public class UsuarioMapper {
    public Usuario toUsuario(UsuarioDTO dto){
        return Usuario.builder().idUsuario(dto.getIdUsuario()).nombreUsuario(dto.getNombreUsuario())
                .nombreArea(dto.getNombreArea()).correoUsuario(dto.getCorreoUsuario()).nit(dto.getNit()).build();
    }

    public UsuarioDTO toUsuarioDto (Usuario entity){
        return UsuarioDTO.builder().idUsuario(entity.getIdUsuario()).nombreUsuario(entity.getNombreUsuario())
                .nombreArea(entity.getNombreArea()).correoUsuario(entity.getCorreoUsuario())
                .nit(entity.getNit()).build();
    }
}
