
package Business.Model;

public class Usuario {
    
    public String login;
    public String senha;
    public Data data_nascimento;

    public Usuario(String login, String senha, int dia, int mes, int ano ){
        this.login = login;
        this.senha = senha;
        
        data_nascimento = new Data( dia,  mes,  ano);
        
    }

    @Override
    public String toString(){
        return this.senha;
    }
    
}
