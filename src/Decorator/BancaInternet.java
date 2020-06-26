package Decorator;

public class BancaInternet extends Decorator {
    private boolean enable;

    public BancaInternet(ICuenta cuenta, boolean enable) {
        super(cuenta);
        this.enable=enable;
    }

    public void showData() {
        super.showData();
        if(enable){
            System.out.println("La banca por internet esta habilitada");

        }else{
            System.out.println("La banca por internet no esta habilitada");

        }
    }

}
