//rectagular prism superclass implement shapes
public class Rectangular_Prism implements Shapes{
   protected double length;
   protected double width;
   protected double height;

   public Rectangular_Prism(double length, double width, double height){
      this.length = length;
      this.width = width;
      this.height = height;
   }
   public double get_Length(){
      return length;
   }
   public double get_Width(){
      return width;
   }
   public double get_Height(){
      return height;
   }
   public double Surface_Area(){
      return 2.0*length*width + 2.0*length*height + 2.0*width*height;
   }
   public double Volume(){
      return length*width*height;
   }
   public String toString(){
      return "Rectangular Prism";
   }
}
