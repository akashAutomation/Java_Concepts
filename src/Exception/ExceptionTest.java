package Exception;

import java.io.IOException;

public class ExceptionTest {
    public static void main(String[] args) {
        //test1();
        //preventFinallyExecution();
        System.out.println(test2());
    }

    public static void test1() {
        try {
            System.out.println("inside test1() try");
            throw new NullPointerException();
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("inside catch ArrayIndexOutOfBoundsException -> "+e);
        }
        catch(NullPointerException e) {
            System.out.println("inside catch NullPointerException -> "+e);
        }
        catch(Exception e){
            System.out.println("inside catch Exception -> "+e);
        }
        finally {
            System.out.println("inside finally");
        }
    }

    public static void preventFinallyExecution() {
        try {
            System.out.println("Inside try");
            System.exit(0);  // JVM terminates here
        } finally {
            System.out.println("Inside finally"); // This will NOT run
        }
    }
    public static int test2() {
        try {
            return 10;
        } finally {
            return 20;  //The finally return overrides the try return.
        }
    }


}
