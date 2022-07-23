package ru.netology.sqrroots.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {
    SQRService sqrService = new SQRService();

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/counter.csv")
    public void calculateSQR(int min , int max , int expected) {
        int actual = sqrService.calculateSQR(min, max);
        assertEquals(expected, actual);
    }
}
