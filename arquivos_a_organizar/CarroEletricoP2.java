package WILLIAN;

public class CarroEletricoP2 {
    public class Main {

    public static void main(String[] args) {

        CarroEletrico carro = new CarroEletrico("Tesla Model 3");

        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Velocidade Inicial: " + carro.getVelocidadeAtual());
        System.out.println("Bateria Inicial: " + carro.getCargaBateria() + "%");

        System.out.println("\n=== ACELERANDO ===");

        // Acelera várias vezes
        for (int i = 0; i < 25; i++) {
            carro.acelerar();
        }

        System.out.println("\n=== TENTANDO CARREGAR EM MOVIMENTO ===");
        carro.carregarBateria();

        System.out.println("\n=== FREANDO ===");

        while (carro.getVelocidadeAtual() > 0) {
            carro.frear();
        }

        System.out.println("\n=== CARREGANDO ===");
        carro.carregarBateria();

        System.out.println("\n=== DADOS FINAIS ===");
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Velocidade: " + carro.getVelocidadeAtual());
        System.out.println("Bateria: " + carro.getCargaBateria() + "%");
    }
}
}
