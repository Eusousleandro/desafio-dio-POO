package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamps {

    private String nome;
    private String descricao;
    private LocalDate dataInicail = LocalDate.now();
    private LocalDate dataFinal = dataInicail.plusDays(45);
    private Set<Dev> devs = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicail() {
        return dataInicail;
    }

    public LocalDate setDataInicail(LocalDate dataInicail) {
        this.dataInicail = dataInicail;
        return dataInicail;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public LocalDate setDataFinal(LocalDate dataFinal) {
        this.dataFinal = dataFinal;
        return dataFinal;
    }

    public Set<Dev> getDevs() {
        return devs;
    }

    public void setDevs(Set<Dev> devs) {
        this.devs = devs;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamps bootcamps = (Bootcamps) o;
        return Objects.equals(nome, bootcamps.nome) && Objects.equals(descricao, bootcamps.descricao) && Objects.equals(dataInicail, bootcamps.dataInicail) && Objects.equals(dataFinal, bootcamps.dataFinal) && Objects.equals(devs, bootcamps.devs) && Objects.equals(conteudos, bootcamps.conteudos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, dataInicail, dataFinal, devs, conteudos);
    }
}
