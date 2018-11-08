package Business.Model.Compras;

import Business.Model.Compras.Compras;

public class StatusCompraConcluida implements CommandStatusCompra {

    @Override
    public void status(Compras compra) {
        compra.statusConcluido();
    }

   @Override
    public CommandStatusCompra avancar() {
        return null;
    }

}
