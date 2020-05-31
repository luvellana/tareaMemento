package Interpreter;

public class TExpressionNum extends AbstractExpresion {

    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("1")) {
            context.output = context.output + 1; // la interpretacion --> contruyendo resultado interpretado
            context.input= context.input.substring(1); // Elimina caracter interpretado
        }
        if (context.input.startsWith("2")) {
            context.output = context.output + 2; // la interpretacion --> contruyendo resultado interpretado
            context.input= context.input.substring(1); // Elimina caracter interpretado
        }
        if (context.input.startsWith("3")) {
            context.output = context.output + 3; // la interpretacion --> contruyendo resultado interpretado
            context.input= context.input.substring(1); // Elimina caracter interpretado
        }
        if (context.input.startsWith("4")) {
            context.output = context.output + 4; // la interpretacion --> contruyendo resultado interpretado
            context.input= context.input.substring(1); // Elimina caracter interpretado
        }
        if (context.input.startsWith("5")) {
            context.output = context.output + 5; // la interpretacion --> contruyendo resultado interpretado
            context.input= context.input.substring(1); // Elimina caracter interpretado
        }
        if (context.input.startsWith("6")) {
            context.output = context.output + 6; // la interpretacion --> contruyendo resultado interpretado
            context.input= context.input.substring(1); // Elimina caracter interpretado
        }
        if (context.input.startsWith("7")) {
            context.output = context.output + 7; // la interpretacion --> contruyendo resultado interpretado
            context.input= context.input.substring(1); // Elimina caracter interpretado
        }
        if (context.input.startsWith("8")) {
            context.output = context.output + 8; // la interpretacion --> contruyendo resultado interpretado
            context.input= context.input.substring(1); // Elimina caracter interpretado
        }
        if (context.input.startsWith("9")) {
            context.output = context.output + 9; // la interpretacion --> contruyendo resultado interpretado
            context.input= context.input.substring(1); // Elimina caracter interpretado
        }
        if (context.input.startsWith("0")) {
            context.output = context.output + 0; // la interpretacion --> contruyendo resultado interpretado
            context.input= context.input.substring(1); // Elimina caracter interpretado
        }
    }
}
