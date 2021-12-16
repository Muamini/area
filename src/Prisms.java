import java.util.Scanner;
public class Prisms {
   public double Volumeofprism(double radius,double height){
      double volume=  radius * radius * Math.PI * height;
       System.out.println("The volume is" + volume);
       return volume;
   }
   public double Areaofprism(double radius,double height){
      double area= (2*Math.PI*radius*radius) + (2*Math.PI*radius*height);
       System.out.println("The surface area"+ area);
       return area;
   }
   public void main(String[]args){
       double radius;
       double height;
       Scanner input = new Scanner(System.in);
       System.out.println("Enter the radius");
       radius = input.nextDouble(); //convert from string to double
       System.out.println("Enter the height");
       height = input.nextDouble();

       Volumeofprism(radius,height);
       Areaofprism(radius,height);
   }

    }