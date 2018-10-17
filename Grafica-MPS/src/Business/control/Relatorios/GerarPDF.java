package Business.control.Relatorios;

public class GerarPDF implements Interface_Relatorio {

    @Override
    public void relatorioProdAdquiridos() {
        System.out.println("Gerando relatorios em PDF de Produtos Adquiridos");
    }

    @Override
    public void relatorioVendas() {
        System.out.println("Gerando relatorios em PDF de Vendas");
    }

}
