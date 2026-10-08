package com.gestaoDeCustos.GestaoDeCustos.services;

import com.gestaoDeCustos.GestaoDeCustos.Dto.GastosDto;
import com.gestaoDeCustos.GestaoDeCustos.database.model.CategoriaEntity;
import com.gestaoDeCustos.GestaoDeCustos.database.model.GastosEntity;
import com.gestaoDeCustos.GestaoDeCustos.database.model.UsuarioEntity;
import com.gestaoDeCustos.GestaoDeCustos.database.repository.ICategoriaRepository;
import com.gestaoDeCustos.GestaoDeCustos.database.repository.IGastosRepository;
import com.gestaoDeCustos.GestaoDeCustos.database.repository.IUsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GastosService {

    private final IGastosRepository gastosRepository;
    private final IUsuarioRepository usuarioRepository;
    private final ICategoriaRepository categoriaRepository;

    public List<GastosEntity> findAll(){
        return gastosRepository.findAll();
    }

    public void CriarGasto (GastosDto gastosDto) {
        UsuarioEntity usuario = usuarioRepository.findById(gastosDto.getUsuarioId())
                .orElseThrow(() -> new RuntimeException("Usuário não Cadastrado"));

        CategoriaEntity categoria = categoriaRepository.findById(gastosDto.getCategoriaId())
                .orElseThrow(() -> new RuntimeException("Cadegoria não existe"));

        GastosEntity gastos = GastosEntity.builder()
                .descricao(gastosDto.getDescricao())
                .tipo(gastosDto.getTipo())
                .valor(gastosDto.getValor())
                .data(gastosDto.getData())
                .usuario(usuario)
                .categoria(categoria)
                .build();

        gastosRepository.save(gastos);
    }
}
