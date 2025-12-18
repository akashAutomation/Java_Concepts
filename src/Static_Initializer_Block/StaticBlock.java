package Static_Initializer_Block;

public class StaticBlock {
    static int count;
    static {
        count = 10;
        System.out.println("Static block 1 executed. Count initialized to " + count);
        staticMethod(); // call static method
    }
    static {
        System.out.println("Static block 2 executed");
    }

    static {
        System.out.println("Static block 3 executed");
    }

    public static void main(String[] args) {
        System.out.println("Main method executed.");
        System.out.println("Count = " + count);
    }

    public static void staticMethod() {
        System.out.println("Static method called");
    }


}
