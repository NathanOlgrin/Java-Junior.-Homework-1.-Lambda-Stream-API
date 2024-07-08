package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println("Среднее значение чётных чисел списка " + list1 + " равно " + list1.stream().filter(i -> i%2==0).mapToDouble(i -> i).average().orElse(Double.NaN));
    }
}