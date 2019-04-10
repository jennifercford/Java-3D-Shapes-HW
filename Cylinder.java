// cylinder that implements shapes giving it to cone its inheritor
public class Cylinder implements Shapes{
   protected double radius;
   protected double height;

   public Cylinder(double radius, double height){
      this.radius = radius;
      this.height = height;
   }
   public double get_Radius(){
      return radius;
   }
   public double get_Height(){
      return height;
   }
   public double Base_Area(){
      return Math.PI*Math.pow(radius,2);
   }
   public double Base_Perimeter(){
      return 2.0*Math.PI*radius;
   }
   public double Surface_Area(){
      return 2*Base_Area() + Base_Perimeter()*height;
   }
   public double Volume(){
      return Base_Area()*height;
   }
   public String toString(){
      return "Cylinder";
   }
}
