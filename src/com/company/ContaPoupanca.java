package com.company;

public class ContaPoupanca extends Conta{
    protected double saldo;
    protected double taxajuros;
    protected double saldojuros;

    public void depositar(double valor) {
        if (valor > 0 ){
            System.out.println("Depositado na conta poupança: " + valor);
            this.saldo += valor;
            var flag = valor * 0.07;
            this.saldojuros += valor;
        }else {
            System.out.println("Não foi possivel realizar seu deposito :(");
        }
    }

    public void sacar (double valor) {
        if (valor > 0 && valor <= saldo) {
            System.out.println("Você sacou seu dinheiro: " + valor);
            this.saldo -= valor;
        }
    }

    // GETS E SETTERS

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getTaxajuros() {
        return taxajuros;
    }

    public void setTaxajuros(double taxajuros) {
        this.taxajuros = taxajuros;
    }


    public void depositar() {
    }
}

