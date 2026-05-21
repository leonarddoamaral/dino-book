package com.example.demo.teropode;

import com.example.demo.controler.DadosCadastroDino;
import com.example.demo.dinossaur.Dinossaur;
import com.example.demo.dinossaur.Dieta;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
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
        this.setDieta(Dieta.Carnivorous);
    }

    @Override
    public Double QtdAlimentoDiaria(Double peso) {
        Double qtd = (0.15*peso);
        return qtd;
    }
    @Override
    public Integer QtdChifres(Integer chifres, String nome){
        String dinoName = nome.toLowerCase();
        if (dinoName.equals("carnotauro") || dinoName.equals("ceratossauro")){
            return chifres;
        }
        else{
            return 0;
        }

    }
}
