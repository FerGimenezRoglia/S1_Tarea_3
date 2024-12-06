package nivel_1.ejercicio_2;


import java.util.ArrayList;
import java.util.ListIterator;

public class ListProgram {

    public static void runProgram() {

        ArrayList<Integer> originalList = new ArrayList<>();

        fill_List(originalList);

        reversedList(originalList);

    }

    public static void fill_List(ArrayList<Integer> originalList) {

        originalList.add(3);
        originalList.add(4);
        originalList.add(5);
        originalList.add(6);
        originalList.add(7);
        originalList.add(8);
        originalList.add(9);
        originalList.add(10);

        for (Integer number : originalList) {
            System.out.println(number);
        }
        System.out.println("");

    }

    public static void reversedList(ArrayList<Integer> originalList) {

        ArrayList<Integer> reversedList = new ArrayList<>();

        ListIterator<Integer> it = originalList.listIterator(originalList.size());
        while (it.hasPrevious()) {
            int number = it.previous();
            reversedList.add(number);
            System.out.println(number);
        }


    }

}
