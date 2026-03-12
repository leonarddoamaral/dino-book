package com.example.demo.controler;

import com.example.demo.dinossaur.Periodos;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroDino(
        @NotBlank
        String nome,
        @NotNull
        Double peso,
        @NotNull
        Periodos periodo,
        @NotBlank
        String tipo
) {

}
