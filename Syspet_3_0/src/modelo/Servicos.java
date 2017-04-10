/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Bebe Iucas
 */
public class Servicos {
    private double preço;
    private String disponibilidade;
    private double desconto;
    private Animais indicacao = new Animais();

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }

    public String getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(String disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public Animais getIndicacao() {
        return indicacao;
    }

    public void setIndicacao(Animais indicacao) {
        this.indicacao = indicacao;
    }
}
