package Business.control;

import Business.Model.Mapa;
import Business.Model.Produtos.Produto;
import Business.Model.Usuarios.Usuario;
import Infra.CRUD;
import Infra.FabricaPersistencia;
import java.util.Random;

public class GerenciaProduto {

    Mapa mapa = new Mapa();

    FabricaPersistencia persistencia = new FabricaPersistencia();
    CRUD dados = persistencia.gravarArquivo();

    public void addProduto(String nome, String material, boolean frente, boolean verso, double valor) {

        Random rand = new Random();
        int numero = rand.nextInt(100);
        
        Produto produto = new Produto( String.valueOf(numero), nome, material, frente, verso, valor);
        
        mapa.add(produto);
        System.err.println( "            "+ "id"+ "\t" + "Nome" + "\t" + "Material" + "\t" + "Frente" + "\t" + "Verso"+ "\t" + "Valor");
        dados.adicionar(produto.getId() + "\t" + 
                        produto.getNome() + "\t" + 
                        produto.getMaterial() + "\t" + 
                        produto.isImpressoFrente() + "\t" +
                        produto.isImpressoVerso()+ "\t" +
                        produto.getValor());
    }
}
