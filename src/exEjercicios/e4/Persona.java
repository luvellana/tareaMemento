package observer_4;

import java.util.LinkedList;
import java.util.List;

public class Persona implements IObserver{
    private List<String> categorias = new LinkedList<>();

    public Persona(String[] args) {
        if (args != null){
            for (String arg: args) {
                categorias.add(arg);
            }
        }
    }

    @Override
    public void update(String msg) {
        System.out.println("Notificacion: "+msg);
    }

    public List<String> getCategorias() {
        return categorias;
    }
}
