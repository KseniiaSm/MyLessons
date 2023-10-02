package Course.Lesson4;

public class Student {
    int studentIDNumber;
    String name;
    String surname;
    int yearStudy;
    double math;
    double economic;
    double foreignLanguage;

}

class StudentTest {
    public static void main(String[] args) {
        Student One = new Student();
        One.studentIDNumber = 001;
        One.name = "Kseniia";
        One.surname = "Smy";
        One.yearStudy = 1;
        One.math = 5;
        One.economic = 3;
        One.foreignLanguage = 2;
        double AverageMarkOne = (One.math + One.economic + One.foreignLanguage) / 3;
        System.out.println("Kseniia " + AverageMarkOne);

        Student Second = new Student();
        Second.studentIDNumber = 002;
        Second.name = "Tatiana";
        Second.surname = "Volkova";
        Second.yearStudy = 5;
        Second.math = 4;
        Second.economic = 5;
        Second.foreignLanguage = 3;
        double AverageMarkSecond = (Second.math + Second.economic + Second.foreignLanguage) / 3;
        System.out.println("Tatiana " + AverageMarkSecond);


        Student Third = new Student();
        Third.studentIDNumber = 003;
        Third.name = "Nastya";
        Third.surname = "Ivanova";
        Third.yearStudy = 2;
        Third.math = 5;
        Third.economic = 5;
        Third.foreignLanguage = 4;
        double AverageMarkThird = (Third.math + Third.economic + Third.foreignLanguage) / 3;
        System.out.println(Third.name + " "+ AverageMarkThird);

    }



}
