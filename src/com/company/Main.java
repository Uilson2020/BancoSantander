package com.company;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("============================================================================");
        System.out.println("\t\t========Seja bem vindo ao Santander==========\n");

        Cliente c = new Cliente();
        ContaPoupanca cp = new ContaPoupanca();
        ContaCorrente cc = new ContaCorrente();
        Cheque ch = new Cheque(200);

        cp.depositar(120);
        cp.sacar(100);
        cc.depositardinheiro(500);
        cc.sacardinheiro(600);
        cc.depositarcheque(ch);

    }

}