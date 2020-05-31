package Interpreter;

public class TExpressionMinus extends AbstractExpresion {

    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("-")) {
            context.input= context.input.substring(1); // Elimina caracter interpretado

            if (context.input.startsWith("0")) {
                context.output = context.output - 0;
            }
            if (context.input.startsWith("1")) {
                context.output = context.output - 1;
            }
            if (context.input.startsWith("2")) {
                context.output = context.output - 2;
            }
            if (context.input.startsWith("3")) {
                context.output = context.output - 3;
            }
            if (context.input.startsWith("4")) {
                context.output = context.output - 4;
            }
            if (context.input.startsWith("5")) {
                context.output = context.output - 5;
            }
            if (context.input.startsWith("6")) {
                context.output = context.output - 6;
            }
            if (context.input.startsWith("7")) {
                context.output = context.output - 7;
            }
            if (context.input.startsWith("8")) {
                context.output = context.output - 8;
            }
            if (context.input.startsWith("9")) {
                context.output = context.output - 9;
            }

            context.input= context.input.substring(1);

        }
    }
}
