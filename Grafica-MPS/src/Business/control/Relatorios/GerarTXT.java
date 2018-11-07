package Business.control.Relatorios;

public class GerarTXT extends TemplateRelatorios {

    @Override
    public void relatorioProdAdquiridos(String dados) {

        System.out.println("Estruturando os dados: " + dados + "em TXT");
    }

    @Override
    public void relatorioVendas(String dados) {

        System.out.println("Estruturando os dados: " + dados + "em TXT");
    }

}
