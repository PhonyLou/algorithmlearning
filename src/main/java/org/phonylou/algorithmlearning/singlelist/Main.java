package org.phonylou.algorithmlearning.singlelist;

public class Main {
    public static void main(String[] args) {
        String s1 = new String("1");
        String s2 = "1";
        System.out.println(s1 == s2);
        s1.intern();
        System.out.println(s1 == s2);

        String s3 = new String("1") + new String("1");
        s3.intern();
        String s4 = "11";
        System.out.println(s3 == s4);

        StringBuffer sBuffer = new StringBuffer("abc");
        sBuffer.append("fdf");
    }
}
