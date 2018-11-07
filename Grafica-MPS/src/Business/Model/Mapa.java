package Business.Model;
import java.util.HashMap;
import java.util.Map;

public class Mapa {

    public Map<String, Entidade> map;
    
    public Mapa (){
        map = new HashMap<>();     
    }
    
    public void add(Entidade entidade){
        map.put(entidade.getId(), entidade);
    }
     
    public void remove(Entidade entidade){
        map.remove(entidade.getId());
    }
    
    public void edit(Entidade entidade){
        map.put(entidade.getId(), entidade);
    }
    
}
