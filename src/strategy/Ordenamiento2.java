package strategy;

import java.util.List;

public class Ordenamiento2 implements  IStrategy {
    @Override
    public List<Estudiante> execute(List<Estudiante> e) {
        System.out.println("Algoritmo 2: seleccion");
            int n = e.size();
            int posmin;
            for (int i = 0; i < n - 1; i++) {
                posmin = i;
                for (int j = i + 1; j < n; j++){
                    if (e.get(j).getPromedio() < e.get(posmin).getPromedio()){
                        posmin = j;
                    }
                }
                Estudiante t;
                t = e.get(i);
                e.set(i, e.get(posmin));
                e.set(posmin, t);
            }
        return e;
    }
}
