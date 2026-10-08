package com.gestaoDeCustos.GestaoDeCustos.services;

import com.gestaoDeCustos.GestaoDeCustos.Dto.UsuarioDto;
import com.gestaoDeCustos.GestaoDeCustos.database.model.UsuarioEntity;
import com.gestaoDeCustos.GestaoDeCustos.database.repository.IUsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final IUsuarioRepository usuarioRepository;

    public List<UsuarioEntity> findAll() {
        return usuarioRepository.findAll();

    }

    public void CriarUsuario (UsuarioDto usuarioDto) {
       UsuarioEntity emailExistente = usuarioRepository.findByEmail(usuarioDto.getEmail())
                .orElse(null);

       if ( emailExistente != null) {
           throw new RuntimeException("Email ja cadastrado");
       }

        UsuarioEntity usuario = UsuarioEntity.builder()
                .nome(usuarioDto.getNome())
                .email(usuarioDto.getEmail())
                .build();

        usuarioRepository.save(usuario);
    }

}
