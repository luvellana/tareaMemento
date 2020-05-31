package Interpreter;
import java.util.ArrayList;

public class Parser {
    // no terminal expresion
    private ArrayList<AbstractExpresion> parseTree = new ArrayList<AbstractExpresion>();
    private Context context;

    public Parser(String s) {
        context= new Context(s.replace(" ",""));
        for (String token : s.split(" ")) {
           switch (token){
               case "+":
                   parseTree.add(new TExpressionplus());
                   break;
               case "-":
                   parseTree.add(new TExpressionMinus());
                   break;
               default:
                   parseTree.add(new TExpressionNum());;
           }
        }
    }

    public int evaluate() {
        for (AbstractExpresion e : parseTree)
            e.interpreter(context);


        return context.output;
    }
}
