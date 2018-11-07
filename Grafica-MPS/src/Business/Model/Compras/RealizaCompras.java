package Business.Model.Compras;

import Business.Model.Produtos.Produto;
import java.util.ArrayList;

public class RealizaCompras{

	ListaEstadosCompra lista;
	Compras compra;
	

	public RealizaCompras(){
		
		lista = new ListaEstadosCompra();
		compra = new Compras();	
		
	}

	public void avancar(Compra compra) {
        	lista.adicionarMemento(new MementoCompra(compra));
		this.compra = compra;
		compra.status.avancar();
    	}

	public void desfazer(){
		compra = ListaEstadosCompra.getUltimoEstadoSalvo()
	}

	public void mostrarStatus() {
        	compra.status();
    	}

}
