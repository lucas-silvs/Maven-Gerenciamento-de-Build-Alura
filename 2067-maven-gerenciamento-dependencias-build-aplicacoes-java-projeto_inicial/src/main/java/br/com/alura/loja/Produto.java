package br.com.alura.loja;

import java.math.BigDecimal;

public class Produto {

    private String nomeProd;
    private BigDecimal valorProd;

    public Produto(String nomeProd, BigDecimal valorProd) {
        this.nomeProd = nomeProd;
        this.valorProd = valorProd;
    }

    public String getNomeProd() {
        return nomeProd;
    }



    public BigDecimal getValorProd() {
        return valorProd;
    }


}
