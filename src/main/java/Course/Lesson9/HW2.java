package Course.Lesson9;

public class HW2 {

}

class Test1 {
    int a = 1;
    //static int a = 2;
    // мы не можем задать переменную одинаковую в одном объекте
    void abc (int a) {
        System.out.println(a);
        // тут выведет переменную из объекта последнего
        System.out.println(this.a);
        // тут просто покажет ту ж самую а, т.е. выведет "1"
        // переменную объекта Test1
    }

    public static void main(String[] args) {
        Test1 t = new Test1();
        t.abc(3);
        // мы тут все равно не запрашиваем вывести перемнную a, так что будет все равно 1, т.к. она приоритетнее

    }

}
