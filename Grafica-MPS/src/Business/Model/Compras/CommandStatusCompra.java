package Business.Model.Compras;

public interface CommandStatusCompra {
    public void status(Compras compra);
    public CommandStatusCompra avancar();
}
