package Business.control.mementoCompra;

import java.util.ArrayList;

public class CareTaker {

    ArrayList<MementoCompra> estados;

    public CareTaker() {
        estados = new ArrayList<>();
    }

    public void adicionarMemento(MementoCompra memento) {
        MementoCompra m = new MementoCompra();
        m.setStatusCompra(memento.getStatusCompra());
        estados.add(m);
    }

    public MementoCompra getUltimoEstadoSalvo() {
        
        MementoCompra estadoSalvo =  estados.get(estados.size() - 1);

        if (estados.size() > 1) {
            estados.remove(estados.size() - 1);
        }
        
        return estadoSalvo;
    }
}
