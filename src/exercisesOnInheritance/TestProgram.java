package exercisesOnInheritance;

public class TestProgram {

	public static void main(String[] args) {
		Cylinder c1 = new Cylinder();
        System.out.println("Cylinder:" + "\n"
            + " radius=" + c1.getRadius() + "\n"
            + " height=" + c1.getHeight() + "\n"
          //tady by nemelo byt base area ale area, kdyz uz sem vytvoril prekrytou metodu, ktera nepocita plochu podstavy, ale celeho cylindru
          //no plochu podstavy uz ted asi nezavolam
            + " base area=" + c1.getArea() + "\n"
            + " volume=" + c1.getVolume());

        Cylinder c2 = new Cylinder(10.0);
        System.out.println("Cylinder:" + "\n"
            + " radius=" + c2.getRadius() + "\n"
            + " height=" + c2.getHeight() + "\n"
            + " base area=" + c2.getArea() + "\n"
            + " volume=" + c2.getVolume());

        System.out.println(c2);

        Circle cc1 = new Circle();
        System.out.println(cc1);



  

	}

}
