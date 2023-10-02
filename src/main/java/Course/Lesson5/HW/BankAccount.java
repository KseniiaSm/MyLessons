package Course.Lesson5.HW;
// + HW lesson5
public class BankAccount {

    int id;
    String name;
    double balance;

    void popolnenieScheta (double Summapopolnenie) {
        System.out.println(name);
        System.out.println("balance  " + balance);
        System.out.println("summa popolneniya  " + Summapopolnenie);
        balance += Summapopolnenie;
        System.out.println("new balance  " + balance);
    }

    void snyatieSoScheta (double Summasnyatie) {
        System.out.println(name);
        System.out.println("balance  " + balance);
        System.out.println("summa popolneniya  " + Summasnyatie);
        balance -= Summasnyatie;
        System.out.println("new balance  " + balance);
    }



    public static void main(String[] args) {
        BankAccount MyA = new BankAccount();
        BankAccount YourA = new BankAccount();
        BankAccount HisA = new BankAccount();

        MyA.id = 1;
        MyA.name = "Zaur";
        MyA.balance = 12.35;
        MyA.snyatieSoScheta(3.21);

        YourA.id = 2;
        YourA.name = "Mike";
        YourA.balance = 2.00;
        YourA.popolnenieScheta(5.55);

        HisA.id = 3;
        HisA.name = "Ivan";
        HisA.balance = 124.120;
        HisA.snyatieSoScheta(101.10);
        HisA.popolnenieScheta(6000);

    }
}
