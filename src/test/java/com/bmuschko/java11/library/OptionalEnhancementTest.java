package com.bmuschko.java11.library;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class OptionalEnhancementTest {
    @Test
    void canCheckOptionalForEmpty() {
        // Verify that opt is empty without using the "!" operator.
        Optional<String> opt = Optional.empty();
        //assertTrue(opt);
    }
}
