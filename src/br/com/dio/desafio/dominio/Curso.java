package br.com.dio.desafio.dominio;

public class Curso {
    private String titulo;
    private String descricao;
    private int cargaHoraria;

    public Curso() {

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

    public void setDescricao(String Descricao) {
        this.descricao = descricao;
    }

    public int getCargaHoraria(int i) {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
}
