package View;

import Business.Model.Compras.Compras;
import Business.Model.Compras.StatusAddCarrinho;
import Business.Model.Produtos.Produto;
import Business.Model.Usuarios.Usuario;
import Business.control.GerenciaProduto;
import Business.control.GerenciaUsuario;
import Business.control.Login.Interface_Login;
import Business.control.Login.LoginFacebook;
import Business.control.Login.LoginLocal;
import Business.Model.Compras.CommandStatusCompra;

public class Principal {

    public static void main(String args[]) throws Exception {

        Interface_Login login;
        GerenciaUsuario user = new GerenciaUsuario();
        GerenciaProduto prod = new GerenciaProduto();
        
        Compras compra = new Compras();
        CommandStatusCompra statusCompra;
        
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
        
        compra.addCarrinho(produtoTeste);
        compra.addCarrinho(produtoTeste);

        statusCompra = new StatusAddCarrinho();
        statusCompra.status(compra);
        
        
        
        
        
    }

}
