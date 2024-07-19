package br.com.dio.desafio.dominio;

import java.util.ArrayList;
import java.util.List;

public class Dev {
    private String nome;
    private List<Curso> cursosInscritos = new ArrayList<>();
    private List<Mentoria> mentoriasInscritas = new ArrayList<>();

    // Construtor
    public Dev(String nome) {
        this.nome = nome;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Curso> getCursosInscritos() {
        return cursosInscritos;
    }

    public void setCursosInscritos(List<Curso> cursosInscritos) {
        this.cursosInscritos = cursosInscritos;
    }

    public List<Mentoria> getMentoriasInscritas() {
        return mentoriasInscritas;
    }

    public void setMentoriasInscritas(List<Mentoria> mentoriasInscritas) {
        this.mentoriasInscritas = mentoriasInscritas;
    }

    // Métodos para inscrever em cursos e mentorias
    public void inscreverCurso(Curso curso) {
        this.cursosInscritos.add(curso);
    }

    public void inscreverMentoria(Mentoria mentoria) {
        this.mentoriasInscritas.add(mentoria);
    }
}
