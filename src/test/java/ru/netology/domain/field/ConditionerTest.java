package ru.netology.domain.field;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {

    @Test
    public void shouldInitFields() {
        Conditioner conditioner = new Conditioner();

        assertEquals(10, conditioner.getMinTemperature());
        //assertEquals(false, conditioner.isOn());
        assertFalse(conditioner.isOn());
        //assertTrue(conditioner.isOn());
    }

}