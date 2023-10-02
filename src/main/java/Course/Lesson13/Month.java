package Course.Lesson13;

public class Month {
    static void vyvodKolichestvaDney (int nomerMesyatsa) {
        switch (nomerMesyatsa) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Колличество дней в данном месяце 31");
                break;
            case 2:
                System.out.println("Колличество дней в данном месяце 28");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Колличество дней в данном месяце 30");
                break;
            default:
                System.out.println("Такого номера месяца не существует");
        }


    }
}

class Test {
        public static void main(String[] args) {

            Month testMonth = new Month();
            testMonth.vyvodKolichestvaDney (66);
            Month.vyvodKolichestvaDney(10);
    }

}