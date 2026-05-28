package soma_intervalo;

public class Main {
    public static void main(String[] args) {
        System.out.println("olá mundo");
        
        Numeros numeros = new Numeros();
        int retorno = numeros.soma(10, 20);
        
        System.out.println(retorno);
    }
}
