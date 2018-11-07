package Infra;

public interface Persistencia {
    
    public abstract CRUD gravarRAM();
    public abstract CRUD gravarArquivo();
    public abstract CRUD gravarDataBase();
}
