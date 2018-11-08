package Business.control.mementoCompra;

import Business.Model.Compras.CommandStatusCompra;
import Business.Model.Compras.Compras;
import Business.Model.Compras.StatusAddCarrinho;

/* Estado atual */
public class MementoCompra {

    private CommandStatusCompra statusCompra;

    public MementoCompra() {
        statusCompra = new StatusAddCarrinho();
    }

    public CommandStatusCompra getStatus(Compras compra) {
        statusCompra.status(compra);
        return statusCompra;
    }

    public void avancar() {
        statusCompra = statusCompra.avancar();
    }

    //gets e sets de statusCompra
    public CommandStatusCompra getStatusCompra() {
        return statusCompra;
    }

    public void setStatusCompra(CommandStatusCompra statusCompra) {
        this.statusCompra = statusCompra;
    }
}
