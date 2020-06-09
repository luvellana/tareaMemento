package strategy;

import java.util.List;

public interface IStrategy {
    List<Estudiante> execute(List<Estudiante> estudiantes);
}
