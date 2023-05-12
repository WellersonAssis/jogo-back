package com.example.jogo.resource;


import com.example.jogo.controller.JogoController;
import com.example.jogo.dominio.Jogo;
import com.example.jogo.repository.JogoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api/jogo")
public class JogoResource {

    @Autowired
    private JogoRepository jogoRepository;

    @GetMapping(value = "/list" )
    public List<Jogo> list() {
        return jogoRepository.findAll();
    }

    @PostMapping("/create")
    public ResponseEntity<Jogo> create(@RequestBody Jogo jogo) {
        JogoController jogoController = new JogoController();
        if (jogoController.isJogoValido(jogo)) {
            return new ResponseEntity("Dados do jogo inválido", HttpStatus.INTERNAL_SERVER_ERROR);
        }

        jogo.setDataHoraCadastro(new Date());
        jogo = jogoRepository.save(jogo);
        return new ResponseEntity(jogo, HttpStatus.OK);

    }

    @GetMapping("getById/{id}")
    public Optional<Jogo> getById(@PathVariable(value = "id") int id) {
        return jogoRepository.findById(id);
    }

    @PutMapping("/edit")
    public ResponseEntity<Jogo> editar(@RequestBody Jogo jogo) {
        JogoController jogoController = new JogoController();
        if (jogoController.isJogoValido(jogo)) {
            return new ResponseEntity("Nome do jogo é invalido", HttpStatus.INTERNAL_SERVER_ERROR);
        }

        jogo = jogoRepository.save(jogo);
        return new ResponseEntity(jogo, HttpStatus.OK);
    }

    @GetMapping("/total")
    public long getTotal() {
        return jogoRepository.count();
    }

    @DeleteMapping("/remove/{id}")
    public Jogo remove(@PathVariable(value = "id") int id) {
        Optional<Jogo> optionalJogo = jogoRepository.findById(id);
        jogoRepository.delete(optionalJogo.get());
        return optionalJogo.get();
    }

}
