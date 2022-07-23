package br.com.dio.desafio.dominio.banco;

import br.com.dio.desafio.dominio.banco.Cliente;
import br.com.dio.desafio.dominio.banco.Conta;

public class ContaCorrente extends Conta {


  public ContaCorrente(Cliente cliente) {
    super(cliente);
  }

  @Override
  public void imprimirExtrato() {
    System.out.println("--- Extrato Conta Corrente ---");
    super.imprimirInfosComuns();
  }


}
