package Business.control;

import Business.Model.Mapa;
import Business.Model.Usuario;

public class UserControl {
    
    Rules rule = new Rules();
    
    String expLogin = "[a-z]{1,15}";
    String expSenha = "\\w{6,16}";
    Mapa mapa;
    
    public UserControl() {
        mapa = new Mapa();
    }
    
    public void addUser(Usuario user) {
        try {
            mapa.add(user);
            
            rule.checkSenha(user.login);    
        } catch (Exception e) {
            System.out.print("Erro");
        }finally{
            
        }
        
        
    }
    
    public void removeUser(Usuario user) {
        mapa.remove(user);
    }
    
    public void exibeUser(Usuario user) {
        Usuario get = mapa.map.get(user);
    }
    
    public void listAll(Usuario user) {
        mapa.map.keySet().forEach((String key) -> {
            //Capturamos o valor a partir da chave
            String s = mapa.map.get(key).login + 
                    mapa.map.get(key).senha ;
            System.out.println(s);
            
            
        });
    }
    
    public void salvar(){
        
        mapa.map.keySet().forEach((String key) -> {
            //Capturamos o valor a partir da chave
            String s = mapa.map.get(key).login + 
                    mapa.map.get(key).senha ;
            System.out.println(s);
            
            
        });
    }
    
}
