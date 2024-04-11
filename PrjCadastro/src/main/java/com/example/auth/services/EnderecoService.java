package com.example.auth.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.auth.entities.Endereco;
import com.example.auth.repositories.EnderecoRepository;

@Service
public class EnderecoService {
    private final EnderecoRepository enderecoRepository;

    public EnderecoService(EnderecoRepository enderecoRepository) {
        this.enderecoRepository = enderecoRepository;
    }

    public Endereco saveEndereco(Endereco endereco) {
        return enderecoRepository.save(endereco);
    }

    public Endereco getEnderecoById(Long id) {
        return enderecoRepository.findById(id).orElse(null);
    }

    public List<Endereco> getAllEnderecos() {
        return enderecoRepository.findAll();
    }

    public void deleteEndereco(Long id) {
        enderecoRepository.deleteById(id);
    }
}