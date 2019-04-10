//another stand alone class triangular prism
public class Triangular_Prism implements Shapes{
   private double a;
   private double b;
   private double c;
   private double height;

   public Triangular_Prism( double a, double b, double c, double height){
      this.a = a;
      this.b = b;
      this.c = c;
      this.height = height;
   }
   public double get_SideA(){
      return a;
   }
   public double get_SideB(){
      return b;
   }
   public double get_SideC(){
      return c;
   }
   public double get_Height(){
      return height;
   }
   public double Base_Area(){
      double s = (a+b+c)/2.0;
      return Math.sqrt(s*(s-a)*(s-b)*(s-c));
   }
   public double Base_Perimeter(){
      return a + b + c;
   }
   public double Surface_Area(){
      return 2*Base_Area() + Base_Perimeter()*height;
   }
   public double Volume(){
      return Base_Area()*height;
   }
   public String toString(){
      return "Triangualr Prism";
   }
}
