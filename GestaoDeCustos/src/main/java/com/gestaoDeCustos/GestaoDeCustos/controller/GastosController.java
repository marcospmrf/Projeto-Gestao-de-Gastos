package com.gestaoDeCustos.GestaoDeCustos.controller;

import com.gestaoDeCustos.GestaoDeCustos.Dto.GastosDto;
import com.gestaoDeCustos.GestaoDeCustos.database.model.GastosEntity;
import com.gestaoDeCustos.GestaoDeCustos.services.GastosService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/gastos")
@RequiredArgsConstructor
@Validated
public class GastosController {

    private final GastosService gastosService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<GastosEntity> findAll() {
        return gastosService.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void criarGasto(@Valid @RequestBody GastosDto gastosDto){
        gastosService.CriarGasto(gastosDto);
    }


}
