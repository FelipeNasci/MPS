
package View;

import Business.Model.Mapa;
import Business.Model.Usuario;
import java.util.TreeSet;


public class UsaMapas {

    public static void main(String args[]) throws Exception {

        Mapa mapa = new Mapa();

        Usuario user1 = new Usuario("", "123", 18, 06, 70);
        Usuario user2 = new Usuario("Huck", "456", 18, 06, 95);
        Usuario user3 = new Usuario("Cassio", "852", 18, 06, 00);
        Usuario user4 = new Usuario("Abel", "852", 5, 06, 18);

        //Add hashMap
        mapa.add(user1);
        
        mapa.add(user2);
        mapa.add(user3);
        mapa.add(user4);

        user2.senha = "8999999999996";
        mapa.edit(user2);
        mapa.remove(user2);

        System.out.println("\n\n**** hashMap ****\n\n");

        for (String key : mapa.map.keySet()) {
            //Capturamos o valor a partir da chave
            Usuario user = mapa.map.get(key);
            System.out.println(key + " = " + user);
        }
        
    }

}
