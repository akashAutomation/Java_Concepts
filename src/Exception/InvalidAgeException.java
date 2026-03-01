package Exception;

public class InvalidAgeException extends Exception {
    public InvalidAgeException(String msg) {
        super(msg);
    }
}

class UserService {
    public void registerUser(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above");
        }
        System.out.println("User registered successfully!");
    }

    public static void main(String[] args) {
        UserService obj =  new UserService();
        try {
            obj.registerUser(19);
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}





