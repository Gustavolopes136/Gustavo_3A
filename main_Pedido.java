package WILLIAN;

public class main_Pedido {

    public static void main(String[] args) {

        // Criação do pedido
        Pedido pedido = new Pedido(1001);

        // Adicionando itens ao pedido
        pedido.adicionarItem("Hambúrguer", 25.00);
        pedido.adicionarItem("Batata Frita", 12.00);
        pedido.adicionarItem("Refrigerante", 8.00);

        // Exibindo o resumo
        pedido.exibirResumo();
    }
}