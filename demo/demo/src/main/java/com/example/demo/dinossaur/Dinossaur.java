package com.example.demo.dinossaur;

import com.example.demo.controler.DadosCadastroDino;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "dinossaur")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo", discriminatorType = DiscriminatorType.STRING)
public abstract class Dinossaur {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private Double peso;

    @Enumerated(EnumType.STRING)
    private Periodos periodo;

    @Enumerated(EnumType.STRING)
    private Dieta dieta;

    @Column(name = "tipo", insertable = false, updatable = false)
    private String tipo;


    public Dinossaur(DadosCadastroDino dados){
        this.nome =dados.nome();
        this.peso = dados.peso();
        this.periodo = dados.periodo();
        this.tipo = dados.tipo();

    }

    public Double QtdAlimentoDiaria(Double peso){
        return 0.0;
    }
}


