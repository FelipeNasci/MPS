package View;

import Business.control.mementoCompra.CareTaker;
import Business.Model.Compras.Compras;
import Business.Model.Produto;
import Business.control.GerenciaProduto.GerenciaProduto;
import Business.control.gerenciaUsuario.FachadaUsuario;
import Business.control.Login.Interface_Login;
import Business.control.Login.LoginFacebook;
import Business.control.Login.LoginLocal;
import Business.control.mementoCompra.MementoCompra;

public class Principal {

    public static void main(String args[]) throws Exception {

        Interface_Login login;
        FachadaUsuario user = new FachadaUsuario();
        GerenciaProduto prod = new GerenciaProduto();

        Compras compra = new Compras();                                 //Carrinho de compras, contem todos os produtos escolhidos
        MementoCompra mementoCompra = new MementoCompra();
        //CommandStatusCompra statusCompra = mementoCompra.getStatus();   //statusCompra inicia como: ainda em carrinho
        CareTaker listaEstado = new CareTaker();

        Produto produtoTeste = new Produto("id", "Produto 1", "", true, true, 20.00);

        //Login Local
        login = new LoginLocal();
        login.login("root", "root");

        //Logando com o facebook
        login = new LoginFacebook();
        login.login("root", "root");

        //Adicionando Usuarios
        user.addUsuario("Usuario1", "Senha do Usuario 1", "11/09/18");

        //Adicionando Prdutos
        prod.addProduto("Panfleto", "Papel Couchê 90g", true, false, 0.018);

        //Testando comando PESQUISAR
        user.pesquisaUsuario("Usuario1");

        Thread.sleep(1000);

        System.err.println("\n** Padrão Memento **\n");
        Thread.sleep(1000);

        System.out.println("Início da compra");
        compra.addCarrinho(produtoTeste);
        compra.addCarrinho(produtoTeste);
        mementoCompra.getStatus(compra);    //Carrinho
        Thread.sleep(1000);

        System.out.println("\nAvançando na compra");
        //Salvando o estado atual e avancando para o proximo
        listaEstado.adicionarMemento(mementoCompra);
        mementoCompra.avancar();
        mementoCompra.getStatus(compra);    //Pagamento
        Thread.sleep(1000);

        System.out.println("\nConcluindo pagamento");
        listaEstado.adicionarMemento(mementoCompra);
        mementoCompra.avancar();
        mementoCompra.getStatus(compra);    //Pagamento Concluido
        Thread.sleep(1000);

        System.out.println("\nRetornando para estado anterior (Pagamento)");
        mementoCompra = listaEstado.getUltimoEstadoSalvo();
        mementoCompra.getStatus(compra);    //Pagamento
        Thread.sleep(1000);

        System.out.println("\nRetornando para estado anterior (Carrinho de compra)");
        mementoCompra = listaEstado.getUltimoEstadoSalvo();
        mementoCompra.getStatus(compra);    //Carrinho de compra
        Thread.sleep(1000);

        //Vai repetir o primeiro estado pois nao ha mais estados anteriores
        //Dessa maneira nao eh preciso retornar "null" o que pode ocasionar problemas futuros
        System.err.println("\nRetornando para estado anterior (Carrinho de compra)");
        mementoCompra = listaEstado.getUltimoEstadoSalvo();
        mementoCompra.getStatus(compra);    //Carrinho de compra
        Thread.sleep(1000);

        System.err.println("\nRetornando para estado anterior (Carrinho de compra)");
        mementoCompra = listaEstado.getUltimoEstadoSalvo();
        mementoCompra.getStatus(compra);    //Carrinho de compra
        Thread.sleep(1000);
    }

}
