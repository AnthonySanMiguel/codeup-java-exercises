package shapes;

// the Square constructor
public class Square extends Quadrilateral {

    public Square(int side){
        super(side, side);
    }

    @Override
    public void setLength(double side) {
    }

    @Override
    public void setWidth(double side) {
        length = (int) side;
        width = (int) side;
    }

    @Override
    public double getPerimeter() {
        return (length + width) * 2;
    }

    @Override
    public double getArea() {
        return length * width;
    }
}

//    private int side;
//
//    public Square(int side) {
//        super(side, side); // If calling parent constructor by super, this needs to be done first before defining anything else!
//        this.side = side;
//    }
//
//    public int getArea2() {
//        System.out.println("\n" + "Square area is: ");
//        return side ^ 2;
//    }
//
//    public int getPerimeter2() {
//        System.out.println("\n" + "Square perimeter is: ");
//        return 4 * side;
//    }
//
