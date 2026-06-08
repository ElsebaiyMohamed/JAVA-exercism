class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
        if (operation == null) {
            throw new IllegalArgumentException("Operation cannot be null");
        } else if (operation.isEmpty()) {
            throw new IllegalArgumentException("Operation cannot be empty");
        } else if (!operation.equals("+") && !operation.equals("*") && !operation.equals("/")) {
            throw new IllegalOperationException(String.format("Operation '%s' does not exist", operation));
        } else if (operation.equals("/") && operand2 == 0) {
            throw new IllegalOperationException("Division by zero is not allowed", new ArithmeticException());
        } else {
            return String.format("%d %s %d = %d", operand1, operation, operand2, getResult(operand1, operand2, operation));
        }
    }

    public int getResult(int operand1, int operand2, String operation) {
        if (operation.equals("+")) {
            return operand1 + operand2;
        } else if (operation.equals("*")) {
            return operand1 * operand2;
        } else {
            return operand1 / operand2;
        }
    }
}
