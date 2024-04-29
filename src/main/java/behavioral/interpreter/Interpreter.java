package behavioral.interpreter;

import behavioral.interpreter.expression.AdditionExpression;
import behavioral.interpreter.expression.Expression;
import behavioral.interpreter.expression.MultiplicationExpression;
import behavioral.interpreter.expression.NumberExpression;

public class Interpreter {
    private final Context context;

    public Interpreter(Context context) {
        this.context = context;
    }

    public int interpret(String expression) {
        // Parse expression and create expression tree
        Expression expressionTree = buildExpressionTree(expression);

        // Interpret expression tree
        return expressionTree.interpret(context);
    }

    private Expression buildExpressionTree(String expression) {
        /* Logic to parse expression and create expression tree, For simplicity,
          assume the expression is already parsed and represented as an expression tree */
        return new AdditionExpression(
                new NumberExpression(2),
                new MultiplicationExpression(
                        new NumberExpression(3),
                        new NumberExpression(4)
                )
        );
    }

}
