// Write a java program to use Multiple Catch Block 

class SimpleMultipleCatch {
    public static void main(String[] args) {
	
        try {
		
            int a = 10 / 0;
			
            int[] arr = new int[3];
            arr[2] = 100;

			String str = null;
            System.out.println(str.length());			
            
        }
		
		catch (ArithmeticException e) {
		
            System.out.println("Error: Cannot divide by zero!");
			
        }
		catch (ArrayIndexOutOfBoundsException e) {
		
            System.out.println("Error: Array index does not exist!");
        }
		
		catch (Exception e) {
           
            System.out.println("General exception handler for any other unhandled errors");
        }
    }
}