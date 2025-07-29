class Base{
    int x;

    int getx(){
        return x;
    }

    void setx(int x){
        System.out.println("i am setting x now");
        this.x=x;
    }

    void printme(){
        System.out.println("i am a constructor");
    }
}

class Derived extends Base{
    int y;

    int gety(){
        return y;
    }

    void sety(int y){
        this.y=y;
    }
}

public class JavaInheritanceExample{
    public static void main(String[]args){
        Base b1=new Base();
        b1.setx(4);
        System.out.println(b1.getx());
        b1.printme();
       
        Derived d1=new Derived();
        d1.sety(47);
        System.out.println(d1.gety());
        d1.printme();
    }
}