package composite;

/**
 * @autor : eynar.pari
 * @date : 24/06/2020.
 **/
public class computadora extends Component {


    public computadora() {
        this.setPrecio(100);
    }

    @Override
    public int precioTotal() {
        System.out.println("Componente : [computadora] Precio Total : ["+this.getPrecio()+"]");
        return this.getPrecio();
    }

    @Override
    public void add(Component component) {
        System.out.println("Not Applicable");
    }

    @Override
    public void remove(Component component) {
        System.out.println("Not Applicable");
    }

}
