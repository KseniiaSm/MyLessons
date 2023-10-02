package Course.Lesson3;

public class HW2 {
    public static void main(String[] args) {
        int a = 5;
        int c = a-- - --a + ++a + a++ +a;
        System.out.println(c);
        // 5 - 3 + 4 + 4 + 5 = 15
        int b = 8;
        int d = ++b - b++ + ++b - --b;
        // 9 - 9 + 11 - 10 = 1
        System.out.println(d);

    }
}
