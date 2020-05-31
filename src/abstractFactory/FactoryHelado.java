package abstractFactory;

public class FactoryHelado implements IFactoryHelado {
    @Override
    public IHelado make(String type) {
        IHelado helado;

        switch (type) {
            case "Agua":
                helado = new Agua();
                ((Agua)helado).setBase(new Base("canasta", "galleta"));
                ((Agua)helado).setForma("bola");
                ((Agua)helado).setFruta(new Fruta("citrico", "limon", 10));
                ((Agua)helado).setTamano("pequeno");
                break;
            case "Crema":
                helado = new Crema();
                ((Crema)helado).setBase(new Base("vaso", "galleta"));
                ((Crema)helado).setForma("bola");
                ((Crema)helado).setFruta(new Fruta("citrico", "naranja", 20));
                ((Crema)helado).setTamano("grande");
                ((Crema)helado).setCrema(new CremaCrema("chocochoco", 10));
                break;
            case "Mixto":
                helado = new Mixto();
                ((Mixto)helado).setBase(new Base("vasito", "vasos"));
                ((Mixto)helado).setForma("paleta");
                ((Mixto)helado).setFruta(new Fruta("Silvestres", "mora", 15));
                ((Mixto)helado).setTamano("mediano");
                ((Mixto)helado).setCrema(new CremaCrema("miel", 15));
                break;
            default:
                helado = new Agua();
                ((Agua)helado).setBase(new Base("cono", "GrandeCono"));
                ((Agua)helado).setForma("Cilindro");
                ((Agua)helado).setFruta(new Fruta("tropical", "platano", 20));
                ((Agua)helado).setTamano("Grande");
                break;
        }
        return helado;
    }
}
