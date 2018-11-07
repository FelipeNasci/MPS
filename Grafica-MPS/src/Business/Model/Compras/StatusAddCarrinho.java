package Business.Model.Compras;

public class StatusAddCarrinho implements CommandStatusCompra{

    @Override
    public void status(Compras compra) {
        compra.statusAddCarrinho();
    }

    @Override
    public CommandStatusCompra avancar() {
        return new StatusPagamento();
    }

}
