package com.example.demo.controler;

import com.example.demo.dinossaur.Dinossaur;
import com.example.demo.dinossaur.Periodos;
import com.example.demo.dinossaur.Dieta;

public record DadosListagemDino(Long id, String nome, Double peso, Dieta dieta, Periodos periodo, String tipo, Double qtdAlimentoDiaria) {
    public DadosListagemDino(Dinossaur dino){
        this(dino.getId(), dino.getNome(), dino.getPeso(),dino.getDieta(), dino.getPeriodo(), dino.getTipo(), dino.QtdAlimentoDiaria(dino.getPeso()));
    }
}
