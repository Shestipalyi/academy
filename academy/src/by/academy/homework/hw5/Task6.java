package by.academy.homework.hw5;

import java.util.Random;

public class Task6 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] ar = new int[8];
        try {
            for (int i = 0; i < 10; i++) {
                ar[i] = rand.nextInt();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array is to small, expand the array");
        }
    }
}
