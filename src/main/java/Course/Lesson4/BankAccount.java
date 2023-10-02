package Course.Lesson4;
// + HW lesson5
public class BankAccount {

    int id;
    String name;
    double balance;

    double popolnenieScheta (double Summapopolnenie) {
        balance += Summapopolnenie;
        return balance;
    }

    double snyatieSoScheta (double Summasnyatie) {
        balance -= Summasnyatie;
        return balance;
    }



    public static void main(String[] args) {
        BankAccount MyA = new BankAccount();
        BankAccount YourA = new BankAccount();
        BankAccount HisA = new BankAccount();

        MyA.id = 1;
        MyA.name = "Zaur";
        MyA.balance = 12.35;
        double MyASeptember = MyA.popolnenieScheta(3000);

        YourA.id = 2;
        YourA.name = "Mike";
        YourA.balance = 2.00;
        double YourASeptember = YourA.snyatieSoScheta(1.81);

        HisA.id = 3;
        HisA.name = "Ivan";
        HisA.balance = 124.12;

        System.out.println(MyA.name  +"   " + MyASeptember);
        System.out.println(YourA.name +"   " + YourASeptember);


    }
}
