package com.gestaoDeCustos.GestaoDeCustos.controller;

import com.gestaoDeCustos.GestaoDeCustos.Dto.CategoriaDto;
import com.gestaoDeCustos.GestaoDeCustos.database.model.CategoriaEntity;
import com.gestaoDeCustos.GestaoDeCustos.services.CategoriaService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categoria")
@RequiredArgsConstructor
@Validated
public class CategoriaController {

    private final CategoriaService categoriaService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<CategoriaEntity> findAll(){
        return categoriaService.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void CriarCategoria(@Valid @RequestBody CategoriaDto categoriaDto) {
        categoriaService.criarCategoria(categoriaDto);
    }
}
