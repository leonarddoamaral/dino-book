package com.example.demo.controler;


import com.example.demo.anquilossaurideo.Anquilossaurideo;
import com.example.demo.ceratopsideo.Ceratopsideo;
import com.example.demo.dinossaur.Dinossaur;
import com.example.demo.dinossaur.DinossaurRepository;
import com.example.demo.sauropode.Sauropode;
import com.example.demo.teropode.Teropode;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.TabExpander;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/dino")
public class DinossaurControler {
    @Autowired
    private DinossaurRepository repository;
    @PostMapping
    public void cadastrar(@RequestBody @Valid DadosCadastroDino dados) {
        Dinossaur dino;
        Teropode ter;
        Sauropode sau;
        if ("sauropode".equalsIgnoreCase(dados.tipo())){
            dino = new Sauropode(dados);
        }
         else if("teropode".equalsIgnoreCase(dados.tipo())){
            dino = new Teropode(dados);
        } else if ("ceratopsideo".equalsIgnoreCase(dados.tipo())) {
             dino = new Ceratopsideo(dados);

        } else if ("anquilossaurideo".equalsIgnoreCase(dados.tipo())) {
            dino = new Anquilossaurideo(dados);
        } else {
            throw new RuntimeException("Tipo de dinossauro desconhecido: " + dados.tipo());
        }

        repository.save(dino);
    }
    @GetMapping
    public List<DadosListagemDino>listar(){
        return repository.findAll().stream().map(DadosListagemDino::new).toList();
    }
    @GetMapping("/{id}")
    @Transactional
    public List<DadosListagemDino>ListaUnica(@PathVariable Long id){
        return repository.findAllById(Collections.singleton(id)).stream().map(DadosListagemDino::new).toList();
    }
}
