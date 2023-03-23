package l46_23_03_22_HW;

import java.util.Comparator;

public class ageComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}
