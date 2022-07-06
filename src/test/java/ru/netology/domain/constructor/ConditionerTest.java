package ru.netology.domain.constructor;

import org.junit.jupiter.api.Test;

public class ConditionerTest {

    @Test
    public void shouldUseConstructor() {
        Conditioner conditioner = new Conditioner(1,
                "Holod3000",
                32,
                16,
                28,
                true);
    }
}
