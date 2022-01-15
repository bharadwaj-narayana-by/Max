package com.by.bharadwaj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MaxResult<T extends Comparable> {

    public static void main(String[] args) {
        //Integer tests
        List<Integer> integers = Arrays.asList(20,50,30);
        printMax(integers);


        //Float tests
        List<Double> doubles = Arrays.asList(10.2,10.6,10.1);
        printMax(doubles);

        List<String> strings = Arrays.asList("APPLE","BANANA","ORANGE");
        printMax(strings);
    }


    public static <T extends Comparable> T testMaximum(List<T> objs) {
        return objs.stream().sorted().collect(Collectors.toList()).get(objs.size()-1);
    }

    public static <T extends Comparable> void printMax(List<T> objs) {
        System.out.println(testMaximum(objs));
    }

}
