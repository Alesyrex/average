package com.epam.rd.autotasks;

import java.util.Scanner;

public class Average {

    public static void main(String[] args) {
        int average;
        average = calculationAverage();
        printAverage(average);
    }

    public static int calculationAverage() {
        int average;
        int sum = 0;
        int count = 0;
        int temp;

        try (Scanner scanner = new Scanner(System.in)) {
            do {
                temp = scanner.nextInt();
                sum += temp;
                ++count;
            } while (temp != 0);
        }
        if (count != 1) {
            average = sum / (count - 1);
        } else {
            average = 0;
        }
        return average;
    }

    public static void printAverage(int average) {
        System.out.println(average);
    }
}
