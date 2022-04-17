package org.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class StringsTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldReverseString() {
        String original = "hello";
        String expected = "olleh";

        Strings strings = new Strings();

        String actual = strings.reverse(original);

        assertEquals(expected, actual);
    }
}
