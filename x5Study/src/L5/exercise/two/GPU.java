package L5.exercise.two;

public class GPU {
    private String manufacturer, memoryType, size, memory;
    private boolean cooling;  // If true to active, false passive

    public GPU(String manufacturer, String memoryType, String size, String memory, boolean cooling) {
        this.manufacturer = manufacturer;
        this.memoryType = memoryType;
        this.size = size;
        this.memory = memory;
        this.cooling = cooling;
    }
}
