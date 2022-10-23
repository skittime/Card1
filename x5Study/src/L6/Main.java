package L6;

public class Main {
    public static void main(String[] args) {
        Box<Apple> box1 = new Box<>();
        Box<Orange> box2 = new Box<>();
        Box<Orange> box3 = new Box<>();
        box2.add(new Orange(), 45);
        System.out.println("Вес коробки с " + box2.getName() + " = " + box2.getWeight());
        box1.add(new Apple(), 9);
        box3.add(new Orange(), 444);
        box2.fruitSprinkle(box3, box2);

        System.out.println("Вес коробки с " + box1.getName() + " = " + box1.getWeight());
        System.out.println("Вес коробки с " + box3.getName() + " = " + box3.getWeight());

    }
}
