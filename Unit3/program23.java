// Write a java program to implement Arithmetic Exception

class ArithmeticExceptionExample {
    public static void main(String[] args) {
		
        try {
			
            int numbers = 50 / 0; // Triggers ArithmeticException (division by zero)
            System.out.println(numbers);
			
        } catch (ArithmeticException e) {
			
            System.out.println("Error: Division by zero is not allowed in arithmetic!");
        }
    }
}