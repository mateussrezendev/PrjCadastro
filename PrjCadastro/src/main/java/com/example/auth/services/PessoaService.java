package com.example.auth.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.auth.entities.Pessoa;
import com.example.auth.repositories.PessoaRepository;

@Service
public class PessoaService {
    private final PessoaRepository pessoaRepository;

    public PessoaService(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    public Pessoa savePessoa(Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }

    public Pessoa getPessoaById(Long id) {
        return pessoaRepository.findById(id).orElse(null);
    }

    public List<Pessoa> getAllPessoas() {
        return pessoaRepository.findAll();
    }

    public void deletePessoa(Long id) {
        pessoaRepository.deleteById(id);
    }
}