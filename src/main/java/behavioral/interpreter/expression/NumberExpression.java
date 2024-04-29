package behavioral.interpreter.expression;

import behavioral.interpreter.Context;

public class NumberExpression implements Expression {

    private final int number;

    public NumberExpression(int number) {
        this.number = number;
    }

    @Override
    public int interpret(Context context) {
        return number;
    }
}
