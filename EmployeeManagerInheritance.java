class Employee1{
    int id;
    String name;
    long salary;

    Employee1(int id,String name,long salary){
        System.out.println("this is a employee information");
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    public void display(){
        System.out.println("id:" + id);
        System.out.println("name: "+ name);
        System.out.println("salary: "+ salary);
    }
}

class Manager extends Employee1{
    String address;
    Manager(int id,String name,long salary,String address){
        super(id,name,salary);
        this.address=address;
    }
    @Override
    public void display(){
        super.display();
        System.out.println("address: "+ address);
    }
}

public class EmployeeManagerInheritance{
    public static void main(String[]args){
        Manager m1=new Manager(7,"raj",500000,"malegaon bk");
        m1.display();
    }
}