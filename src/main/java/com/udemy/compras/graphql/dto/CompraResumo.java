package com.udemy.compras.graphql.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CompraResumo {
    private Long idCompra;
    private String nomeCliente;
    private String descricaoProduto;
    private int quantidadeComprada;
}
