package java102.patikaStore.products;

import java102.patikaStore.brands.Brand;

public class Smartphone extends Product {
    private int memory;
    private double screenSize;
    private int batteryPower;
    private int ram;
    private String color;

    public Smartphone(int id, double price, double discount, int stock, String name, Brand brand, int memory,
            double screenSize, int batteryPower, int ram, String color) {
        super(id, price, discount, stock, name, brand);
        this.memory = memory;
        this.screenSize = screenSize;
        this.batteryPower = batteryPower;
        this.ram = ram;
        this.color = color;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public int getBatteryPower() {
        return batteryPower;
    }

    public void setBatteryPower(int batteryPower) {
        this.batteryPower = batteryPower;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
