public class throwexample {
    public static void main(String[] args) {
        try{
            fun();
        }
        catch(Exception e){
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
    public static void fun() throws Exception {
        throw new Exception("This is a custom exception");
    }
}
