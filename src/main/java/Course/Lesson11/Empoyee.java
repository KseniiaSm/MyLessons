package Course.Lesson11;

import java.awt.image.Kernel;

public class Empoyee {
    static int salary;
    String name;
    int id;

    Empoyee (int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int uvelichenieZp (int salary) {
        int zp = salary * 2;
        System.out.println(zp);
        return zp;
    }
}

class Test {
    public static void main(String[] args) {
        Empoyee Kse = new Empoyee(100, "Kseniia", 1000);
        int d = Kse.uvelichenieZp(Kse.salary);
        System.out.println(Kse.salary);
        Kse.salary = Kse.uvelichenieZp(Kse.salary);
        System.out.println(Kse.salary);
    }




}