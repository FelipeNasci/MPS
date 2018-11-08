package Business.Model.Compras;

import Business.Model.Compras.Compras;

public interface CommandStatusCompra {
    public void status(Compras compra);
    public CommandStatusCompra avancar();
}
