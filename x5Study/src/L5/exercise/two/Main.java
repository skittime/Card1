package L5.exercise.two;

public class Main {
    public static void main(String[] args) {
        CPUBuildfer cpuBuildfer = new CPUBuildfer();
        cpuBuildfer .numberOfCores("Intel")
                .clockFrequency("kjhjk")
                .withName("OOO")
                .clockFrequency("jkkj");
        CPU cpu = cpuBuildfer.build();
        System.out.println(cpu.toString());

    }
}
