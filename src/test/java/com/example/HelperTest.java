package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelperTest {

    Helper helper;

    @BeforeEach
    void setUp() {
        helper = new Helper();
    }

    @Test
    void checkUserInput() {
        String command = "mmrmpmrrrmp";

        assertTrue(helper.checkUserInput(command));
    }
}
