package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria {
    private String titulo;
    private String descricao;
    private LocalDate data;

    public Mentoria() {

    }

    public String getTitulo(String java) {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao(String orientaçãoAObjetosComJava) {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getData(int i) {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
}
