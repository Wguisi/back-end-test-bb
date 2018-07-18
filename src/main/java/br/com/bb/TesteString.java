package br.com.bb;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TesteString {

    public static void main(String[] args) {

        // abcde abcede aebecedee eeaaaa

        List<String> lines = Arrays.asList("abcde", "abcede", "aebecedee", "eeaaaa");

        List<String> result = lines.stream()                // convert list to stream
                .filter(line -> !"mkyong".equals(line))     // we dont like mkyong
                .collect(Collectors.toList());              // collect the output and convert streams to a List

        result.forEach(System.out::println);                //output : spring, node
    }

}
