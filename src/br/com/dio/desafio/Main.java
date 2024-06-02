package br.com.dio.desafio;

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new CarroEletrico("Model S", "Tesla", 2022, 600);
        Carro carro2 = new CarroCombustao("Civic", "Honda", 2020, 50);

        carro1.setTemDefeito(true);
        carro2.setTemDefeito(false);

        diagnosticarCarro(carro1);
        diagnosticarCarro(carro2);
    }

    public static void diagnosticarCarro(Carro carro) {
        carro.diagnosticar();
    }
}
