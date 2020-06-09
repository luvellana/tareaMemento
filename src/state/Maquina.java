package state;

public class Maquina {
    private int montot;
    enum producto{chocolate, galletas, jugo, papas}

    IState i = new insuficiente();
    IState e = new exacto();
    IState s = new superior();
    Context context = new Context();

    public Maquina(int monto) {
        this.montot = monto;
    }


    public void pedido (int monto, producto p){

        switch (p) {
            case chocolate:
                if (monto == 10 ){
                    context.setState(e);
                }else if(monto < 10){
                    context.setState(i);
                }else {
                    context.setState(s);
                }
                break;
            case galletas:
                if (monto == 3){
                    context.setState(e);
                }else if(monto < 3){
                    context.setState(i);
                }else{
                    context.setState(s);
                }
                break;
            case jugo:
                if (monto == 7){
                    context.setState(e);
                }else if(monto < 7){
                    context.setState(i);
                }else{
                    context.setState(s);
                }
                break;
            default:
                if (monto == 5){
                    context.setState(e);
                }else if(monto < 5){
                    context.setState(i);
                }else{
                    context.setState(s);
                }
                break;

        }
    }

}
