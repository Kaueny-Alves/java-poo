package br.com.dio.desafio.dominio;

public abstract class Conta implements IConta {

  private static final int AGENCIA_PADRAO = 1;
  private static int SEQUENCIAL = 1;

  protected int agencia;
  protected int numero;
  protected double saldo;
  protected Cliente cliente;

  public Conta(Cliente cliente) {
    this.agencia = Conta.AGENCIA_PADRAO;
    this.numero = SEQUENCIAL++;
    this.cliente = cliente;
  }


  @Override
  public void sacar(double valor) {
    if (saldo <= 0 || saldo < valor) {
      System.out.println("Você não tem saldo suficiente para sacar!");
    } else {
      saldo -= valor;
      System.out.println("Saque realizado com sucesso!");
    }
  }
  @Override
  public void depositar(double valor) {

    saldo += valor;
    System.out.println("Depósito realizada com sucesso!");
  }

  @Override
  public void transferir(double valor, Conta contaDestino) {
    if (saldo <= 0 || saldo < valor) {
      System.out.println("Você não tem saldo suficiente para transferir!");
    } else {
      this.sacar(valor);
      contaDestino.depositar(valor);
      System.out.println("Transferencia realizada com sucesso!");
    }
  }
  protected void imprimirInfosComuns() {
    System.out.println(String.format("*Cliente: %s", this.cliente.getNome()));
    System.out.println(String.format("*Agencia: %d", this.agencia));
    System.out.println(String.format("*Numero: %d", this.numero));
    System.out.println(String.format("*Saldo: %.2f", this.saldo));
  }

  public int getAgencia() {
    return agencia;
  }

  public int getNumero() {
    return numero;
  }

  public double getSaldo() {
    return saldo;
  }

}
