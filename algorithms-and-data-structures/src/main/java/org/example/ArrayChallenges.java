package org.example;

public class ArrayChallenges {

    public int[] reverse(int[] arr1) {
        for (int i = 0; i < arr1.length / 2; i++) {
            int tmp = arr1[i];
            arr1[i] = arr1[arr1.length - i - 1];
            arr1[arr1.length - i - 1] = tmp;
        }

        return arr1;
    }
}
