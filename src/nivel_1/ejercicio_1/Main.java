package nivel_1.ejercicio_1;


import nivel_1.ejercicio_1.modulos.Month;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;


public class Main {
    public static void main(String[] args) {

        Month august = new Month("August");
        Month.getMonths().add(7, august);

        Month.printListOfMonths();

        Month.addMonthByPosition(7);

        HashSet<Month> setMonths = new HashSet<>(Month.getMonths());

        Iterator<Month> it = setMonths.iterator();
        while (it.hasNext()) {
            System.out.println(it.next().getName());
        }

    }
}