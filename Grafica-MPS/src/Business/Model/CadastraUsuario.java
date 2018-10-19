package Business.Model;

import Infra.Interface_Dados;
import Infra.MemoriaRAM;

public class CadastraUsuario {
    
    Mapa mapa = new Mapa();
    Usuario usuario;
    Interface_Dados dados = MemoriaRAM.getInstance();
    
    public void addUsuario(String nome, String senha, String data){
        
        String str[] = data.split("/");
        
        usuario = new Usuario(nome, senha, Integer.parseInt(str[0]), Integer.parseInt(str[1]), Integer.parseInt(str[2]));
        mapa.add(usuario);
        dados.adicionar(usuario.login + "\t" + usuario.senha);
    }
    
}
