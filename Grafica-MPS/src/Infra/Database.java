package Infra;

public class Database implements Interface_Dados {

    //Aplicando Singleton
    private Database(){}
    public static Database dataBase = null;
    
    public static Database getInstance(){
        if(dataBase == null)
            dataBase = new Database();
        return dataBase;
    }
    
    
    @Override
    public void adicionar(String arquivo) {
        System.out.println("Adicionando " + arquivo + "em Banco de dados");
    }

    @Override
    public void remover(String arquivo) {
        System.out.println("Removendo " + arquivo + "em Banco de dados");
    }

    @Override
    public void consultar(String arquivo) {
        System.out.println("Consultando" + arquivo + "em Banco de dados");
    }

    @Override
    public void ler(String arquivo) {
        System.out.println("Lendo " + arquivo + "em Banco de dados");
    }
}
