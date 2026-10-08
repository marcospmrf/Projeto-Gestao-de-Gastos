package com.gestaoDeCustos.GestaoDeCustos.Dto;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class GastosDto {

    @NotBlank
    private String descricao;
    @NotNull
    private BigDecimal valor;
    @NotNull
    private LocalDate data;
    @NotBlank
    private String tipo;
    @NotNull
    private Long usuarioId;
    @NotNull
    private  Long categoriaId;
}
