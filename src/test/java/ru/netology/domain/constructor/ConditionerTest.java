package ru.netology.domain.constructor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConditionerTest {

    @Test
    public void shouldUseConstructor() {
        Conditioner conditioner = new Conditioner(1,
                "Holod3000",
                32,
                16,
                32,
                true);

        Conditioner conditioner1 = new Conditioner();

        Conditioner conditioner2 = new Conditioner(19, true);

        assertEquals(32, conditioner.getMaxTemperature());
    }
}
