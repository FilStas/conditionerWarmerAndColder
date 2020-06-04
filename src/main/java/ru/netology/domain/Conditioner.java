package ru.netology.domain;

public class Conditioner {
    private String name;
    private int maxTemperature = 30;
    private int minTemperature = 16;
    private int currentTemperature;
    private boolean on;

    public void setCurrentTemperature(int currentTemperature) {
        if (currentTemperature > maxTemperature) {
            return;
        }
        if (currentTemperature < minTemperature) {
            return;
        }
        this.currentTemperature = currentTemperature;
    }

    public void increaseCurrentTemperature() {
        if (currentTemperature == maxTemperature) {
            return;
        }
        currentTemperature++;
    }

    public void decreaseCurrentTemperature() {
        if (currentTemperature == minTemperature) {
            return;
        }
        currentTemperature--;
    }

    public int getCurrentTemperature() {
        return currentTemperature;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }


}
