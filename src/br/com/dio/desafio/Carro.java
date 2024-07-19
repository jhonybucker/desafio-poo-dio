package br.com.dio.desafio;

public class Carro {
    private String modelo;
    private String marca;
    private int ano;
    private boolean temDefeito;

    public Carro(String modelo, String marca, int ano) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.temDefeito = false;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean isTemDefeito() {
        return temDefeito;
    }

    public void setTemDefeito(boolean temDefeito) {
        this.temDefeito = temDefeito;
    }

    public void diagnosticar() {
        if (temDefeito) {
            System.out.println("O carro " + modelo + " está com defeito.");
        } else {
            System.out.println("O carro " + modelo + " está em perfeito estado.");
        }
    }
}
