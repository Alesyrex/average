package com.epam.rd.autotasks;

import java.util.Scanner;

public class Average {
    
    private int averageOfNumbers;
    
    public void calculationAverage() {
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
        averageOfNumbers = (count != 1) ? (sum / (count - 1)) : 0;
    }

    public void printAverage() {
        System.out.println(averageOfNumbers);
    }

    public static void main(String[] args) {
        Average average = new Average();
        average.calculationAverage();
        average.printAverage();
    }


}
