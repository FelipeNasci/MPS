package Infra.Factory;

public class ConexaoFactory {

    public Conexoes gerarConexao(String nomeConexao) {
        
        if (nomeConexao == "" || nomeConexao == null) {
            
            return null;
            
        }
        if (nomeConexao.toUpperCase().equals("ConexaoFirebird")) {
            
            return new ConexaoFirebird();
            
        }
        if (nomeConexao.toUpperCase().equals("ConexaoMySQL")) {
            
            return new ConexaoMySQL();
            
        }
        if (nomeConexao.toUpperCase().equals("ConexaoNoSQL")) {
            
            return new ConexaoNoSQL();
            
        }
        if (nomeConexao.toUpperCase().equals("ConexaoSQL")) {
            
            return new ConexaoSQL();
            
        }
        return null;
        
    }
    
}
