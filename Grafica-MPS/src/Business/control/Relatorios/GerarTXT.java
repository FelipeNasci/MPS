package Business.control.Relatorios;

public class GerarTXT implements Interface_Relatorio {

    @Override
    public void relatorioProdAdquiridos() {
        System.out.println("Gerando relatorios de Produtos Adquiridos em TXT ");
    }

    @Override
    public void relatorioVendas() {
        System.out.println("Gerando relatorios de Vendas em TXT ");
    }
}