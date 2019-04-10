//inheritence HW problem  cube which can be subclass of rectagular prism
public class Cube extends Rectangular_Prism{
   private double side;

   public Cube (double side){
      super(side,side,side);
   }
   public String toString(){
      return "Cube";
   }
}
