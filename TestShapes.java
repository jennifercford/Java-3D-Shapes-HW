public class TestShapes {
   public static void printInfo(Shapes s){
      System.out.println("The shape: " + s);
      System.out.println("Surface area : " +s.Surface_Area());
      System.out.println("Volume: " + s.Volume());
   }

   public static void main(String[] args){
      Sphere sph = new Sphere(12.0);
      Rectangular_Prism rectp = new Rectangular_Prism(2,4,7);
      Cone cone1 = new Cone(4.0,5);
      Cylinder cyl = new Cylinder(4.0, 5.0);
      Cube cub = new Cube (3.0);
      Triangular_Prism tri_p = new Triangular_Prism (2.0, 3.0, 4.0, 5.0);
      printInfo(sph);
      printInfo(rectp);
      printInfo(cone1);
      printInfo(cyl);
      printInfo(cub);
      printInfo(tri_p);
      //System.out.println(cone1.get_Radius());
      //System.out.println(cone1.Volume());
   }
}
