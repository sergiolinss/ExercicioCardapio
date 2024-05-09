package org.example;

public class CompraDoLanche {
    private Lanches lanche;
    private int quantidadeDeLanches;

    public CompraDoLanche(Lanches lanche, int quantidadeDeLanches){
        this.lanche = lanche;
        this.quantidadeDeLanches = quantidadeDeLanches;
    }
    public double calcularTotal(){
        return lanche.getValorLanche()*quantidadeDeLanches;
    }
}
