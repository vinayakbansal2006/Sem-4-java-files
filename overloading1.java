class bankacccount{
    double getinterestrate(){
        return 0.0;
    }
}
class savingsaccount extends bankacccount{
    double getinterestrate(){
        return 4.0;
    }
}

public class overloading1 {
    public static void main(String[] args) {
        bankacccount sa = new savingsaccount();
        bankaccount ca= new currentaccount();
        System.out.println("savings account interest rate: " + sa.getinterestrate());
    }
}
