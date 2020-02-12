package com.company;

public class ContaCorrente extends Conta{
    protected double saldo;
    protected double chequeespecial;

    public void depositardinheiro (double valor) {
        if (valor > 0) {
            System.out.println("Depositado na conta corrente: " + valor);
            this.saldo += valor;
        } else {
            System.out.println("Valor invalido!");
        }
    }
    public void depositarcheque (Cheque cheque) {
        if (cheque.getValor() > 0){
            this.saldo += cheque.getValor();
            System.out.println("Deposito de cheque realizado! ");
        }
    }

    public void sacardinheiro (double valor) {
        if (valor > 0 && valor <= saldo) {
            System.out.println("Você sacou seu dinheiro: " + valor);
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente!");
        }

    }

    // GETS E SETTERS


    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getChequeespecial() {
        return chequeespecial;
    }

    public void setChequeespecial(double chequeespecial) {
        this.chequeespecial = chequeespecial;
    }

}
