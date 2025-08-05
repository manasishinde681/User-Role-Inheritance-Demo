interface Vehicle{
    void Start();
}

interface electricVehicle extends Vehicle{
    void chargeBattery();
}

class Tesla implements electricVehicle{
    public void chargeBattery(){
        System.out.println("battery is charged now!");
    }
    public void Start(){
        System.out.println("vehicle is start now!");
    }
}

public class InheritanceInInterface{
    public static void main(String[]args){
        electricVehicle v1=new Tesla();
        v1.Start();
        v1.chargeBattery();
    }
}