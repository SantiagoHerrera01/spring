package com.comfama.gestionpedidos.domain;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class UsuarioDTO {
private Long idUsuario;
private String nombreUsuario;
private String nombreArea;
private  String correoUsuario;
private Long nit;
}
