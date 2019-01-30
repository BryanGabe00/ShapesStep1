
public class Rectangle extends Shape
{
  public Rectangle() { this(1, 1); }

  public Rectangle(int width, int height) { super(1, 1); }

  public double calcArea()
  {
    return getHeight() * getWidth();
  }
}
