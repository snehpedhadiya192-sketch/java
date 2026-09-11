// Write a java program to implement simple exception handling

class SimpleException {
    public static void main(String[] args) {
        
        try {
            int result = 10 / 0; // This will cause an error
            System.out.println(result);
        } 
        catch (Exception e) {
            System.out.println("You cannot divide a number by zero!");
        }
        
    }
}