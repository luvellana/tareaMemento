package state;

public class Client {
    public static void main(String [] abc){

        IState state = new insuficiente();

        Context context = new Context();
        context.setState(state);
        context.request();

        state = new exacto();
        context.setState(state);
        context.request();

    }

}
