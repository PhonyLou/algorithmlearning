package org.phonylou.algorithmlearning.palindrome;

public class AppTest {
    public static void main(String[] args) {
        String case1 = "abccba";
        String case2 = "abc1cba";
        String case3 = "ab";
        String case4 = "";
        String case5 = null;
        String case6 = "fadskjafd;sa";

        System.out.println(isPalindrome(case1));
        System.out.println(isPalindrome(case2));
        System.out.println(isPalindrome(case3));
        System.out.println(isPalindrome(case4));
        System.out.println(isPalindrome(case5));
        System.out.println(isPalindrome(case6));
    }

    public static boolean isPalindrome(String str) {
        if (str == null || str.length() < 2) {
            return true;
        }
        int low = 0;
        int high = str.length() - 1;

        while (low <= high) {
            if (str.charAt(low) != str.charAt(high)) {
                return false;
            }
            low ++;
            high --;
        }
        return true;
    }
}
