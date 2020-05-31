package abstractFactory;

public class FactoryHeladoconEnum {

    enum helados {
            Agua, Crema, Mixto
    }

    public static IHelado make(helados type) {

        IHelado helado;

        switch (type) {
            case Agua:
                helado = new Agua();
                ((Agua) helado).setBase(new Base("vaso", "galleta"));
                ((Agua) helado).setForma("bola");
                ((Agua) helado).setFruta(new Fruta("citrico", "naranja", 9));
                ((Agua) helado).setTamano("grande");
                break;
            case Crema:
                helado = new Crema();
                ((Crema) helado).setBase(new Base("vaso", "galleta"));
                ((Crema) helado).setForma("bola");
                ((Crema) helado).setFruta(new Fruta("citrico", "naranja", 6));
                ((Crema) helado).setTamano("grande");
                ((Crema) helado).setCrema(new CremaCrema("chocochoco", 10));
                break;
            case Mixto:
                helado = new Mixto();
                ((Mixto) helado).setBase(new Base("vaso", "galleta"));
                ((Mixto) helado).setForma("bola");
                ((Mixto) helado).setFruta(new Fruta("citrico", "naranja", 5));
                ((Mixto) helado).setTamano("grande");
                ((Mixto) helado).setCrema(new CremaCrema("chocochoco", 10));
                break;
            default:
                helado = new Crema();
                ((Crema) helado).setBase(new Base("vaso", "galleta"));
                ((Crema) helado).setForma("bola");
                ((Crema) helado).setFruta(new Fruta("citrico", "naranja", 20));
                ((Crema) helado).setTamano("grande");
                ((Crema) helado).setCrema(new CremaCrema("chocochoco", 10));
                break;
        }
        return helado;
    }
}
