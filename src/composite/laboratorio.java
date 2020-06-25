package composite;

import java.util.ArrayList;
import java.util.List;

public class laboratorio extends Component {
    private List<Component> list = new ArrayList<>();
    private int precioTotal=0;

    @Override
    public int precioTotal() {
        for (Component componente:list ) {
            precioTotal=precioTotal+componente.precioTotal();
        }
        System.out.println("Componente : [laboratorio] precio Total : ["+ precioTotal +"]");
        return precioTotal;
    }

    @Override
    public void add(Component component) {
        if(component instanceof computadora){
            list.add(component);
        }else{
            System.out.println("Not Applicable");
        }
    }

    @Override
    public void remove(Component component) {
        list.remove(component);
    }


}
