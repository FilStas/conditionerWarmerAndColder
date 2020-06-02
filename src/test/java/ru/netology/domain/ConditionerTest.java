package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConditionerTest {

    @Test
    void shouldIncreaseCurrentTemperatureToMax() {
        Conditioner conditioner = new Conditioner();

        conditioner.setCurrentTemperature(30);
        conditioner.increaseCurrentTemperature();

        assertEquals(30, conditioner.getCurrentTemperature());
    }

    @Test
    void shouldDecreaseCurrentTemperatureToMin() {
        Conditioner conditioner = new Conditioner();

        conditioner.setCurrentTemperature(16);
        conditioner.decreaseCurrentTemperature();

        assertEquals(16, conditioner.getCurrentTemperature());
    }

    @Test
    void shouldIncreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();

        conditioner.setCurrentTemperature(16);
        conditioner.increaseCurrentTemperature();

        assertEquals(17, conditioner.getCurrentTemperature());

    }

    @Test
    void shouldDecreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();

        conditioner.setCurrentTemperature(30);
        conditioner.decreaseCurrentTemperature();

        assertEquals(29, conditioner.getCurrentTemperature());
    }


    @Test
    void shouldMaxCurrentTemperature() {
        Conditioner conditioner = new Conditioner();

        conditioner.setCurrentTemperature(31);

        assertEquals(22, conditioner.getCurrentTemperature());
    }

    @Test
    void shouldMinCurrentTemperature() {
        Conditioner conditioner = new Conditioner();

        conditioner.setCurrentTemperature(15);

        assertEquals(22, conditioner.getCurrentTemperature());
    }
}


