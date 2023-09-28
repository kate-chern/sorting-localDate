package sorting.dates;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class ComparisonProvider {
    public Collection<LocalDate> sortDates(List<LocalDate> unsortedDates) {
        List<LocalDate> collectAscendingOrder = unsortedDates.stream()
                .filter(localDate -> localDate.getMonthValue() <= 4 || localDate.getMonthValue() >= 9)
                .sorted(Comparator.comparing(LocalDate::getYear))
                .toList();

        List<LocalDate> collectDescendingOrder = unsortedDates.stream()
                .filter(localDate -> localDate.getMonthValue() >= 5 && localDate.getMonthValue() <= 8)
                .sorted(Comparator.comparing(LocalDate::getYear)
                        .reversed())
                .toList();

        List<LocalDate> newList = new ArrayList<>(collectAscendingOrder);
        newList.addAll(collectDescendingOrder);
        return newList;
    }
}
