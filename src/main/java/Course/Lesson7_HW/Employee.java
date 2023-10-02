package Course.Lesson7_HW;

public class Employee {

    protected int id;
    public String surname;
    int age;
    private double salary;
    String department;

    public Employee(int idOne, String surnameOne, int ageOne, double salaryOne, String departmentOne) {
        id = idOne;
        surname = surnameOne;
        age = ageOne;
        salary = salaryOne;
        department = departmentOne;
    }

    Employee(int idSecond, String surnameSecond, int ageSecond, double salarySecond) {
        id = idSecond;
        surname = surnameSecond;
        age = ageSecond;
        salary = salarySecond;
    }

    private Employee(int idThird, String surnameThird, int ageThird) {
        id = idThird;
        surname = surnameThird;
        age = ageThird;
    }

//    double DobleSalary() {
//        salary *= 2;
//        return salary;   }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void showId(int id) {
        System.out.println("Empoyee id = " + id);
    }

    public void showSurname(String surname) {
        System.out.println("Empoyee surname = " + surname);
    }


    public void showSalary(double salary) {
        System.out.println("Empoyee salary = " + salary);
    }

}


class EmployeeTest {

     static double DobleSalary(Double salary) {
        salary *= 2;
        return salary;
    }

    public static void main(String[] args) {
        Employee KseniiaEm = new Employee(111, "Smyshliaeva", 27, 300, "Chemistry");


        KseniiaEm.showId(KseniiaEm.id);
        KseniiaEm.showSurname(KseniiaEm.surname);

        Employee LenaEm = new Employee(112, "Nedopekina", 28, 100);
        LenaEm.showId(LenaEm.id);
        LenaEm.showSurname(LenaEm.surname);

        System.out.println(DobleSalary(LenaEm.getSalary()));
    }
}






