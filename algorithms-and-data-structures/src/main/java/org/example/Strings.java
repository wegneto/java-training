package org.example;

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
}
