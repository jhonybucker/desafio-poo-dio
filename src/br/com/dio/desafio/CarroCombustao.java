package br.com.dio.desafio;

public class CarroCombustao extends Carro {
    private int capacidadeTanque;

    public CarroCombustao(String modelo, String marca, int ano, int capacidadeTanque) {
        super(modelo, marca, ano);
        this.capacidadeTanque = capacidadeTanque;
    }

    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    @Override
    public void diagnosticar() {
        super.diagnosticar();
        System.out.println("Capacidade do tanque: " + capacidadeTanque + " litros.");
    }
}
