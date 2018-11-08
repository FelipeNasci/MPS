package Business.control.commandPesquisa;

public class PesquisaMaterial implements Command{

    @Override
    public void execute(Pesquisa pesquisa, String material){
        pesquisa.pesquisaMaterial(material);
    }    
}
