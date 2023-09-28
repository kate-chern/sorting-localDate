package sorting.dates;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<LocalDate> list = new ArrayList<>();
        list.add(LocalDate.parse("2004-07-01"));
        list.add(LocalDate.parse("2005-01-02"));
        list.add(LocalDate.parse("2007-01-01"));
        list.add(LocalDate.parse("2032-05-03"));

       ComparisonProvider comparisonProvider = new ComparisonProvider();
        System.out.println(comparisonProvider.sortDates(list));

    }
}