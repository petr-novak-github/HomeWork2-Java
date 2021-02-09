package exercisesOnInheritance;



public class Cylinder extends Circle {
    // datove slozky
    private double height;
    // constructory
    public Cylinder()  {
    	super();
        height = 1.0;            
    }

    public Cylinder(double height)  {
    	super();
        this.height = height;
    }

    public Cylinder(double radius, double height)  {
    	super(radius);
        this.height = height;

    }
 

    public double getHeight() {

        return height;
    }

    public double getVolume() {

        return super.getArea() * height;
    }

    public double getArea() {

        return (super.getArea() * 2) + (2 * Math.PI * getRadius() * height);
    }

    public String toString()
    {
        return "Cylinder: subclass of " +   super.toString() +  " height " + height;
    }

}
