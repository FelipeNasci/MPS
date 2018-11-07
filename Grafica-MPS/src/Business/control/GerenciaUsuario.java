package Business.control;

import Business.Model.Mapa;
import Business.Model.Usuarios.Usuario;
import Business.control.Command.Command;
import Business.control.Command.Pesquisa;
import Business.control.Command.PesquisaNome;
import Infra.CRUD;
import Infra.FabricaPersistencia;

public class GerenciaUsuario {
    
    Mapa mapa = new Mapa();
    
    FabricaPersistencia persistencia = new FabricaPersistencia();
    
    Usuario usuario;
    CRUD dados = persistencia.gravarRAM();
    
    public void addUsuario(String nome, String senha, String data){
        
        String str[] = data.split("/");
        
        usuario = new Usuario(nome, senha, Integer.parseInt(str[0]), Integer.parseInt(str[1]), Integer.parseInt(str[2]));
        mapa.add(usuario);
        dados.adicionar(usuario.getId() + "\t" + usuario.senha);
    }
    
    public void removeUsuario(Usuario usuario){
        mapa.remove(usuario);
    }
    
    public void exibeUsuario(){
        //Implemenar
    }
    
    public void pesquisaUsuario(String usuario){
        Pesquisa pesquisa = new Pesquisa();
        Command pesquisaUsr = new PesquisaNome();
        
        pesquisaUsr.execute(pesquisa, usuario);
        
    }
}
