package org.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class ArrayChallengesTest {

    @Test
    public void shouldReverseArray() {
        int[] arr1 = {1, 2, 7, 6, 4, 9, 12};
        int[] expected = {12, 9, 4, 6, 7, 2, 1};

        Assert.assertTrue(Arrays.equals(expected, new ArrayChallenges().reverse(arr1)));
    }

    @Test
    public void shouldFindTheSecondLargestNumberInArray() {
        int[] arr = {1, 2, 7, 6, 4, 9, 12};

        Assert.assertEquals(9, new ArrayChallenges().findSecondHighest(arr));
    }

}
