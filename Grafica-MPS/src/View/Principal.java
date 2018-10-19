package View;

import Business.Model.CadastraUsuario;

public class Principal {

    public static void main(String args[]) throws Exception {

        CadastraUsuario cadastraUsuario = new CadastraUsuario();
        
        cadastraUsuario.addUsuario("Michel Jackson", "BillieJean", "18/05/1995");
        
        
    }

}
