package WILLIAN;


    import java.util.ArrayList;
    import java.util.List;
    
    public class Pedido {
    
        private int numeroPedido;
        private List<ItemPedido> itemPedido;
        private double valorTotalPedido;
    
        public Pedido(int numeroPedido) {
            this.numeroPedido = numeroPedido;
            this.itemPedido = new ArrayList<>();
            this.valorTotalPedido = 0.0;
        }
    
        public void adicionarItem(String nomePrato, double preco) {
    
            // O ItemPedido é criado dentro de Pedido.
            // Isso representa a composição.
            ItemPedido item = new ItemPedido(nomePrato, preco);
    
            itemPedido.add(item);
            valorTotalPedido += preco;
        }
    
        public void exibirResumo() {
    
            System.out.println("===== RESUMO DO PEDIDO =====");
            System.out.println("Número do pedido: " + numeroPedido);
            System.out.println();
    
            System.out.println("Itens do pedido:");
    
            for (ItemPedido item : itemPedido) {
                System.out.println(
                    "- " + item.getNomePrato() +
                    " - R$ " + item.getPreco()
                );
            }
    
            System.out.println();
            System.out.printf("Valor total: R$ %.2f%n", valorTotalPedido);
        }
    }


import WILLIAN.item_pedido.ItemPedido;
