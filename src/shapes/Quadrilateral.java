package shapes;

abstract class Quadrilateral extends Shape implements Measurable {
    protected int length;
    protected int width;

    // the Quadrilateral constructor
    public Quadrilateral(int quadLength, int quadWidth) {
        this.length = quadLength;
        this.width = quadWidth;
        System.out.println("\nA quadrilateral is being created!\n");
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    abstract void setLength();
    abstract void setWidth();

}
