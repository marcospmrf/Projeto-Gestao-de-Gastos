package com.gestaoDeCustos.GestaoDeCustos.Dto;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class CategoriaDto {

    @NotBlank
    private String nome;

}
