package com.epam.rd.autotasks;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        final int lengthOfArray = 100;
        Scanner scanner = new Scanner(System.in);
        int[] arrayForAverage = new int[lengthOfArray];

        int average;
        int sum = 0;
        int count = 0;

        while (count < arrayForAverage.length) {
            arrayForAverage[count] = scanner.nextInt();
            if (arrayForAverage[count] == 0) {
                break;
            }
            sum += arrayForAverage[count];
            ++count;
        }

        if (count != 0) {
            average = sum / count;
            System.out.println(average);
        } else {
            System.out.println("0");
        }
    }
}
