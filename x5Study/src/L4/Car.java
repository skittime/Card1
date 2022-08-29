package L4;

public abstract class Car extends Engine {
    public Engine engine;
    public Car car_manufacturer, class_car, weight;


    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLight() {
        System.out.println("Поворот налево");
    }

    public abstract void start();

    public abstract void stop();

    public abstract void printInfo();

}
