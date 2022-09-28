package L5.exercise.two;

public class CPU {
    private String clockFrequency,numberOfCores,cache, name, manufacturer;

    public CPU(String clockFrequency, String numberOfCores, String cache, String name, String manufacturer) {
        this.clockFrequency = clockFrequency;
        this.numberOfCores = numberOfCores;
        this.cache = cache;
        this.name = name;
        this.manufacturer = manufacturer;
    }
}
