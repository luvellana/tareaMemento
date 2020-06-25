package composite;

/**
 * @autor : eynar.pari
 * @date : 24/06/2020.
 **/
abstract class Component {
    private int precio;
    public Component(){
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public abstract  int precioTotal();
    public abstract  void add(Component component);
    public abstract  void remove(Component component);

}
