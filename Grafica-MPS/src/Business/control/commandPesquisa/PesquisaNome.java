package Business.control.commandPesquisa;

public class PesquisaNome implements Command {

    @Override
    public void execute(Pesquisa pesquisa, String nome) {
        pesquisa.pesquisaNome(nome);
    }
}
