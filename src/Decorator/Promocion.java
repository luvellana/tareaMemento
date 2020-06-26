package Decorator;


import java.util.Random;

public class Promocion extends Decorator {
    private Random r = new Random();
    public Promocion(ICuenta cuenta) {
        super(cuenta);
    }

    public void showData() {
        int suerte = r.nextInt(2);

        if(super.getCuenta() instanceof Cuenta){
            if(suerte == 0){
            System.out.println("Felicidades su monto en la cuenta se duplico!");
            int monto = ((Cuenta)super.getCuenta()).getMonto();
            ((Cuenta)super.getCuenta()).setMonto(monto*2);
            super.showData();}
        }else{
            System.out.println("No ganaste nada");
            super.showData();
        }
    }

}
