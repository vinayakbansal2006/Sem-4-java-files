public class multiplecatchexample {
    public static void main(String[] args) {
        try{
            String str = null;
            System.out.println(str.length());
        }
        catch(NullPointerException e){
            System.out.println("Null pointer exception! object is null");
        }
        catch(Exception e){
            System.out.println("Other exception caught: ");
        }
    }
}
