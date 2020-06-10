package state;

public class Maquina {
    enum producto{chocolate, galletas, jugo, papas}

    IState i = new insuficiente();
    IState e = new exacto();
    IState s = new superior();
    Context context = new Context();
    int precio;

    public Maquina() { }


    public void pedido (int monto, producto p){

        switch (p) {
            case chocolate:
                precio = 10;
                break;
            case galletas:
                precio =3;
                break;
            case jugo:
                precio = 7;
                break;
            default:
                precio =5;
                break;
        }
        if (monto == precio){
            context.setState(e);
        }else if(monto < precio){
            context.setState(i);
        }else {
            context.setState(s);
        }

        context.request(monto, precio);
    }

}
