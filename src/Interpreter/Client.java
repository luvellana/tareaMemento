package Interpreter;

public class Client {

    public static void main (String [] args){
       String toInterpretate="1 + 5 - 3 + 8";
       System.out.println("Evaluate : "+toInterpretate+"\nInterpretate : "
               + new Parser(toInterpretate).evaluate());

    }
}
