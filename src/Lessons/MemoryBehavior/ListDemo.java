package Lessons.MemoryBehavior;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class ListDemo {
    void main(){
        // Declaring
        List<String> list = new ArrayList<>();

        list.add("Nelson"); // add element
        list.add("Maria");
        list.add("Levi");
        list.add("Amélie");

        // adding using overloading
        list.add(3, "Anélie");

        for(String names : list){
            System.out.println(names);
        }

        System.out.println("\n");

        // Size of the list
        System.out.println(list.size());

        // Remove elements
        list.remove("Anélie");

        for(String names : list){
            System.out.println(names);
        }

        System.out.println("\n");

        // predicate
        list.removeIf(x -> x.charAt(0) == 'N'); // Removing all elements whose names start with the letter 'N'

        for(String names : list){
            System.out.println(names);
        }

        // IndexOf (Finding an element by its position.)
        System.out.println("Index of Maria: " + list.indexOf("Maria"));

        // Whe not found (-1)
        System.out.println("Index of Lucas: " + list.indexOf("Lucas"));

        // List containing only the names that start with the letter "A"
        List<String> listLetterA = list.stream().filter(x -> x.charAt(0) == 'A').toList();

        for(String names : listLetterA){
            System.out.println(names);
        }

        list.add("Ana");
        list.add("Anel");
        list.add("Anastacia");

        // The first element in the stream whose name starts with the letter "A"
        String firstNameWithLetterA = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(firstNameWithLetterA);

        // null
        firstNameWithLetterA = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        System.out.print(firstNameWithLetterA);
    }
}
