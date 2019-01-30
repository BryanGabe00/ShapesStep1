

public class ShapesStep1
{
  public static void main(String[] args)
  {
    Rectangle r = new Rectangle();

    System.out.println("Shapes");

    double area = r.calcArea();

    System.out.format("Area = %f\n", area);
  }
}
