package classesComposition;

public class Cylinder
{
    private Circle kruh;
    private double h;
    //constructor with default color, radius and height
    public Cylinder()
    {
        kruh = new Circle();
        h = 1.0;
    }
    //constructor with default radius, color but given height
    public Cylinder(double h)
    {

        kruh = new Circle();
        this.h = h;
    }

    // constructor with default color, but given radius, height

    public Cylinder(double r, double h)
    {

        this.h = h;
        kruh = new Circle(r);

    }

    //A public method retrieving the height

    public double getHeight()
    {
        return h;
    }

    //A public method for computing the volume of cylinder

    public double getVolume()
    {

        return kruh.getAreaCirc() * h;
    }

    public double getRadius()
    {
        return kruh.getRadius();
    }

    public double getBaseArea()
    {
        return kruh.getAreaCirc();
    }
}
