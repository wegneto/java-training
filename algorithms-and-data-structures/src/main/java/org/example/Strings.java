package org.example;

import java.util.Arrays;

public class Strings {

    public String reverse(String original) {
        String reverse = "";
        for (int i = 0; i < original.length(); i++) {
            reverse = original.charAt(i) + reverse;
        }

        return reverse;
    }

    public boolean isPalindrome(String str) {
        String reverse = this.reverse(str);

        if (str.equals(reverse)) {
            return true;
        } else {
            return false;
        }
    }

    public int countOccurrences(String str, char value) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == value) {
                count++;
            }
        }

        return count;
    }

    public boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        } else {
            char[] anagram1 = str1.toCharArray();
            char[] anagram2 = str2.toCharArray();

            Arrays.sort(anagram1);
            Arrays.sort(anagram2);

            return Arrays.equals(anagram1, anagram2);
        }
    }
}
