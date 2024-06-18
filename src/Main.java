import br.com.dio.desafio.dominio.Bootcamps;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

import static java.time.LocalDate.now;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Orientação a objetos com Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Menntoria de Orientação a objetos com Java");
        mentoria.setData(LocalDate.now());

       // System.out.println(curso1);
       // System.out.println(mentoria);

        Bootcamps bootcamps = new Bootcamps();
        bootcamps.setNome("Bootcamps Java Developers");
        bootcamps.setDescricao("Conteudo Bootcamps Java Developers");
        bootcamps.getConteudos().add(curso1);
        bootcamps.getConteudos().add(mentoria);

        Dev devLeandro = new Dev();
        devLeandro.setNome("Leandro");
        System.out.println("Conteúdos incritos" + devLeandro.getConteudosInscritos());
        devLeandro.progredir();
        System.out.println("-");
        System.out.println("Conteúdos incritos" + devLeandro.getConteudosInscritos());
        System.out.println("Conteúdos incritos" + devLeandro.getConteudosConcluindos());

        System.out.println("-------");

        Dev devAngela = new Dev();
        devAngela.setNome("Angela");
        devAngela.inscrever(bootcamps);
        System.out.println("Conteúdos incritos" + devAngela.getConteudosInscritos());
        devAngela.progredir();
        System.out.println("-");
        System.out.println("Conteúdos incritos" + devAngela.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos" + devAngela.getConteudosConcluindos());
    }

}