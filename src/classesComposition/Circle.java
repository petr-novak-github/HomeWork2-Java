package classesComposition;


public class Circle
{
    private double r;
   // private String color;

    public Circle()
    {
        r = 1.0;
     //   color = "red";
    }
    public Circle(double r)
    {
       // color = "red";
        this.r = r;
    }
    public Circle(double r, String color)
    {
        this.r = r;
        //this.color = color;
    }
    public double getAreaCirc()
    {
        return 3.14 * r * r;
    }
    public double getRadius()
    {

        return r;
    }
}

