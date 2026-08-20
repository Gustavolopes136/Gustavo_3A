package WILLIAN;

public class termometro {
    


    private double temperatura;

    // Construtor padrão
    public Termometro() {
        temperatura = 20.0;
    }

    // Getter
    public double getTemperatura() {
        return temperatura;
    }

    // Setter com validação
    public void setTemperatura(double temperatura) {

        if (temperatura >= -10.0 && temperatura <= 50.0) {
            this.temperatura = temperatura;
            System.out.println("Temperatura alterada para: " + temperatura + "°C");
        } else {
            System.out.println("ERRO: O laboratório não suporta temperaturas abaixo de -10°C ou acima de 50°C.");
        }
    }
}
