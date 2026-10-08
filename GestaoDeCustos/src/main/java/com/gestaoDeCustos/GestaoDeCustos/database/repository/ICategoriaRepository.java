package com.gestaoDeCustos.GestaoDeCustos.database.repository;

import com.gestaoDeCustos.GestaoDeCustos.database.model.CategoriaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategoriaRepository extends JpaRepository<CategoriaEntity, Long> {
}
