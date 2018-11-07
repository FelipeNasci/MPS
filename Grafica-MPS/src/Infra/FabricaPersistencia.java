package Infra;

public class FabricaPersistencia implements Persistencia {

    @Override
    public CRUD gravarRAM() {
        return MemoriaRAM.getInstance();
    }

    @Override
    public CRUD gravarArquivo() {
        return Arquivos.getInstance();
    }

    @Override
    public CRUD gravarDataBase() {
        return Database.getInstance();
    }
    
}
