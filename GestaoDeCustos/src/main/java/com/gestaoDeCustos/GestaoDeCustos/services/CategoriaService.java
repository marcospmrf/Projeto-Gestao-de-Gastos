package com.gestaoDeCustos.GestaoDeCustos.services;

import com.gestaoDeCustos.GestaoDeCustos.Dto.CategoriaDto;
import com.gestaoDeCustos.GestaoDeCustos.database.model.CategoriaEntity;
import com.gestaoDeCustos.GestaoDeCustos.database.repository.ICategoriaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoriaService {

    private final ICategoriaRepository categoriaRepository;

    public List<CategoriaEntity> findAll() {
        return categoriaRepository.findAll();
    }

    public void criarCategoria(CategoriaDto categoriaDto) {
        CategoriaEntity categoria = CategoriaEntity.builder()
                .nome(categoriaDto.getNome())
                .build();

        categoriaRepository.save(categoria);
    }

}
