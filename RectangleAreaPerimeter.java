class Rectangle1{
    int length;
    int breadth;

    int area(){
        return length*breadth;
    }

    int perimeter(){
        return 2*(length+breadth);
    }
}
public class RectangleAreaPerimeter{
    public static void main(String[]args){

        Rectangle1 rec=new Rectangle1();
        rec.length=4;
        rec.breadth=7;

        rec.area();
        rec.perimeter();
        
        System.out.println("area of rectangle is:" +rec.area());
        System.out.println("perimeter of rectangle is:" +rec.perimeter());


    }
}