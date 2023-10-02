package Course.Lesson5.HW;

public class Employee {

    int id;
    String surname;
    int age;
    double salary;
    String department;

    Employee(String surname) {
        this.surname = surname;
    }

    Employee(int id, String surname, int age, double salary, String department) {
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }



    double DobleSalary() {
        salary *= 2;
        return salary;

   }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}


class EmployeeTest {

    public static void main(String[] args) {
        Employee OneEm;
        OneEm = new Employee(111, "Smyshliaeva", 27,300, "Chemistry");

        System.out.println(OneEm.DobleSalary());

        Employee Ksyusha = new Employee("koshechka");
        System.out.println(Ksyusha);

    }
}






