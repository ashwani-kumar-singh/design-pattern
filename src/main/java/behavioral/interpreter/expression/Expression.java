package behavioral.interpreter.expression;

import behavioral.interpreter.Context;

public interface Expression {
    int interpret(Context context);
}
