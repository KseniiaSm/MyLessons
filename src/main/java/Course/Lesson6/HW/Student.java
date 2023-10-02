package Course.Lesson6.HW;

public class Student {
    int studentIDNumber;
    String name;
    String surname;
    int yearStudy;
    double math;
    double economic;
    double foreignLanguage;
    Student (int studentIDNumberKOne, String nameKOne, String surnameKOne, int yearStudyKOne, double mathKOne, double economicKOne, double foreignLanguageKOne) {
        studentIDNumber = studentIDNumberKOne;
        name = nameKOne;
        surname = surnameKOne;
        yearStudy = yearStudyKOne;
        math = mathKOne;
        economic = economicKOne;
        foreignLanguage = foreignLanguageKOne;
        }
    Student (String nameKS, String surnameKS, int yearStudyKS) {
        this (0,nameKS, surnameKS, yearStudyKS, 0.0, 0.0, 0.0);
    }

    Student () {
        this (null, null,0);
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
        Student One = new Student(10, "Ks", "Smy", 2, 2.2, 4.4, 5.0);
            System.out.println(One.surname);


            Student Second = new Student("Ivan", "Popov", 3);
            System.out.println(Second.name);

            Student Third = new Student();
            System.out.println(Third.name);


    }

}
