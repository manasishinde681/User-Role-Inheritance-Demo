interface Camera{
    public void takeSnap();
    public void recordVedio();
    private void greet(){
        System.out.println("good morning");
    }
    default void recordingvedio(){
        greet();
        System.out.println("recording in 4k...");
    }
}

interface Wifi{
    String[] getNetworks();
    void connectToNetwork(String network);
}
class CellPhone{
    void callNumber(int phoneNumber){
        System.out.println("calling"+ phoneNumber);
    }
    void pickCall(){
        System.out.println("connecting...");
    }
}
class SmartPhone extends CellPhone implements Wifi,Camera{
    public void takeSnap(){
        System.out.println("taking snap from camera");
    }
    public void recordVedio(){
        System.out.println("recording vedio");
    }
    public void recordingvedio(){
        System.out.println("taking snap and recording 4k vedio");
    }
    public String[] getNetworks(){
        System.out.println("getting a list of networks");
        String[] networkList={"harry","raj","tony"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("connecting to"+ network);
    }
} 
    
public class InterfaceDefaultMethods{
    public static void main(String[]args){
        SmartPhone ms=new SmartPhone();
        //ms.greet();throws an error
        ms.recordingvedio();
        String[] ar=ms.getNetworks();
        for(String item: ar){
            System.out.println(item);
        }
    }
}