package com.example.auth.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.auth.entities.Pessoa;
import com.example.auth.services.PessoaService;

@RestController
@RequestMapping("/pessoas")

public class PessoaController {
    private final PessoaService pessoaService;

    public PessoaController(PessoaService pessoaService) {
        this.pessoaService = pessoaService;
    }

    @PostMapping
    public Pessoa createProduct(@RequestBody Pessoa pessoa) {
        return pessoaService.savePessoa(pessoa);
    }

    @GetMapping("/{id}")
    public Pessoa getPessoa(@PathVariable Long id) {
        return pessoaService.getPessoaById(id);
    }

    @GetMapping
    public List<Pessoa> getAllPessoas() {
        return pessoaService.getAllPessoas();
    }

    @DeleteMapping("/{id}")
    public void deletePessoa(@PathVariable Long id) {
        pessoaService.deletePessoa(id);
    }
}
