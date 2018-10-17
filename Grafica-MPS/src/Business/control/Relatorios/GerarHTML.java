package Business.control.Relatorios;

public class GerarHTML implements Interface_Relatorio {

    @Override
    public void relatorioProdAdquiridos() {
        System.out.println("Gerando relatorios de Produtos Adquiridos em HTML ");
    }

    @Override
    public void relatorioVendas() {
        System.out.println("Gerando relatorios de Vendas em HTML ");
    }
}