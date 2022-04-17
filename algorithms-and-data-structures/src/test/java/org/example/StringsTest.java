package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringsTest {

    @Test
    public void shouldReverseString() {
        String original = "hello";
        String expected = "olleh";

        Strings strings = new Strings();

        String actual = strings.reverse(original);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnPalindromeIsTrue() {
        String str = "tattarrattat";

        Strings strings = new Strings();

        assertTrue(strings.isPalindrome(str));
    }

    @Test
    public void shouldReturnPalindromeIsFalse() {
        String str = "hello";

        Strings strings = new Strings();

        assertFalse(strings.isPalindrome(str));
    }

    @Test
    public void shouldReturnZeroOccurrences() {
        String str = "hello";
        char value = 'a';

        int actual = new Strings().countOccurrences(str, value);

        assertEquals(0, actual);
    }

    @Test
    public void shouldReturnTwoOccurrences() {
        String str = "hello";
        char value = 'l';

        int actual = new Strings().countOccurrences(str, value);

        assertEquals(2, actual);
    }

    @Test
    public void shouldReturnAnagramIsFalse() {
        String str1 = "hello";
        String str2 = "world";

        assertFalse(new Strings().isAnagram(str1, str2));
    }

    @Test
    public void shouldReturnAnagramIsTrue() {
        String str1 = "restful";
        String str2 = "fluster";

        assertTrue(new Strings().isAnagram(str1, str2));
    }
}
