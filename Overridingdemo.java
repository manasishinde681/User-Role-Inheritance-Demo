class A{
    int harry(){
        return 4;
    }
    void meth2(){
        System.out.println("i am a meth 2 of class A");
    }
}

class B extends A{
    @Override
    void meth2(){//ovrrides method in A
        System.out.println("i am a meth 3 of class B");
    }
    void meth3(){
        System.out.println("i am a meth 3 of class B");
    }
}

public class Overridingdemo{
    public static void main(String[]args){
        A a= new A();
        B b= new B();
        b.meth2();
        a.meth2();
    }
}