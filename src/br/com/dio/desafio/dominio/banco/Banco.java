package br.com.dio.desafio.dominio.banco;

import br.com.dio.desafio.dominio.banco.Conta;

import java.util.List;

public class Banco {

  private String nome;
  private List<Conta> contas;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

}
