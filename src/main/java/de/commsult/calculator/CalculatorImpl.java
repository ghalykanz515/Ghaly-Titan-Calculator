package de.commsult.calculator;
import java.util.*;

public class CalculatorImpl implements Calculator {

	public double calculate(String formula) {
        String[] elements = formula.split("\\s+");
        Stack<Double> numbers = new Stack<>();
        Stack<String> operators = new Stack<>();

        for (String element : elements) {
            if (element.equals("(")) {
                operators.push(element);
            } else if (element.equals(")")) {
                while (!operators.isEmpty() && !operators.peek().equals("(")) {
                    applyOperator(numbers, operators.pop());
                }
                operators.pop();
            } else if (isOperator(element)) {
                while (!operators.isEmpty() && hasPrecedence(element, operators.peek())) {
                    applyOperator(numbers, operators.pop());
                }
                operators.push(element);
            } else {
                numbers.push(Double.parseDouble(element));
            }
        }

        while (!operators.isEmpty()) {
            applyOperator(numbers, operators.pop());
        }

        return numbers.pop();
    }

    private boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }

    private boolean hasPrecedence(String op1, String op2) {
        return (op1.equals("*") || op1.equals("/")) || (op2.equals("+") || op2.equals("-"));
    }

    private static void applyOperator(Stack<Double> numbers, String operator) {
        double operand2 = numbers.pop();
        double operand1 = numbers.pop();
        switch (operator) {
            case "+":
                numbers.push(operand1 + operand2);
                break;
            case "-":
                numbers.push(operand1 - operand2);
                break;
            case "*":
                numbers.push(operand1 * operand2);
                break;
            case "/":
                numbers.push(operand1 / operand2);
                break;
        }
    }
    
	/* @Override
	public double calculate(String formula) {
        String[] elements = formula.split("\\s+");
		
		double result = Double.parseDouble(elements[0]);
		
		for(int i = 1; i < elements.length; i += 2) 
		{
			String operator = elements[i];
			double operand = Double.parseDouble(elements[i + 1]);
			
			switch(operator) {
			case "+":
				result += operand;
				break;
				
			case "-":
				result -= operand;
				break;
				
			case "*":
				result *= operand;
				
			case "/":
				result /= operand;
			}
		}
		
		return 0; 
	} */
}
