package observer_4;

import java.util.ArrayList;

public class CompaniaTelefonica implements ISubject {
    private ArrayList<IObserver> personas = new ArrayList<>();
    private String nombreCompania;

    public CompaniaTelefonica(String nombreCompania) {
        this.nombreCompania = nombreCompania;
    }

    @Override
    public void attach(IObserver persona) {
        this.personas.add(persona);
    }

    @Override
    public void deAttach(IObserver persona) {
        this.personas.remove(persona);
    }

    @Override
    public void notifyObserver(String tipo, String msg) {
        for (IObserver persona : personas) {
            for (String categoria : ((Persona) persona).getCategorias()) {
                if (categoria.equals(tipo)) {
                    persona.update(msg);
                }
            }
        }
    }

}
