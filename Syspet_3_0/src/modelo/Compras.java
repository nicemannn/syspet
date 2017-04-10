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
public class Compras {
  private String CPFCliente;
  private double descontos;
  private double total;
  private String formaDePagamento;
  private Servicos listaDeServicos = new Servicos();
  private int CodAnimal; 

    public String getCPFCliente() {
        return CPFCliente;
    }

    public void setCPFCliente(String CPFCliente) {
        this.CPFCliente = CPFCliente;
    }

    public double getDescontos() {
        return descontos;
    }

    public void setDescontos(double descontos) {
        this.descontos = descontos;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(String formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    public Servicos getListaDeServicos() {
        return listaDeServicos;
    }

    public void setListaDeServicos(Servicos listaDeServicos) {
        this.listaDeServicos = listaDeServicos;
    }

    public int getCodAnimal() {
        return CodAnimal;
    }

    public void setCodAnimal(int CodAnimal) {
        this.CodAnimal = CodAnimal;
    }
}
