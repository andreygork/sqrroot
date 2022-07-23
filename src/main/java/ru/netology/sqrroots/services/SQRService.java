package ru.netology.sqrroots.services;

public class SQRService {
        public int calculateSQR(int min, int max) {
            int counter = 0;
            int x = 99;
            for (int i = 10; i <= x; i++) {
                if (i * i >= min) {
                    if (i * i <= max) {
                        counter = counter + 1;
                    }
                }
            }
            return counter;
        }
    }
