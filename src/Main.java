import br.com.dio.desafio.dominio.banco.Cliente;
import br.com.dio.desafio.dominio.banco.Conta;
import br.com.dio.desafio.dominio.banco.ContaCorrente;
import br.com.dio.desafio.dominio.banco.ContaPoupanca;
import br.com.dio.desafio.dominio.bootcamp.Bootcamp;
import br.com.dio.desafio.dominio.bootcamp.Curso;
import br.com.dio.desafio.dominio.bootcamp.Dev;
import br.com.dio.desafio.dominio.bootcamp.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
// Dados do banco
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

//  Dados do Bootcamp
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());

        System.out.println("-------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());


    }

}
