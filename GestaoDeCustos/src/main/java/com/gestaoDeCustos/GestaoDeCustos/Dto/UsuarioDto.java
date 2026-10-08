package com.gestaoDeCustos.GestaoDeCustos.Dto;


import jakarta.validation.constraints.NotBlank;
import lombok.*;
import org.springframework.validation.annotation.Validated;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Validated
public class UsuarioDto {
    @NotBlank
    private String nome;
    @NotBlank
    private String email;

}
