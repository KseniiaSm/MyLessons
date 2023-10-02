package Course.Lesson6;

public class OverLoaded {
    int sum (int a, int b, int c, int d) {
        int k = a+b+c+d;
        System.out.println("Сумма чисел " + a + " "+ b + " "+ c+" " + d + " равна " + k);
        return k;
    }

    int sum (int a, int b, int c) {
        int k = a+b+c;
        System.out.println("Сумма чисел " + a + " "+ b + " "+ c+ " равна " + k);
        return k;
    }

    int sum (int a, int b) {
        int k = a+b;
        System.out.println("Сумма чисел " + a + " "+ b + " "+ " равна " + k);
        return k;
    }

    int sum (int a) {
        int k = a;
        System.out.println("Сумма чисел " + a + " равна " + k);
        return k;
    }

    int sum () {
        int k = 0;
        System.out.println("Сумма чисел " +"которых нет" +" равна " + k);
        return k;
    }

        }


        class Test {
            public static void main(String[] args) {
                OverLoaded testOne = new OverLoaded();

                testOne.sum();
                testOne.sum(10);
                testOne.sum(10,5);
                testOne.sum(10, 5, 0);
                testOne.sum(10,5,0,5);
            }

        }