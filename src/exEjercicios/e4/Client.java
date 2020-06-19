package observer_4;

public class Client {

    public static void main (String [] args){
        CompaniaTelefonica cotel = new CompaniaTelefonica("Cotel");

        Persona persona1 = new Persona(new String[]{"Precios", "Promociones"});
        Persona persona2 = new Persona(new String[]{"Premios"});
        Persona persona3 = new Persona(new String[]{"Premios", "Noticias"});
        Persona persona4 = new Persona(new String[]{"Noticias", "Precios"});
        Persona persona5 = new Persona(null);

        cotel.attach(persona1);
        cotel.attach(persona2);
        cotel.attach(persona3);
        cotel.attach(persona4);
        cotel.attach(persona5);

        cotel.notifyObserver("Precios", "Los precios están más baratos ahora.");
        cotel.notifyObserver("Premios", "Usted ha ganado una lavadora.");
        cotel.notifyObserver("Promociones", "Por hoy puede tener el 10% de descuento en sus llamadas.");
        cotel.notifyObserver("Noticias", "Cotel le informa que estamos de aniversario.");

    }
}
