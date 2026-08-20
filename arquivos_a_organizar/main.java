package WILLIAN;

public class main {


    public static void main(String[] args) {

        // Instanciando o termômetro
        Termometro termometro = new Termometro();

        // Temperatura inicial
        System.out.println("Temperatura inicial: "
                + termometro.getTemperatura() + "°C");

        // Valor válido
        System.out.println("\nTentando definir temperatura para 25°C...");
        termometro.setTemperatura(25.0);

        System.out.println("Temperatura atual: "
                + termometro.getTemperatura() + "°C");

        // Valor inválido
        System.out.println("\nTentando definir temperatura para 60°C...");
        termometro.setTemperatura(60.0);

        System.out.println("Temperatura atual: "
                + termometro.getTemperatura() + "°C");
    }
}
}
