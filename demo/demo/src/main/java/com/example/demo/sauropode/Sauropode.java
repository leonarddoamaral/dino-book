package com.example.demo.sauropode;


import com.example.demo.controler.DadosCadastroDino;
import com.example.demo.dinossaur.Dinossaur;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import com.example.demo.dinossaur.Dieta;
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
        this.setDieta(Dieta.Herbivorous);
    }

    @Override
    public Double QtdAlimentoDiaria(Double peso) {
        Double qtd = (0.05*peso)+1000;
        return qtd;
    }
}
