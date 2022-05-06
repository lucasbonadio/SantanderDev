package com.dio.santader.banklineapi.controller;

import com.dio.santader.banklineapi.dto.NovoCorrentista;
import com.dio.santader.banklineapi.model.Correntista;
import com.dio.santader.banklineapi.repository.CorrentistaRepository;
import com.dio.santader.banklineapi.service.CorrentistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/correntistas")
public class CorrentistaController {
    @Autowired
    private CorrentistaRepository repository;

    @Autowired
    private CorrentistaService service;

    @GetMapping
    public List<Correntista> findAll(){
        return repository.findAll();
    }

    @PostMapping
    public void save (@RequestBody NovoCorrentista correntista){
        service.save(correntista);
    }
}
