package ru.netology.domain;

public class Conditioner {
    private String name;
    private int maxTemperature = 30;
    private int minTemperature = 16;
    private int currentTemperature = 22;
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


}
