package com.gestaoDeCustos.GestaoDeCustos.controller;

import com.gestaoDeCustos.GestaoDeCustos.Dto.UsuarioDto;
import com.gestaoDeCustos.GestaoDeCustos.database.model.UsuarioEntity;
import com.gestaoDeCustos.GestaoDeCustos.services.UsuarioService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
@RequiredArgsConstructor
@Validated
public class UsuarioController {

    private final UsuarioService usuarioService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<UsuarioEntity> findAll(){
        return usuarioService.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void criarUsuario(@Valid @RequestBody UsuarioDto usuarioDto){
       usuarioService.CriarUsuario(usuarioDto);
    }
}
