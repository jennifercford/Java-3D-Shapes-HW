//class for sphere stand alone class
public class Sphere implements Shapes{
   private double radius;

   public Sphere(double radius){
      this.radius = radius;
   }
   public double get_Radius(){
      return radius;
   }
   public double Surface_Area(){
      return 4*Math.PI*Math.pow(radius,2);
   }
   public double Volume(){
    return (4.0/3.0)*Math.PI*Math.pow(radius,3);
   }
   public String toString(){
      return "Sphere";
   }
