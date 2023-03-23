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

        Employee john= new Employee(123,"John",55,1500);

        Employee karl=new Employee(456,"Michael",20,1250);

        Employee andrew=new Employee(321,"Michaella",20,2500);

        Employee maria=new Employee(654,"Maria",20,1500);


        List<Employee>employee= Arrays.asList(john,karl,andrew,maria);
        Collections.sort(employee);
        System.out.println("Sorting by IDE :");
        System.out.println(employee);
        System.out.println("____________________________________________________________________________");

        for (Employee employee1:employee){
            Collections.sort(employee,new NameComparator());
        }
        System.out.println("Sorting by name: ");
        System.out.println(employee);
        System.out.println("_____________________________________________________________________________");

        for (Employee employee4:employee){
            Collections.sort(employee,new ageComparator());
        }System.out.println("Sorting by age: ");
        System.out.println(employee);
        System.out.println("_____________________________________________________________________________");

        for (Employee employee1:employee){
            Collections.sort(employee,new AgeAndThenNameComparator());
        }
        System.out.println("Sorting by age and name: ");
        System.out.println(employee);





    }
    /*
Sorting by IDE :
[ IDE123 John, age= 55, $1500,  IDE321 Michaella, age= 20, $2500,  IDE456 Michael, age= 20, $1250,  IDE654 Maria, age= 20, $1500]
____________________________________________________________________________
Sorting by name:
[ IDE123 John, age= 55, $1500,  IDE654 Maria, age= 20, $1500,  IDE456 Michael, age= 20, $1250,  IDE321 Michaella, age= 20, $2500]
_____________________________________________________________________________
Sorting by age:
[ IDE654 Maria, age= 20, $1500,  IDE456 Michael, age= 20, $1250,  IDE321 Michaella, age= 20, $2500,  IDE123 John, age= 55, $1500]
_____________________________________________________________________________
Sorting by age and name:
[ IDE654 Maria, age= 20, $1500,  IDE456 Michael, age= 20, $1250,  IDE321 Michaella, age= 20, $2500,  IDE123 John, age= 55, $1500]

     */




}

