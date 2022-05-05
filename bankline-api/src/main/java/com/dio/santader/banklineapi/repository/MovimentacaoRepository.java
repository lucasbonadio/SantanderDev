package com.dio.santader.banklineapi.repository;

import com.dio.santader.banklineapi.model.Movimentacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovimentacaoRepository extends JpaRepository<Movimentacao, Integer> {
}
