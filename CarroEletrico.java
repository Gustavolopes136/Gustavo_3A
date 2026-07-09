public class CarroEletrico {
    public class CarroEletrico {

    // Atributos privados
    private String modelo;
    private int velocidadeAtual;
    private int cargaBateria;

    // Construtor
    public CarroEletrico(String modelo) {
        this.modelo = modelo;
        this.velocidadeAtual = 0;
        this.cargaBateria = 100;
    }

    // Getter e Setter do modelo
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // Apenas getters para velocidade e bateria
    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public int getCargaBateria() {
        return cargaBateria;
    }

    // Método acelerar
    public void acelerar() {

        if (cargaBateria == 0) {
            System.out.println("Erro: bateria descarregada!");
            return;
        }

        if (velocidadeAtual >= 120) {
            System.out.println("Erro: velocidade máxima atingida.");
            return;
        }

        velocidadeAtual += 20;
        cargaBateria -= 5;

        if (velocidadeAtual > 120) {
            velocidadeAtual = 120;
        }

        if (cargaBateria < 0) {
            cargaBateria = 0;
        }

        System.out.println("Acelerando...");
        System.out.println("Velocidade: " + velocidadeAtual + " km/h");
        System.out.println("Bateria: " + cargaBateria + "%");
    }

    // Método frear
    public void frear() {

        velocidadeAtual -= 20;

        if (velocidadeAtual < 0) {
            velocidadeAtual = 0;
        }

        System.out.println("Freando...");
        System.out.println("Velocidade: " + velocidadeAtual + " km/h");
    }

    // Método carregar bateria
    public void carregarBateria() {

        if (velocidadeAtual != 0) {
            System.out.println("Erro: o carro precisa estar parado para carregar.");
            return;
        }

        cargaBateria = 100;
        System.out.println("Bateria carregada para 100%.");
    }
}
}
