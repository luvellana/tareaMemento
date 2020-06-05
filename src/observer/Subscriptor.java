package observer;

import java.util.List;

public class Subscriptor implements ISubscriptor {
    private String nickname;
    private List<String> categorias;

    public Subscriptor(String nickname, List<String> categorias) {
        this.nickname = nickname;
        this.categorias = categorias;
    }

    public List<String> getCategorias() {
        return categorias;
    }

    @Override
    public void update(String msg) {
        System.out.println( nickname +"  > [Notificacion]"+msg);
    }
}
