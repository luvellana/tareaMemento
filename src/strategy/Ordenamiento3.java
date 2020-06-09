package strategy;

import java.util.List;

public class Ordenamiento3 implements  IStrategy {
    @Override
    public List<Estudiante> execute(List<Estudiante> e) {
        System.out.println("Algoritmo 3: Insercion");

            int n = e.size();
            for (int i = 1; i <= n - 1; i++) {
                Estudiante x = e.get(i);
                int j = i - 1;
                while (j >= 0 && x.getPromedio() < e.get(j).getPromedio()) {
                    e.set(j + 1, e.get(j));
                    j = j - 1;
                }
                e.set(j + 1, x);
            }

        return e;
    }
}
