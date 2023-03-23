package l46_23_03_22_HW;

public class Employee implements Comparable<Employee>{
    int id;
    String name;
    int age;
    int salary;


    public Employee(int id,String name,int age,int salary){
        this.name=name;
        this.id=id;
        this.age=age;
        this.salary=salary;
    }




    @Override
    public String toString() {
        return " IDE"+id +" "+ name + ", age= " + age + ", $" + salary;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    public int compareTo(Employee e) {
        return Integer.compare(this.id,e.getId());
    }
}
