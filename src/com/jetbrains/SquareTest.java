package com.jetbrains;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void getArea() {
        var square = new Square(7);
        assertEquals(49, square.GetArea());
    }
}