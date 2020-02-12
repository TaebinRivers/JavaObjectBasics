/**
 * Created by h205p4 on 2/5/20.
 */
public class Runner {

    public static void main(String[] args) {

    Car myCar = new Car(2012, "Tesla", 2500, "Model S");
    System.out.println(myCar.toString());
    myCar.drive(100000);
    System.out.println(myCar.toString());
        Rectangle myRetcangle = new Rectangle(10,10);
        double area = myRetcangle.getArea(10,10);
        double diagonal = myRetcangle.getDiagonal(10,10);
        boolean square = myRetcangle.isSquare(10,10);
    System.out.println(area);
    System.out.println(diagonal);
    System.out.println(square);

        }


}
