package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LambdaTask1 {
    public static void main(String[] args) {

        class Person {
            String name;
            int age;
            String city;

            public Person(String name, int age, String city) {
                this.name = name;
                this.age = age;
                this.city = city;
            }

            @Override
            public String toString() {
                return name + " (" + age + ") from " + city;
            }
        }


        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 25, "New York"));
        people.add(new Person("Bob", 30, "Los Angeles"));
        people.add(new Person("Charlie", 22, "New York"));
        people.add(new Person("David", 35, "Chicago"));
        people.add(new Person("Eve", 28, "New York"));


        people.sort(Comparator.comparingInt(person -> person.age));
        System.out.println("Sorted by age:");
        people.forEach(System.out::println);


        people.removeIf(person -> !person.city.equals("New York"));
        System.out.println("\nFiltered by city (New York):");
        people.forEach(System.out::println);
    }
}
