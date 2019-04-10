//inheritence HW problem  cube which can be subclass of rectagular prism
public class Cube extends Rectangular_Prism{
   private double side;

   public Cube (double side){
      super(side,side,side);
   }

   /*public double Surface_Area (double side){
      return 6.0*Math.pow(side,3);
   }
   public double Volume (double side){
      return Math.pow(side,3);
   }*/
   public String toString(){
      return "Cube";
   }
}
