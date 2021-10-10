package lesson4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class LargestNumbers {

    public static void main(String[] args) {
        int[] a = {1, 3, 2, -2, -4, -9};
        System.out.println(thirdMax(a));

        int[] b = {1, 8};
        System.out.println(thirdMax(b));

        int[] c = {8, 8, 8, 15, 1555, -15, 236, 236, 18};
        System.out.println(thirdMax(c));

        int[] d = {0, -18, 22, 22, -22, 1587, 17};
        System.out.println(thirdMax(d));

        int[] e = {14, 14};
        System.out.println(thirdMax(e));

        int[] f = {10};
        System.out.println(thirdMax(f));

        int[] g = {-10, -17, 0, -158, 2};
        System.out.println(thirdMax(g));

        int[] h = {588888888, 5252, -555555555, -555555555, 0, 156};
        System.out.println(thirdMax(h));

        int[] i = {18, 18, 18, 18, 20};
        System.out.println(thirdMax(i));

        int[] j = {0};
        System.out.println(thirdMax(j));


    }

    public static int thirdMax(int[] nums) {
        TreeSet<Integer> result = new TreeSet();
        for (int num : nums) {
            result.add(num);
        }
        if (result.size() >= 3) {
            result.pollLast();
            result.pollLast();
        }
        return result.last();
    }
}
