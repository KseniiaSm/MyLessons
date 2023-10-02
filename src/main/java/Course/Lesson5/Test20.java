package Course.Lesson5;

public class Test20 {

    int summa(int a, int b, int c) {
        int result = a+b+c;
        return result;    }

    //также можно вызывать метод внутри методода
    // не забывай, что нужно писать методы в главном методе из которого потом создают объект

    int sredneeArifm (int c,int m,int k) {
        int resoltSA = summa (c,m,k)/3;
        return resoltSA;

    }
}

class Test21 {
    public static void main(String[] args) {
        Test20 t = new Test20();
        int summaTrexChisel = t.summa(1,2,3);
        System.out.println(summaTrexChisel);
        System.out.println(t.summa(4,4,5));
        System.out.println(t.sredneeArifm(10,10,10));
    }
}
