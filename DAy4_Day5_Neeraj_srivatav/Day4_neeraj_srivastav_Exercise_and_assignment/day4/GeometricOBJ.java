import java.util.Date;
abstract class GeometricOBJ 
{
  private String color;
  private boolean filled;
  private Date dateCreated;
  public String getColor()
    {
       return color;
    }
  public void setColor(String color)
    {
      this.color=color;
    }
 public boolean isFilled()
   {
      return filled;
   }
 public void setFilled(boolean filled)
  {
    this.filled=filled;
  }
 public Date getDayeCreate()
  {
    return dateCreated;
  }
 public String toString()
  {
    str=
  }
abstract  public double getArea();
abstract public double getParameter();
}
