package Static_Initializer_Block;

public class InitializerBlock {

    // Instance variable
    int count;

    // Instance initializer block
    {
        count = 10;
        System.out.println("Instance initializer block 1 executed");
        instanceMethod(); // call instance method
    }

    {
        System.out.println("Instance initializer block 2 executed");
    }

    static {
        System.out.println("Static block 2 executed");
    }

    // Constructor
    InitializerBlock() {
        System.out.println("Constructor executed");
    }

    public static void main(String[] args) {
        InitializerBlock obj1 = new InitializerBlock();
        InitializerBlock obj2 = new InitializerBlock();
    }

    void instanceMethod() {
        System.out.println("Instance method called");
    }


}
