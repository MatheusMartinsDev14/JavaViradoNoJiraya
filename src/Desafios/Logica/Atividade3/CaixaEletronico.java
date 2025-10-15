package Desafios.Logica.Atividade3;

import java.util.ArrayList;
import java.util.List;

public class CaixaEletronico {
    private double saldo = 1000;
    private List<String> extrato = new ArrayList<>();

    public double getSaldo() {
        return saldo;
    }

    public boolean depositar(double valor) {
        if (valor <= 0) {
            return false;
        }
        saldo += valor;
        extrato.add("Depósito: + R$" + valor + " | Saldo: R$" + saldo);
        return true;
    }

    public boolean sacar(double valor) {
        if (valor <= 0 || valor > saldo) {
            return false;
        }
        saldo -= valor;
        extrato.add("Saque: - R$" + valor + " | Saldo: R$" + saldo);
        return true;
    }

    public List<String> verExtrato() {
        return extrato;
    }
}