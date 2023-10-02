package Course.Lesson11;

public class Student {

    public  String name;
    public  int course;
    public  double grade;

    public Student (String name, int course, double grade) {
        this.name = name;
        this.course = course;
        this.grade = grade;
    }

    public static void swap (Student sOne,Student sSecond) {
        Student sThird = sOne;
        sOne = sSecond;
        sSecond = sThird;
        System.out.println(sOne.name);
    }

    public static void changeName (Student sOne) {
        sOne.name = "Vasiliy";
    }



    public static void main(String[] args) {
        Student stOne = new Student("Ivan", 3, 9.5);
        Student stSecond = new Student("Petr", 1, 5.3);
        swap (stOne, stSecond);
        System.out.println(stOne.name);
        System.out.println(stSecond.name);
        changeName(stSecond);

    }

}
