package com.example.demo.anquilossaurideo;

import com.example.demo.controler.DadosCadastroDino;
import com.example.demo.dinossaur.Dieta;
import com.example.demo.dinossaur.Dinossaur;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter
@DiscriminatorValue("anquilossaurideo")
public class Anquilossaurideo extends Dinossaur {
    public Anquilossaurideo(DadosCadastroDino dados){
        super(dados);
        this.setDieta(Dieta.Herbivorous);
    }
    @Override public Double QtdAlimentoDiaria(Double peso){
        return peso*0.04;
    }

}
