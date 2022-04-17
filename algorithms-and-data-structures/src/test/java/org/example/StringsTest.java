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
}
