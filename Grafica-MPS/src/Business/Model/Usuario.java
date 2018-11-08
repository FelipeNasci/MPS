package Business.Model;

import Business.Model.Data;
import Business.Model.Entidade;

public class Usuario extends Entidade {

    public String senha;
    public Data data_nascimento;

    public Usuario(String login, String senha, int dia, int mes, int ano) {
        setId(login);
        this.senha = senha;

        data_nascimento = new Data(dia, mes, ano);
    }

    @Override
    public String toString() {
        return this.senha;
    }

}
