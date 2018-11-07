package Business.control.Command;

public class PesquisaNome implements Command {

    @Override
    public void execute(Pesquisa pesquisa, String nome) {
        pesquisa.pesquisaNome(nome);
    }
}
