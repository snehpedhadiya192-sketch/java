//Write a java program to use interface

// Interface definition

interface Animal {
    void makeSound(); 
    void sleep();     
}

// Class implementing the interface

class Dog implements Animal {

    @Override
    public void makeSound() {
        System.out.println("The dog says: Woof Woof");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping... Zzz");
    }
}

// Main class to run the program

class Interface {
    public static void main(String[] args) {
        Animal myDog = new Dog(); // Polymorphic reference
        
        myDog.makeSound();
        myDog.sleep();
    }
}