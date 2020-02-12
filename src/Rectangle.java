/**
 * Created by h205p4 on 2/5/20.
 */
public class Rectangle {
    private double Length;
    private double Width;

    public Rectangle(double width, double length) {

        Length = length;
        Width = width;

    }

    public double getLength() {
        return Length;
    }

    public double getWidth() {
        return Width;
    }

    public void setLength(double length) {
        Length = length;
    }

    public void setWidth(double width) {
        Width = width;
    }
    public double getArea(double width, double length) {

        return width * length;

    }
    public double getDiagonal(double width, double length) {

        return Math.sqrt((width * width) + (length * length));

    }
    public boolean isSquare(double width, double length) {

        if(length == width) {

            return true;

        }else {

            return false;

        }
    }
}
