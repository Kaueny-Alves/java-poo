import br.com.dio.desafio.dominio.Banco;
import br.com.dio.desafio.dominio.Cliente;
import br.com.dio.desafio.dominio.Conta;
import br.com.dio.desafio.dominio.ContaCorrente;
import br.com.dio.desafio.dominio.ContaPoupanca;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Cliente kaueny = new Cliente();
        kaueny.setNome("kaueny");
        Cliente rafael = new Cliente();
        rafael.setNome("rafael");

        Conta corrente = new ContaCorrente(kaueny);
        Conta poupanca = new ContaPoupanca(rafael);

        corrente.depositar(100);
        poupanca.transferir(100, poupanca);

        corrente.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}
