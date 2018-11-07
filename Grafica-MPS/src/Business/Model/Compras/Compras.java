package Business.Model.Compras;

import Business.Model.Produtos.Produto;
import java.util.ArrayList;

public class Compras {

    //Lista de produtos
    ArrayList<Produto> carrinho;

    public Compras() {
        carrinho = new ArrayList<>();
    }

    public double total() {
        return 0.0;
    }

    //Funcoes para o carrinho de compras
    
    public void addCarrinho(Produto produto){
        System.out.println("Compra adicioada");
    }
    
    public void removerCarrinho(Produto produto){
        System.err.println("Produto removido");
    }
    
    //Status do produto
    
    protected void statusAddCarrinho() {
        System.out.println("Status da compra: Adicionando ao Carrinho");
    }

    protected void statusPagamento() {
        System.out.println("Status da compra: Pagamento");
    }

    protected void statusConcluido() {
        System.out.println("Status da compra: Compra Concluída");
    }

}
