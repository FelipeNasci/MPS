package Business.control.Relatorios;

public class GerarPDF extends TemplateRelatorios {

    @Override
    public void relatorioProdAdquiridos(String dados) {

        System.out.println("Estruturando os dados: " + dados + "em PDF");

    }

    @Override
    public void relatorioVendas(String dados) {

        System.out.println("Estruturando os dados: " + dados + "em PDF");
    }

}
