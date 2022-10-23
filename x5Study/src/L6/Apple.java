package L6;

public class Apple implements Fruit{

    public float getFruitWeight() {
        return 1.0f;
    }

    @Override
    public String getName() {
        return "яблоками";
    }
}
