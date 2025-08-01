class Phone{

    public void good(){
        System.out.println("good morning");
    }
    public void on(){
        System.out.println("phone is on");
    }
}
class Smartphone extends Phone{

    public void swagat(){
        System.out.println("welcom");
    }
    public void on(){
        System.out.println("smartphone is on");
    }
}
public class Dynamicdispatch{
    public static void main(String[]args){
        Phone obj=new Smartphone();
        obj.good();
        obj.on();
    }
}