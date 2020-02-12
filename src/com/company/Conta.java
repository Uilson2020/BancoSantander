package com.company;

public class Conta {
    protected double numconta;
    protected Cliente cliente;
    protected double saldo;

    public double getNumconta() {
        return numconta;
    }

    public void setNumconta(double numconta) {
        this.numconta = numconta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
