package de.commsult.calculator;

import java.util.Stack;

public class CalculatorImpl implements Calculator {

	@Override
    public double calculate(String formula) {
        Stack<Double> numberStack = new Stack<>();
        Stack<Character> operatorStack = new Stack<>();
        StringBuilder numBuilder = new StringBuilder();
        boolean wasToken = true;

        for (int i = 0; i < formula.length(); i++) {
            char c = formula.charAt(i);

            if (c ==  ' ') {
                continue;
            }

            if (c == '-' && wasToken) {
                numBuilder.append(c);
            } else if (Character.isDigit(c) || c == '.') {
                while (i < formula.length() && (Character.isDigit(formula.charAt(i)) || formula.charAt(i) == '.')) {
                    numBuilder.append(formula.charAt(i));
                    i++;
                }
                i--;
                double num = Double.parseDouble(numBuilder.toString());
                numberStack.push(num);
                numBuilder.setLength(0);
            } else if (isOperator(c)) {
                while (!operatorStack.isEmpty() && precedence(operatorStack.peek()) >= precedence(c)) {
                    performOperation(numberStack, operatorStack);
                }
                operatorStack.push(c);
            } else if (c == '(') {
                operatorStack.push(c);
            } else if (c == ')') {
                while (!operatorStack.isEmpty() && operatorStack.peek() != '(') {
                    performOperation(numberStack, operatorStack);
                }
                operatorStack.pop();
            }
            wasToken = isOperator(c) || c == '(';
        }

        while (!operatorStack.isEmpty()) {
            performOperation(numberStack, operatorStack);
        }

        return numberStack.pop();
    }

    private void performOperation(Stack<Double> numberStack, Stack<Character> operatorStack) {
        char operator = operatorStack.pop();
        double operand2 = numberStack.pop();
        double operand1 = numberStack.pop();
        double result = applyOperator(operand1, operand2, operator);
        numberStack.push(result);
    }

    private double applyOperator(double operand1, double operand2, char operator) {
        switch (operator) {
            case '+':
                return operand1 + operand2;
            case '-':
                return operand1 - operand2;
            case '*':
                return operand1 * operand2;
            case '/':
                if (operand2 == 0) {
                    throw new ArithmeticException("Division by zero");
                }
                return operand1 / operand2;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }

    private boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }

    private int precedence(char operator) {
        if (operator == '+' || operator == '-') {
            return 1;
        } else if (operator == '*' || operator == '/') {
            return 2;
        }
        return 0;
    }
}
