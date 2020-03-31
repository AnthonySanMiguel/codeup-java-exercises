package shapes;

public class Rectangle {
    protected int length;
    protected int width;

    // the Rectangle constructor
    public Rectangle(int recLength, int recWidth) {
        this.length = recLength;
        this.width = recWidth;
        System.out.println("\nA rectangle is being created!\n");
    }

    public int getArea() {
        return length * width;
    }

    public int getPerimeter() {
        return ((2 * length) + (2 * width));
    }
 }
