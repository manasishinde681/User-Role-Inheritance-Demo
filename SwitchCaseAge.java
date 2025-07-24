import java.util.*;

class switchCaseAge{

    public static void main(String args[]){

        System.out.println("enter your age");
        
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();

        switch(age){
            case 18:
            System.out.println("you are adult");
            break;

            case 23:
            System.out.println("you are going to join a job");
            break;

            case 60:
            System.out.println("you are going to get retired");
            break;

            default:
            System.out.println("enjoy your life");

            sc.close();
        }
    }
}