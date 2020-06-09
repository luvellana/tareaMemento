package strategy;

import java.util.LinkedList;
import java.util.List;

public class Ordenamiento1 implements  IStrategy {
    @Override
    public List<Estudiante> execute(List<Estudiante> e) {
        System.out.println("Algoritmo 1: Burbuja");
        int n = e.size();
        for (int i = 0; i <= n - 2; i++) {
            for (int j = n - 1; j > i; j--){
                if (e.get(j - 1).getPromedio() > e.get(j).getPromedio()){
                    Estudiante t;
                    t = e.get(i);
                    e.set(i, e.get(j));
                    e.set(j, t);
                }
            }
        }

        return e;
    }

}
