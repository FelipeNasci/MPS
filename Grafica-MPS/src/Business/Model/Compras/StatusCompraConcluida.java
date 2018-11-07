package Business.Model.Compras;

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
