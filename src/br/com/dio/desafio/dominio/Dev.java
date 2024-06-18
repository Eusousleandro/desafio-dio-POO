package br.com.dio.desafio.dominio;

import java.util.*;

public class Dev {
    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluindos = new LinkedHashSet<>();
    private Iterable<Conteudo> conteudosConcluidos;

    public void inscrever(Bootcamps bootcamps) {
        this.conteudosInscritos.addAll(bootcamps.getConteudos());
        bootcamps.getDevs().add(this);
    }

    public  void progredir() {
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
        if (conteudo.isEmpty()) {
            this.conteudosConcluindos.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());
        } else
            System.err.println("Você não está matriculado em nenhum conteúdo!");
    }

    public double caclcularTotalXp() {
        Iterator<Conteudo> iterator = this.conteudosConcluidos.iterator();
        double soma = 0;
        while(iterator.hasNext()){
            double next = iterator.next().calcularXp();
            soma += next;
        }
        return soma;
      
       /*return this.conteudosConcluindos
               .stream()
               .mapToDouble(Conteudo::calcularXp)
               .sum();*/
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluindos() {
        return conteudosConcluindos;
    }

    public void setConteudosConcluindos(Set<Conteudo> conteudosConcluindos) {
        this.conteudosConcluindos = conteudosConcluindos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(conteudosConcluindos, dev.conteudosConcluindos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosConcluindos);
    }
}
