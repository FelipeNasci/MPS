package Business.control.Relatorios;

public class GerarHTML extends TemplateRelatorios {

    @Override
    public void relatorioProdAdquiridos(String dados) {
        
        System.out.println("Estruturando os dados: " + dados + "em HTML");
        
    }

    @Override
    public void relatorioVendas(String dados) {
        
        System.out.println("Estruturando os dados: " + dados + "em HTML");
        
    }
    
}