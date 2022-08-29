package L4;

public class SportCar extends Car{

    @Override
    public void start() {
        System.out.println(getClass().toString() + " поехал");
    }

    @Override
    public void stop() {
        System.out.println(getClass().toString() + " остановился");
    }

    @Override
    public void printInfo() {
        toString();

    }

    @Override
    public String toString() {
        return "SportCar{" +
                "engine=" + engine +
                ", car_manufacturer=" + car_manufacturer +
                ", class_car=" + class_car +
                ", weight=" + weight +
                '}';
    }
}
