import java.util.Scanner;
public class Circle 
{
        double radius, area;
        final double pi = 3.14;
        
        public void cal_radius() //get the value of radius
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the radius value: ");
            this.radius = sc.nextInt();
        }  
        
        public void cal_area() //calculate area
        {
            area = pi*radius*radius;
            System.out.println("Area="+area);
       }
        public static void main(String[] args)
     {
           Circle c1 = new Circle();
           c1.cal_radius();
           c1.cal_area();
     }
}