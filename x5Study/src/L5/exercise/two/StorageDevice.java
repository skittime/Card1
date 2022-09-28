package L5.exercise.two;

import javax.swing.*;

public class StorageDevice {
    private String manufacturer, amountOfMemory;
    private boolean typeOfDrive; // If true to a HDD, false is a SSD
    private double formFactor;

    public StorageDevice(String manufacturer, String amountOfMemory, boolean typeOfDrive, double formFactor) {
        this.manufacturer = manufacturer;
        this.amountOfMemory = amountOfMemory;
        this.typeOfDrive = typeOfDrive;
        this.formFactor = formFactor;
    }
}
