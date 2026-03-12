package com.example.demo.sauropode;

import com.example.demo.controler.DadosCadastroDino;
import com.example.demo.dinossaur.Dinossaur;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@DiscriminatorValue("sauropode")
public class Sauropode extends Dinossaur {
    public Sauropode(DadosCadastroDino dados) {
        super(dados);
        this.setDieta("Herbivorous");
    }

    @Override
    public Double QtdAlimentoDiaria(Double peso) {
        Double qtd = (0.05*peso)+1000;
        return qtd;
    }
}
