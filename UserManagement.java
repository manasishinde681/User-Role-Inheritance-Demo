 class User{
    String username;
    String email;

    User(String username,String email){
        this.username=username;
        this.email=email;
    }
    void login(){
        System.out.println("login successfully!");
    }

    void logout(){
        System.out.println("logout successfully!!");
    }

    void displayInfo(){
        System.out.println("username:" + username + ",email:" + email);
    }
}

class AdminUser extends User{
    int adminlevel;
    AdminUser(int adminlevel,String username,String email){
        super(username,email);
        this.adminlevel=adminlevel;
    }

    void manageSystem(){
        System.out.println("the system is managed");
    }

    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("adminlevel:" + adminlevel);
    }
}

class RegularUser extends User{
    int loyalitypoints;
RegularUser(int loyalitypoints,int adminlevel,String username,String email){
    super(username,email);
    this.loyalitypoints=loyalitypoints;
}

void browseProducts(){
    System.out.println("user loyality information");
}

@Override
void displayInfo(){
    super.displayInfo();
    System.out.println("loyalitypoints:" + loyalitypoints);
    }
} 

public class Inheritance2{
    public static void main(String[]args){
        User u1=new AdminUser( 7,  "adminuser",  "adminuser@gmail.com");
        User u2=new RegularUser( 4, 10, "regularuser", "regularuser@gmail.com");
        u1.displayInfo();
        u2.displayInfo();   
    }
}