public class exception2 {
    public static void validate(int age) throws InvalidAgeException {
        if(age < 18) {
            throw new InvalidAgeException("Invalid age: " + age);
        }
    }
    public static void main(String[] args) {
        try{
            validate(15);
        }
        catch(InvalidAgeException e){
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}
