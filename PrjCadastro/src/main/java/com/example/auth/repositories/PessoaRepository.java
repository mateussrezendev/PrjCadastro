package com.example.auth.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.auth.entities.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
