package Business.control.Relatorios;

public abstract class TemplateRelatorios {

    /*
    * Template Method
     */
    public abstract void relatorioProdAdquiridos(String dados);

    public abstract void relatorioVendas(String dados);

    public final void exibeRelatorioProdutosAquiritos() {
        
        String dados = "Dados do Banco";
        System.out.println("***************************************");

        System.out.println("Consultando Banco de Dados");
        System.out.println("Coletando dados");

        relatorioProdAdquiridos(dados);

        System.out.println("Exibe relatorio de Produtos Adquiridos");

        System.out.println("***************************************");
    }

    public final void exibirRelatoriosVendas() {
        
        String dados = "Dados do Banco";

        System.out.println("***************************************");

        System.out.println("Consultando Banco de Dados");
        System.out.println("Coletando dados");

        relatorioVendas(dados);

        System.out.println("Exibe relatorio Vendas");

        System.out.println("***************************************");

    }

}
