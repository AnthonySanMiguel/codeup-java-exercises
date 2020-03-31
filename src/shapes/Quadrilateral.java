package shapes;

public abstract class Quadrilateral extends Shape implements Measurable {
    protected int length;
    protected int width;

    // the Quadrilateral constructor
    public Quadrilateral(int length, int width) {
        this.length = length;
        this.width = width;
        System.out.println("\nA quadrilateral is being created!\n");
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public abstract void setLength(double length);
    public abstract void setWidth(double width);

}
