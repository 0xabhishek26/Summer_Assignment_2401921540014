package program4;
public class Main {

    public static void main(String[] args) {

        Box b = new Box(5, 4);
        System.out.println("Area = " + b.area());

        Box3D b3 = new Box3D(5, 4, 3);
        System.out.println("Area = " + b3.area());
        System.out.println("Volume = " + b3.volume());
    }
}