package com.gestaoDeCustos.GestaoDeCustos.database.repository;

import com.gestaoDeCustos.GestaoDeCustos.database.model.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IUsuarioRepository extends JpaRepository<UsuarioEntity, Long> {

    Optional<UsuarioEntity> findByEmail(String email);

}
