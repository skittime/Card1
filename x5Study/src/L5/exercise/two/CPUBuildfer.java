package L5.exercise.two;

public class CPUBuildfer {
    private String clockFrequency, numberOfCores, cache, name, manufacturer;

    public CPUBuildfer clockFrequency(String clockFrequency) {
        this.clockFrequency = clockFrequency;
        return this;
    }

    public CPUBuildfer numberOfCores(String numberOfCores) {
        this.numberOfCores = numberOfCores;
        return this;
    }

    public CPUBuildfer withName(String name) {
        this.name = name;
        return this;
    }

    public CPUBuildfer cache(String cache) {
        this.cache = cache;
        return this;
    }

    public CPUBuildfer manufacturer(String manufacturer) {

        this.manufacturer = manufacturer;
        return this;
    }

    public CPU build() {
        return new CPU(clockFrequency,numberOfCores,cache,name,manufacturer);
    }
}
