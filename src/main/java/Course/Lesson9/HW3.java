package Course.Lesson9;

public class HW3 {
}

class Test2 {
    int a = 1;
    static int b = 2;
    static void abc (final int a) {
        System.out.println(a);
        //выведет последнюю присвоенную а т.е. 5
        System.out.println(Test2.b);
        // выведет 2
    }

    public static void main(String[] args) {
        abc (5);
    }
}
