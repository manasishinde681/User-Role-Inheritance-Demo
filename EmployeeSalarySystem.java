abstract class Employee4{
    String name;
    int id;
    Employee4(String name,int id){
        this.name=name;
        this.id=id;
    }
    void displayDetails(){
        System.out.println("Name: " + name);

        System.out.println("Employee ID: " + id);
    }
    abstract public double calculateSalary();
} 

class FullTimeEmployee extends Employee4{
    double monthlySalary;
    FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary=monthlySalary;
    }

    public double calculateSalary(){
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee4{
    int hoursWorked;
    double ratePerHour;
    PartTimeEmployee(String name,int id,int hoursWorked,double ratePerHour){
        super(name, id);
        this.hoursWorked=hoursWorked;
        this.ratePerHour=ratePerHour;
    }
    public double calculateSalary(){
        return hoursWorked*ratePerHour;
    }
}

class Intern extends Employee4{
    double fixedDeposit;
    Intern(String name,int id,double fixedDeposit){
        super(name, id);
        this.fixedDeposit=fixedDeposit;
    }
    public double calculateSalary(){
        return fixedDeposit;
    }
}

public class EmployeeSalarySystem{
    public static void main(String[] args){
        Employee4 e4=new FullTimeEmployee("Manasi",47,500000);
        e4.displayDetails();
        System.out.println("salary:" + e4.calculateSalary());

        Employee4 e5=new PartTimeEmployee("Raj",74,500,40);
        e5.displayDetails();
        System.out.println("salary:" + e5.calculateSalary());
        
        Employee4 e6=new Intern("Anushka",31,470000);
        e6.displayDetails();
        System.out.println("salary:" + e6.calculateSalary());   
    }
}