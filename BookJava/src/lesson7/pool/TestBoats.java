package lesson7.pool;

public class TestBoats {
    public static void main(String[] args) {
        Boat b1 = new Boat();
        Sailboat b2 = new Sailboat();
        Rowboat b3 = new Rowboat();
        b2.setLenght(32);
        b1.move();
        b3.move();
        b2.move();

    }
}
