package com.jetbrains;

import java.util.Scanner;

import static com.jetbrains.getBMI.reportResults;
import static org.junit.jupiter.api.Assertions.*;

class getBMITest {

    @org.junit.jupiter.api.Test
    void getBMI() {
        var bmi = getBMI.BMIFor(200, 100);
        assertEquals(25, bmi);
    }

    @org.junit.jupiter.api.Test
    void reportStatusUnderweight() {
        var status = getBMI.reportStatus(5);
        assertEquals("Underweight", status);
    }

    @org.junit.jupiter.api.Test
    void reportStatusNormalweight() {
        var status = getBMI.reportStatus(23);
        assertEquals("Normal", status);
    }

    @org.junit.jupiter.api.Test
    void reportStatusOverweight() {
        var status = getBMI.reportStatus(26);
        assertEquals("Overweight", status);
    }

    @org.junit.jupiter.api.Test
    void reportStatusObese() {
        var status = getBMI.reportStatus(33);
        assertEquals("Obese", status);
    }

}