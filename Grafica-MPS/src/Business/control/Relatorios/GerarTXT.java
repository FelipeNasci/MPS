package Business.control.Relatorios;

public class GerarTXT extends GeradorDeRelatorios {

    @Override
    public void relatorioProdAdquiridos(String dados) {

        System.out.println("Estruturando os dados: " + dados + "em TXT");
    }

    @Override
    public void relatorioVendas(String dados) {

        System.out.println("Estruturando os dados: " + dados + "em TXT");
    }

}
