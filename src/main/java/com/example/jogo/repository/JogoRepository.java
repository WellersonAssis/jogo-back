package com.example.jogo.repository;

import com.example.jogo.dominio.Jogo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JogoRepository extends JpaRepository<Jogo, Integer> {

    boolean existsByNome(String nome);
    boolean existsByNomeAndIdNot(String nome, long id);

    boolean editByNome(String nome);

}


