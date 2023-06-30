package com.comfama.gestionpedidos.rest;

import com.comfama.gestionpedidos.domain.UsuarioDTO;
import com.comfama.gestionpedidos.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/api/v1.0")
@RestController
@RequiredArgsConstructor
public class UsuarioRest {

    private final UsuarioService usuarioService;

    @GetMapping("/selectAll")
    public List<UsuarioDTO> selectAll(){return usuarioService.obtenerTodosLosUsuarios();}

    @PostMapping("/insert")

    public String insert (@RequestBody UsuarioDTO usuario ) { return usuarioService.insertarUsuario(usuario);}

    @GetMapping("/obtenerUsuarioById/{idUsuario}")
    public UsuarioDTO obtenerUsuarioById(@PathVariable ("idUsuario") Long idUsuario ) { return usuarioService.obtenerById(idUsuario);}

    @PutMapping("/update")
    public String update (@RequestBody UsuarioDTO usuario){ return usuarioService.actualizar(usuario);}

    @DeleteMapping("/eliminarUsuarioById/{idUsuario}")
    public String eliminarUsuarioById(@PathVariable("idUsuario")Long idUsuario){return usuarioService.eliminarUsuarioById(idUsuario);}


}
