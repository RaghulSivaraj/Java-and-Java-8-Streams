package com.company;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Intstream
        List <Integer> values = Arrays.asList(4,5,6,7,8,9);
        System.out.println("printing the values of List ");
        //Enhanced for
        for (Integer value : values) {
            System.out.println(value);
        }
        // Normal for loop 
        // for(int i=0; i< values.size(); i++)
        //        {
        //            System.out.println(values.get(i));
        //        }
        // Using streams
        // values.stream().forEach(System.out::println);
        System.out.println("Printing values of list using anonymous(lambda expressions) :- ");
        values.forEach(System.out::println);
        //values.forEach(n -> System.out.println(n));
        System.out.println("Intstream ");
        IntStream.range(1,10).forEach(System.out::println);
        System.out.println();
        //Intstream with skip
        System.out.println("Intstream with skip ");
        IntStream.range(1,10).skip(5).forEach((x -> System.out.println(x)));
        //Intstream with sum
        System.out.println("Intstream using sum ");
        System.out.println(IntStream.range(1,5).sum());
        //Stream of, sorted, find First
        System.out.println("Stream of , sorted,  find first ");
        Stream.of("Raghul", "Pradhosh", "Prem").sorted().findFirst().ifPresent(System.out::println);
        // Stream from array,filter,print
        System.out.println("Stream from array , sort, filter, print ");
        String[] names = {"Raghul", "PremKumar", "PraveenKumar", "Pradhosh", "Jeeva", "Muthu", "Balaji"};
        Arrays.stream(names).filter(x -> x.startsWith("P")).sorted().forEach(System.out::println);
        // average of squares of an int array
        System.out.println("Average of squares of an array ");
        Arrays.stream(new int[] {2,4,6,8,10}).map(x -> x*x).average().ifPresent(System.out::println);
        //Stream from list,filter and print
        System.out.println("Streams form list, print ");
        List<String> people = Arrays.asList("raghul S", "terzocloud");
        people.stream().map(String::toUpperCase).forEach(System.out::println);
        //Reduction -Sum
        System.out.println("Reduction - sum ");
        double total= Stream.of(7.1,5.3,4.8).reduce(0.0,(Double a,Double b) -> a+b);
        System.out.println("Total "+ total);
        //Summary Statistics
        System.out.println("Summary statistics ");
        IntSummaryStatistics summary = IntStream.of(7,12,19,88,73,4,10).summaryStatistics();
        System.out.println(summary);
        Random random = new Random();
        random.ints().limit(10).sorted().forEach(System.out::println);
        List<String>strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        List<String> filtered=  strings.stream().filter( x -> !x.isEmpty()).collect(Collectors.toList());
        System.out.println("Filtered list without empyty " + filtered);
        String merged= strings.stream().filter(x -> !x.isEmpty()).collect(Collectors.joining(" , "));
        System.out.println("Merged string is " + merged);
    }
}
