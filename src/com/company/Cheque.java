package com.company;

public class Cheque {

    private double valor;
    private String emissor;
    private String dataDePagamento;

    public Cheque(){
    }

    public Cheque(double valor){
        this.valor = valor;
    }

    public Cheque(double valor, String emissor, String dataDePagamento) {
        this.valor = valor;
        this.emissor = emissor;
        this.dataDePagamento = dataDePagamento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getEmissor() {
        return emissor;
    }

    public void setEmissor(String emissor) {
        this.emissor = emissor;
    }

    public String getDataDePagamento() {
        return dataDePagamento;
    }

    public void setDataDePagamento(String dataDePagamento) {
        this.dataDePagamento = dataDePagamento;
    }
}
