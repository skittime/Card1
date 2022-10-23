package L6;

public class Box<T extends Fruit> {
    private int amount;
    private float fruitWeight;
    private String name;

    public String getName() {
        return name;
    }

    public void add(T fruit, int amount) {
        this.amount = amount;
        this.fruitWeight = fruit.getFruitWeight();
        this.name = fruit.getName();
               }

    public float getWeight() {
        if (amount == 0) {
            return 0;
        } else {
            return amount * fruitWeight;
        }
    }

    public void fruitSprinkle(Box<T> firstBox, Box<T> secondBox) {
        secondBox.amount = firstBox.amount + secondBox.amount;
        firstBox.amount = 0;

}
    }