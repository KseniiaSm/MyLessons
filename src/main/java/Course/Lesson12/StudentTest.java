package Course.Lesson12;

import Course.Lesson11.Student;

public class StudentTest {

     static void sravnenieStudentovObshee (Student stPervyi, Student stVtoroy) {
        if (stPervyi.equals(stVtoroy)) {
            System.out.println("Студент один равен студенту два");
        }
        else {
            System.out.println("Студент один не равен студенту два");
        }

    }

    static void sravnenieName (Student stA, Student stB) {
        if (stA.name.equals(stB.name)) {
            System.out.println("Имя студента один равно имени студента два");
        }
        else {
            System.out.println("Имя студента один не равно имени студента два");
        }
     }

    static void sravnenieGrade (Student stA, Student stB) {
        if (stA.grade==stB.grade){
            System.out.println("Оценка студента один равна оценке студента два");
        }
        else { System.out.println("Оценка студента один не равна оценке студента два");
        }
    }



    public static void main(String[] args) {
        Student stOne = new Student("Nastya", 5, 9.0);
        Student stSecond = new Student("Poleno", 5,9.0);
        sravnenieStudentovObshee (stOne, stSecond);
        sravnenieGrade(stOne,stSecond);
        sravnenieName(stOne, stSecond);
    }
}