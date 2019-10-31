package com.devBootCamp.exercicio5;

public class Main {

    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        cc.setTaxaOperacao(0.2D);

        System.out.println("Deposita na Conta Corrente");
        cc.depositar(100D);
        System.out.println(cc.getSaldo());
        System.out.println();

        System.out.println("Saca da Conta Corrente");
        cc.sacar(50D);
        System.out.println(cc.getSaldo());
        System.out.println();

        System.out.println("Saca além do saldo");
        cc.sacar(100D);
        System.out.println(cc.getSaldo());

        System.out.println("***********************************");

        ContaPoupanca cp = new ContaPoupanca(500D);

        System.out.println("Deposita na Conta Poupança");
        cp.depositar(100D);
        System.out.println("Saldo da Conta Poupança: " + cp.getSaldo());
        System.out.println();

        System.out.println("Saca da Conta Poupança");
        cp.sacar(90D);
        System.out.println("Saldo da Conta Poupança: " + cp.getSaldo());
        System.out.println();

        System.out.println("Saca da Conta Poupança além do saldo");
        cp.sacar(90D);
        System.out.println("Saldo da Conta Poupança: " + cp.getSaldo());
        System.out.println();

        System.out.println("Saca da Conta Poupança além do saldo e do limite");
        cp.sacar(500D);
        System.out.println("Saldo da Conta Poupança: " + cp.getSaldo());
        System.out.println();
    }
}
