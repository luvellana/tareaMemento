package strategy;

import java.util.LinkedList;
import java.util.List;

public class Colegio {

    private IStrategy strategy;
    private List<Estudiante> estudiantes = new LinkedList<Estudiante>();

    public Colegio(){}

    public void execute(){
        this.strategy.execute(estudiantes);
        for(Estudiante e: estudiantes){
            System.out.println(e.getNombre());
        }

    }

    public IStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }
}
