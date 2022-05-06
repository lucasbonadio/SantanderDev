package com.dio.santader.banklineapi.controller;

import com.dio.santader.banklineapi.dto.NovaMovimentacao;
import com.dio.santader.banklineapi.model.Movimentacao;
import com.dio.santader.banklineapi.repository.MovimentacaoRepository;
import com.dio.santader.banklineapi.service.MovimentacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movimentacoes")
public class MovimentacaoController {
    @Autowired
    private MovimentacaoRepository repository;

    @Autowired
    private MovimentacaoService service;

    @GetMapping
    public List<Movimentacao> findAll() {
        return repository.findAll();
    }

    @PostMapping
    public void save(@RequestBody NovaMovimentacao movimentacao) {
        service.save(movimentacao);
    }
}

