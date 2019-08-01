package org.phonylou.algorithmlearning.singlelist;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        Set<Integer> intSet = new TreeSet<>();
        ArrayList<Integer> intArr = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int result = r.nextInt(100);
            System.out.println(result);
            intSet.add(result);
            intArr.add(result);
        }

        System.out.println(intSet);
        System.out.println(intArr);
        Collections.sort(intArr);
        System.out.println(intArr);

    }
}
