package com.example.demo.ceratopsideo;

import com.example.demo.controler.DadosCadastroDino;
import com.example.demo.dinossaur.Dieta;
import com.example.demo.dinossaur.Dinossaur;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@DiscriminatorValue("ceratopsideo")
public class Ceratopsideo extends Dinossaur {
    public Ceratopsideo(DadosCadastroDino dados ){
        super(dados);
        this.setDieta(Dieta.Herbivorous);
    }
    @Override public Double QtdAlimentoDiaria(Double peso){
        return peso*0.06;
    }
    @Override public Integer QtdChifres(Integer chifres, String nome){
        return chifres;
    }
}
