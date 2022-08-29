package L4;

public class Lorry extends Car {
    private String load_capacity;

    @Override
    public void start() {
        System.out.println("Грузовик поехал");
    }

    @Override
    public void stop() {
        System.out.println("Грузовик Остановился");
    }

    @Override
    public void printInfo() {
        toString();

    }

    @Override
    public String toString() {
        return "Lorry{" +
                "Грузоподъемность = " + load_capacity + '\'' +
                "Тип мотора = " + engine + '\'' +
                "Производитель = " + car_manufacturer + '\'' +
                "Класс авто = " + class_car+ '\'' +
                '}';
    }
}
