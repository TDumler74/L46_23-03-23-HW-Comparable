package l46_23_03_22_HW;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
Создать класс Employee c полями id, name, age, salary.
Сделать его Comparable по id
Создать дополнительные возможности сортировки по: salary, age, name а также по ageAndThenName,
т.е. если возраст одинаковый, то сортировать по имени.
Создать в классе Main список сотрудников и отсортировать его всеми этими способами
 */
public class Main {
    public static void main(String[] args) {



        Employee john= new Employee(123456,"John",55,1500);
        Employee karl=new Employee(456123,"Karl",21,1250);
        Employee andrew=new Employee(321456,"Andrew",55,2500);
        Employee maria=new Employee(234516,"Maria",25,1500);


        List<Employee>employee= Arrays.asList(john,karl,andrew,maria);
        Collections.sort(employee);
        System.out.println(employee);

        for (Employee employee1:employee){
            Collections.sort(employee,new NameComparator());

        }System.out.println(employee);

        for (Employee employee4:employee){
            Collections.sort(employee,new ageComparator());
        } System.out.println(employee);





    }
    /*
    [123456, name = John, age=55, salary = 1500, 234516, name = Maria, age=25, salary = 1500, 321456, name = Andrew, age=55, salary = 2500, 456123, name = Karl, age=21, salary = 1250]
    [321456, name = Andrew, age=55, salary = 2500, 123456, name = John, age=55, salary = 1500, 456123, name = Karl, age=21, salary = 1250, 234516, name = Maria, age=25, salary = 1500]
    [456123, name = Karl, age=21, salary = 1250, 234516, name = Maria, age=25, salary = 1500, 321456, name = Andrew, age=55, salary = 2500, 123456, name = John, age=55, salary = 1500]

     */




}

