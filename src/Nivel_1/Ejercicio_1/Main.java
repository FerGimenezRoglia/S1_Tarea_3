package Nivel_1.Ejercicio_1;

import Nivel_1.Ejercicio_1.Modulos.Month;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        ArrayList<Month> months = new ArrayList<>();
        enterMonths(months);

        Month agust = new Month("Agust");
        months.add(7, agust);

        for (Month month : months)
            System.out.println(month.getName());
        System.out.println("");

        // I introduce the Object agust to verify that duplicates are not allowed.
        months.add(agust);

        // I convert the ArrayList to HashSet.
        HashSet<Month> setMonths = new HashSet<>(months);

        // We iterate through the HashSet to ensure there are no duplicates.
        for (Month month : setMonths) {
            System.out.println(month.getName());
        }
        System.out.println("");

        // See the list through an itarator.
        Iterator<Month> it = setMonths.iterator();
        while (it.hasNext()) {
            System.out.println(it.next().getName());
        }
    }

    public static void enterMonths(ArrayList<Month> months) {

        months.add(new Month("January"));
        months.add(new Month("February"));
        months.add(new Month("March"));
        months.add(new Month("April"));
        months.add(new Month("May"));
        months.add(new Month("June"));
        months.add(new Month("July"));

        months.add(new Month("September"));
        months.add(new Month("October"));
        months.add(new Month("November"));
        months.add(new Month("December"));

    }
}