package com.company;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Program2 {

    public static void main(String[] args) {
        // Convert all below for looping logics to streams
       
        List<Fruit> allFruits1 = testData1();
        List<Fruit> mangos = new LinkedList<>();
        /*for (Fruit fruit : allFruits1) {
            if ("Mango".equals(fruit.getName()))
                mangos.add(fruit);
        } */
        mangos = allFruits1.stream()
                .filter(f -> f.getName().equals("Mango"))
                .collect(Collectors.toList());
        check("1",mangos.size() == 5);

        // 2 (Hint: use mapping and aggregation)
        List<Fruit> allFruits2 = testData2();
        /* for (Fruit fruit : allFruits2)
            sum1 += fruit.getPrice(); */
       int sum1=allFruits2.stream().mapToInt(f -> f.getPrice()).sum();


        check("2",sum1 == 62);

        // 3 (Hint: You have to convert the list of list to list first)
        List<List<Fruit>> allFruits3 = testData3();
        int sum2=0;
        /* for (List<Fruit> fruits : allFruits3)
            for (Fruit fruit : fruits)
                sum2 += fruit.getPrice(); */
        List<Fruit> lst = allFruits3.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
        sum2=lst.stream().mapToInt(f -> f.getPrice()).sum();

        check("3",sum2 == 124);

        List<Fruit> allFruits4 = testData2();
        List<Box> boxes = allFruits4.stream().map(f -> new Box(f)).collect(Collectors.toList());

      /*  for(Fruit fruit:allFruits4)
            boxes.add(new Box(fruit));
      */
        check("4",boxes.size() == 7);

        // 5
        List<Fruit> allFruits5 = testData2();
        boolean isPlumsAvailable = allFruits5.stream().filter(f -> f.getName().equals("Plums")).collect(Collectors.toList()).size()>0?true:false;
      /*  for(Fruit fruit:allFruits5)
            if("Plums".equals(fruit.getName())){
                isPlumsAvailable=true;
                break;
            }

       */
        check("5",isPlumsAvailable);

        System.out.println("======> All test cases executed!! <======");
    }


    private static List<Fruit> testData1() {
        List<Fruit> fruits = new LinkedList<>();

        fruits.add(new Fruit("Mango"));
        fruits.add(new Fruit("Mango"));
        fruits.add(new Fruit("Mango"));
        fruits.add(new Fruit("Mango"));
        fruits.add(new Fruit("Plums"));
        fruits.add(new Fruit("Mango"));
        fruits.add(new Fruit("Orange"));
        return fruits;
    }

    private static List<Fruit> testData2() {
        List<Fruit> fruits = new LinkedList<>();

        fruits.add(new Fruit("Mango", 5));
        fruits.add(new Fruit("Liche", 10));
        fruits.add(new Fruit("Mango", 5));
        fruits.add(new Fruit("Apple", 20));
        fruits.add(new Fruit("Plums", 10));
        fruits.add(new Fruit("Mango", 5));
        fruits.add(new Fruit("Orange", 7));
        return fruits;
    }

    private static List<List<Fruit>> testData3() {
        List<List<Fruit>> fruits = new LinkedList<>();
        fruits.add(testData2());
        fruits.add(testData2());
        return fruits;
    }

    private static void check(String testNumber, Boolean condition){
        System.out.println("Test ("+testNumber+") - "+(condition? "OK": "Not OK"));
    }

}

class Fruit {
    private String name;
    private int price;

    public Fruit(String name) {
        this.name = name;
    }

    public Fruit(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}

class Box {
    Fruit fruit;

    public Box(Fruit fruit) {
        this.fruit = fruit;
    }

    public Fruit getFruit() {
        return fruit;
    }
}
