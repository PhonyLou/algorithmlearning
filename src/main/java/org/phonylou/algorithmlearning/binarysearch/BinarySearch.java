package org.phonylou.algorithmlearning.binarysearch;

import java.util.ArrayList;

public class BinarySearch {
    private static int doSearch(Integer[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        while (low < high) {
            int mid = ((high - low) / 2) + low;
            if (key == arr[mid]) {
                return mid;
            }
            if (key < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            arrayList.add(i);
        }
        Integer[] source = new Integer[arrayList.size()];
        source = arrayList.toArray(source);

        System.out.println(doSearch(source, 17));
        System.out.println(doSearch(source, 7));
        System.out.println(doSearch(source, 3));
    }
}
