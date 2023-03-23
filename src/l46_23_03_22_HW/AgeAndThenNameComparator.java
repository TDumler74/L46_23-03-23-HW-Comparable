package l46_23_03_22_HW;

import java.util.Collection;
import java.util.Comparator;

public class AgeAndThenNameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        String name= e1.getName();
        String name1=e2.getName();
        if(e1.getAge()==e2.getAge())
            return e1.getName().compareTo(e2.getName());
        return e1.getAge()- e2.getAge();
    }
}
