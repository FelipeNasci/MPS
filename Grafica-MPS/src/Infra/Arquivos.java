
package Infra;
public class Arquivos implements CRUD{

    private Arquivos(){}
    public static Arquivos arquivo = null;
    
    public static Arquivos getInstance(){
        if(arquivo == null)
            arquivo = new Arquivos();
        return arquivo;
    }
    
    @Override
    public void adicionar(String arquivo) {
        System.out.println("Adicionando " + arquivo + "em Banco de Arquivos TXT");
    }

    @Override
    public void remover(String arquivo) {
        System.out.println("Removendo " + arquivo + "em Banco de Arquivos TXT");
    }

    @Override
    public void consultar(String arquivo) {
        System.out.println("Consultando" + arquivo + "em Banco de Arquivos TXT");
    }

    @Override
    public void ler(String arquivo) {
        System.out.println("Lendo " + arquivo + "em Banco de Arquivos TXT");
    }
    
}
