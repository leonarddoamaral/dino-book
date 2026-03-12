package com.example.demo.teropode;

import com.example.demo.controler.DadosCadastroDino;
import com.example.demo.dinossaur.Dinossaur;
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
@DiscriminatorValue("teropode")
public class Teropode extends Dinossaur {
    public Teropode(DadosCadastroDino dados) {
        super(dados);
        this.setDieta("Carnivorous");
    }

    @Override
    public Double QtdAlimentoDiaria(Double peso) {
        Double qtd = (0.15*peso);
        return qtd;
    }
}
