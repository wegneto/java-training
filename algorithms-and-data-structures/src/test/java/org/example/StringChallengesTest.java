package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringChallengesTest {

    @Test
    public void shouldReverseString() {
        String original = "hello";
        String expected = "olleh";

        StringChallenges stringChallenges = new StringChallenges();

        String actual = stringChallenges.reverse(original);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnPalindromeIsTrue() {
        String str = "tattarrattat";

        StringChallenges stringChallenges = new StringChallenges();

        assertTrue(stringChallenges.isPalindrome(str));
    }

    @Test
    public void shouldReturnPalindromeIsFalse() {
        String str = "hello";

        StringChallenges stringChallenges = new StringChallenges();

        assertFalse(stringChallenges.isPalindrome(str));
    }

    @Test
    public void shouldReturnZeroOccurrences() {
        String str = "hello";
        char value = 'a';

        int actual = new StringChallenges().countOccurrences(str, value);

        assertEquals(0, actual);
    }

    @Test
    public void shouldReturnTwoOccurrences() {
        String str = "hello";
        char value = 'l';

        int actual = new StringChallenges().countOccurrences(str, value);

        assertEquals(2, actual);
    }

    @Test
    public void shouldReturnAnagramIsFalse() {
        String str1 = "hello";
        String str2 = "world";

        assertFalse(new StringChallenges().isAnagram(str1, str2));
    }

    @Test
    public void shouldReturnAnagramIsTrue() {
        String str1 = "restful";
        String str2 = "fluster";

        assertTrue(new StringChallenges().isAnagram(str1, str2));
    }

}
