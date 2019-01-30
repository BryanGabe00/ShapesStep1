
public abstract class Shape
{
  private int positionX, positionY, height, width;

  public abstract double calcArea();

// getters
  public final int getPositionX() { return positionX; }
  public final int getPositionY() { return positionY; }
  public final int getHeight() { return height; }
  public final int getWidth() { return width; }

//setters
  public final void setPositionX(int positionX)
  {
    if(positionX < 0) throw new IllegalArgumentException("Position can't be negitive");
    this.positionX = positionX;
  }
  public final void setpositionY(int positionY)
  {
   if(positionY < 0) throw new IllegalArgumentException("Position can't be negitive");
   this.positionY = positionY;
  }
  public final void setWidth(int width)
  {
    if(width < 0) throw new IllegalArgumentException("Width can't be negitive");
    this.width = width;
  }
  public final void setHeight(int height)
  {
    if(height < 0) throw new IllegalArgumentException("Height can't be negitive");
    this.height = height;
  }
}
