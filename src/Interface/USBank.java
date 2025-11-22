package Interface;

public interface USBank { // by default public, abstract

    // USBank s = new USBank(); --> cannot create object for interface

    // public USBank{}; --> Constructor is not allowed in interface


    int min_bal = 100; // by default public, static, final in nature
	
    void credit();  // by default public, cannot be final/static
	
	public void debit();
	
    void transferMoney();

    static void a(){
        System.out.println("interface US bank- static method ");
    };

    default void b(){
        System.out.println("interface US bank- default method ");
    };

    private void c(){
        System.out.println("interface US bank- private method ");
    };

    interface nestedInterface { // by default public, abstract
         static void d(){
            System.out.println("nested interface US bank- static method ");
        };
    }

}
