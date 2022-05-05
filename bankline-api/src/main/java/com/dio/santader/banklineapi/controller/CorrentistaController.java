package com.dio.santader.banklineapi.controller;

import com.dio.santader.banklineapi.model.Correntista;
import com.dio.santader.banklineapi.repository.CorrentistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("/correntistas")
public class CorrentistaController {
    @Autowired
    private CorrentistaRepository repository;

    @GetMapping
    public List<Correntista> findall(){
        return repository.findAll();
    }
}
