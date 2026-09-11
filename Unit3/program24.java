//  Write a java program to use Finally block in Exception Handling

class FinallyBlockExample {
    public static void main(String[] args) {
		
        try {
			
            System.out.println("Inside try block");
            int result = 10 / 0; // Throws ArithmeticException
            System.out.println("Result: " + result);
			
        }
		
		catch (ArithmeticException e) {
			
            System.out.println("Inside catch block: Handled " + e.getMessage());
			
        } 
		
		finally {
			
            System.out.println("Inside finally block: This ALWAYS executes.");
			
        }

        System.out.println("Program continues normally...");
    }
}