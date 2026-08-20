package trabalho_composicao;

public class Main {

	public static void main(String[] args) {
		System.out.println("olá mundo");
		 Pedido pedido = new Pedido(123);

	        pedido.adicionarItem("Hambúrguer", 25.00);
	        pedido.adicionarItem("Batata Frita", 12.00);
	        pedido.adicionarItem("Refrigerante", 7.00);

	        pedido.exibirResumo();
	    }
	
	}


