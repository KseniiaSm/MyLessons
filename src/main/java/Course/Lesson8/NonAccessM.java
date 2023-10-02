package Course.Lesson8;

public class NonAccessM {
    static int a;
    static int b;
    static int c;
    NonAccessM(int aK, int bK, int cK) {
        a = aK;
        b = bK;
        c = cK;
    }

    static int umnozchenie (){
        int proizvedenie = a * b * c;
        System.out.println("proizvedenie chisel " + a + b + c + " ravno " + proizvedenie);
        return proizvedenie;
    }

    static void delenie () {
        int chastnoe = a / b;
        int ostatok = a%b;
        System.out.println("pri delenii chisel " + a +" " + b + " chastnoe = " + chastnoe + " ostatok = " + ostatok);
    }


}

class tst {
    public static void main(String[] args) {

        System.out.println("tests");
        NonAccessM TestOne = new NonAccessM(10, 3,2);
        TestOne.umnozchenie();
        TestOne.delenie();

        NonAccessM TestSecond = new NonAccessM(100, 1, 5);
        TestSecond.umnozchenie();
        TestSecond.delenie();


    }

}

