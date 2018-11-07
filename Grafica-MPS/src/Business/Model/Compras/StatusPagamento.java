package Business.Model.Compras;

public class StatusPagamento implements CommandStatusCompra {

    @Override
    public void status(Compras compra) {
        compra.statusPagamento();
    }

    @Override
    public CommandStatusCompra avancar() {
        return new StatusCompraConcluida();
    }

}
