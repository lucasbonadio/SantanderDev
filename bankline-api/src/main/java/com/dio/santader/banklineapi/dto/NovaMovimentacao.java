package com.dio.santader.banklineapi.dto;

import com.dio.santader.banklineapi.model.Movimentacao;
import com.dio.santader.banklineapi.model.MovimentacaoTipo;

public class NovaMovimentacao {
    private String descricao;
    private double valor;
    private MovimentacaoTipo tipo;
    private Integer idConta;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public MovimentacaoTipo getTipo() {
        return tipo;
    }

    public void setTipo(MovimentacaoTipo tipo) {
        this.tipo = tipo;
    }

    public Integer getIdConta() {
        return idConta;
    }

    public void setIdConta(Integer idConta) {
        this.idConta = idConta;
    }
}
