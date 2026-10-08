package com.gestaoDeCustos.GestaoDeCustos.database.repository;

import com.gestaoDeCustos.GestaoDeCustos.database.model.GastosEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IGastosRepository extends JpaRepository<GastosEntity, Long> {
}
