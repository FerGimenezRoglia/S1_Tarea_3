package nivel_1.ejercicio_1.modulos;

import java.util.ArrayList;
import java.util.Objects;

public class Month {

    private String name;
    private static ArrayList<Month> months = new ArrayList<>();

    public Month(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public static ArrayList<Month> getMonths() {
        if (months.isEmpty()) {

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
        return months;
    }

    public static void addMonthByPosition(int positionMonth) {
        if (positionMonth >= 1 && positionMonth <= 12) {
            String[] monthNames = {"January", "February", "March", "April", "May", "June",
                    "July", "August", "September", "October", "November", "December"};
            months.add(positionMonth - 1, new Month(monthNames[positionMonth - 1]));
        } else {
            System.out.println("Invalid month position: " + positionMonth);
        }
    }

    public static void printListOfMonths() {
        if (months.isEmpty()) {
            System.out.println("Cannot display months, list is empty");
        } else {
            for (Month month : months) {
                System.out.println(month.toString());
            }
            System.out.println("");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Month month = (Month) o;
        return Objects.equals(name, month.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Month: '" + name + '\'';
    }
}