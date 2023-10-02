package Course.Lesson7_HW.SozdanieNovoyPapki;


import Course.Lesson7_HW.Employee;

public class EmployeeProverkaDostupa {
    public static void main(String[] args) {
        Employee KseniiaEm = new Employee(101, "Smy", 27, 300, "Chemistry");


//        KseniiaEm.showId(KseniiaEm.id);
        KseniiaEm.showSurname(KseniiaEm.surname);
    }}
