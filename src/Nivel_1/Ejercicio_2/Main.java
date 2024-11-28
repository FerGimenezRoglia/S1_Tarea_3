package Nivel_1.Ejercicio_2;

import java.util.ArrayList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

        for (Integer number : numbers) {
            System.out.println(number);
        }
        System.out.println("\n-\n");

        ArrayList<Integer> numbers2 = new ArrayList<>();

        ListIterator<Integer> it = numbers.listIterator(numbers.size());
        while (it.hasPrevious()) {
            int number = it.previous();
            numbers2.add(number);
            System.out.println(number);
        }
    }
}
