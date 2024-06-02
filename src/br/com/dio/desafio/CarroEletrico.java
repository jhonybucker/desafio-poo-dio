package br.com.dio.desafio;

public class CarroEletrico extends Carro {
    private int autonomiaBateria;

    public CarroEletrico(String modelo, String marca, int ano, int autonomiaBateria) {
        super(modelo, marca, ano);
        this.autonomiaBateria = autonomiaBateria;
    }

    public int getAutonomiaBateria() {
        return autonomiaBateria;
    }

    public void setAutonomiaBateria(int autonomiaBateria) {
        this.autonomiaBateria = autonomiaBateria;
    }

    @Override
    public void diagnosticar() {
        super.diagnosticar();
        System.out.println("Autonomia da bateria: " + autonomiaBateria + " km.");
    }
}
