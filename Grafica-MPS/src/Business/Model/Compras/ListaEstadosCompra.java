package Business.Model.Compras;

import java.util.ArrayList;

public class ListaEstadosCompra {

    ArrayList<MementoCompra> estados;

    public ListaEstadosCompra() {
        estados = new ArrayList<>();
    }

    public void adicionarMemento(MementoCompra memento, CommandStatusCompra status) {

        estados.add(memento);
    }

    public MementoCompra getUltimoEstadoSalvo() {
        if (estados.size() <= 0) {
            return null;
        }
        MementoCompra estadoSalvo = estados.get(estados.size() - 1);
        estados.remove(estados.size() - 1);
        return estadoSalvo;
    }
}
