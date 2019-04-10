//subclass of cylinder sense both have radius and height parameters
public class Cone extends Cylinder{
   public Cone(double radius, double height){
      super(radius, height);
   }
   public double Slant_Length(){
      return Math.sqrt((height*height)+(radius*radius));
   }
   public double Surface_Area(){
      return Math.PI*radius*(radius + Slant_Length());
   }
   public double Volume(){
      return Base_Area()*height*(1.0/3.0);
   }
   public String toString(){
      return "Cone";
   }
}
