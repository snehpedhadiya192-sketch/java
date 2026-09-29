// Write a java program to use Local Inner Class

class LocalInnerClass {
    void display() {
        // Local Inner Class defined inside a method
        class LocalInner {
            void msg() {
                System.out.println("Hello from Local Inner Class!");
            }
        }

        // Instantiated and used inside the method
        LocalInner inner = new LocalInner();
        inner.msg();
    }

    public static void main(String[] args) {
        Main outer = new Main();
        outer.display();
    }
}