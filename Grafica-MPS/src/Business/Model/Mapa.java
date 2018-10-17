package Business.Model;
import java.util.HashMap;
import java.util.Map;

public class Mapa {
     
    public Map<String, Usuario> map;
    
    public Mapa (){
        map = new HashMap<>();     
    }

    public void add(Usuario user){
        map.put(user.login, user);
    }
     
    public void remove(Usuario user){
        map.remove(user.login);
    }
    
    public void edit(Usuario user){
        map.put(user.login, user);
    }
}
