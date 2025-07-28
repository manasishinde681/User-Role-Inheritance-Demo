class Cylinder1{

    int radius;
    int height;

    int getRadius(){
        return radius;
    }

    void setRadius(int radius){
        this.radius=radius;
    }

    int getHeight(){
        return height;
    }

    void setHeight(int height){
        this.height=height;
    }

    double surfaceArea(){
        return 2*3.14*radius*(radius+height);
    }

    double volume(){
        return 3.14*radius*radius*height;
    }
}

public class CylinderSurfaceVolume{
    public static void main(String[]args){
        Cylinder1 c1=new Cylinder1();
        c1.setRadius(4);
        System.out.println("value of radius:");
        System.out.println(c1.getRadius());

        c1.setHeight(7);
        System.out.println("value of height:");
        System.out.println(c1.getHeight());

        System.out.println("surface area of cylinder:");
        System.out.println(c1.surfaceArea());

        System.out.println("volume of cylinder:");
        System.out.println(c1.volume());
    }
}