package shapes;

public class ShapesTest {

    public static void main (String[] args){

        Rectangle recTest= new Rectangle(25, 10);
        System.out.println("\trecTest Area: " + recTest.getArea());
        System.out.println("\trecTest Perimeter: " + recTest.getPerimeter());

        Rectangle box1 = new Rectangle(5, 4);
        System.out.println("\tbox1 Area: " + box1.getArea());
        System.out.println("\tbox1 Perimeter: " + box1.getPerimeter());

        Square box2 = new Square(5);
        System.out.println("\tbox2 Area: " + box2.getArea());
        System.out.println("\tbox2 Perimeter: " + box2.getPerimeter());

        System.out.println("\tbox2 area: " + box2.getArea2());
        System.out.println("\tbox2 perimeter: " + box2.getPerimeter2());

    }
}
