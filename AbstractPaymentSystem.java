abstract class Payment{
    abstract public void makePayment();

    void paymentInfo(){
        System.out.println("processing payments...");    
    }
}
class CreditCardPayment extends Payment{
    public void makePayment(){
        System.out.println("processing payment by credit card");
    }
}
class Upi extends Payment{
    public void makePayment(){
        System.out.println("processing payment by upi");
    }
}
class Paypal extends Payment{
    public void makePayment(){
        System.out.println("processing payment by paypal");
    }
}

public class AbstractPaymentSystem{
    public static void main(String[]args){
        Payment p=new CreditCardPayment();
        Payment p1=new Upi();
        Payment p2=new Paypal();
        p.makePayment();
        p1.makePayment();
        p2.makePayment();
    }
}