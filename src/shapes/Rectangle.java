package shapes;

public class Rectangle extends Quadrilateral implements Measurable {


 @Override
 void setLength() {

 }

 @Override
 void setWidth() {

 }

 @Override
 public double getPerimeter() {
  return 0;
 }

 @Override
 public double getArea() {
  return 0;
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
