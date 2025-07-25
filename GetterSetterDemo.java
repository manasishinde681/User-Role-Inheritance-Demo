class MyEmployee{
     int id;
     String name;

    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    public int getId(){
        return id;
    }
    public void setId(int x){
        id=x;
    }
}
public class GetterSetterDemo{
    public static void main(String[]args){
        MyEmployee tony=new MyEmployee();

        tony.setName("Raj");
        System.out.println(tony.getName());

        tony.setId(47);
        System.out.println(tony.getId());
    }
}