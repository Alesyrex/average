package com.epam.rd.autotasks;

import java.util.Scanner;

public class Average {
    
    public int calculationAverage() {
        int average = 0;
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
        }
        return average;
    }

    public void printAverage(int inAverage) {
        System.out.println(inAverage);
    }

    public static void main(String[] args) {
        int averageOfNumbers;
        Average average = new Average();
        averageOfNumbers = average.calculationAverage();
        average.printAverage(averageOfNumbers);
    }


}
