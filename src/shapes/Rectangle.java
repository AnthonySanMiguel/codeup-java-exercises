package shapes;

public class Rectangle extends Quadrilateral implements Measurable {


    @Override
    public void setLength(double length) {
        this.length = (int) length;
    }

    @Override
    public void setWidth(double width) {
        this.width = (int) width;
    }

    @Override
    public double getPerimeter() {
        return (length + width) * 2;
    }

    @Override
    public double getArea() {
        return length * width;
    }

//    protected int length;
//    protected int width;
//

    // the Rectangle constructor
    public Rectangle(int recLength, int recWidth) {
        super(recLength, recWidth);
        System.out.println("\nA rectangle is being created!\n");
    }
}

//
//    public int getArea() {
//        return length * width;
//    }
//
//    public int getPerimeter() {
//        return ((2 * length) + (2 * width));
//    }
