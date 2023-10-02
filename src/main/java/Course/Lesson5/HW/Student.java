package Course.Lesson5.HW;

public class Student {
    int studentIDNumber;
    String name;
    String surname;
    int yearStudy;
    double math;
    double economic;
    double foreignLanguage;


    double SrZnach(double math, double economic, double foreignLanguage) {
        double SrArifm = (math + economic + foreignLanguage) / 3;
        return SrArifm;
    }
}

class studentHelper {
    static void getAvrGrade(Student anyStudent) {
        double srArifm = (anyStudent.math + anyStudent.economic + anyStudent.foreignLanguage) / 3;
        System.out.println(srArifm);
    }


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
        System.out.println(One.SrZnach(5,3,2));

        Student Second = new Student();
        Second.studentIDNumber = 002;
        Second.name = "Tatiana";
        Second.surname = "Volkova";
        Second.yearStudy = 5;
        Second.math = 4;
        Second.economic = 5;
        Second.foreignLanguage = 3;



        Student Third = new Student();
        Third.studentIDNumber = 003;
        Third.name = "Nastya";
        Third.surname = "Ivanova";
        Third.yearStudy = 2;
        Third.math = 5;
        Third.economic = 5;
        Third.foreignLanguage = 4;

        studentHelper.getAvrGrade(One);

    }



}
