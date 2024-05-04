package org.example.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapDemo {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("5.6", "7.4", "4",
                "1", "2.3");
        list.stream().flatMap(num -> Stream.of(num)).
                forEach(System.out::println);
    }
}
