package Course.Lesson8;

public class HW2 {
    static final double pi = 3.14;


   double sKruga (double r) {
    double s = pi * r * r;
    return s;
    }

    static double lKsuga (double rr) {
        double l = 2 * pi * rr;
        return l;
    }

       void info (double rrr){
       System.out.println("radius = " + rrr + "; " + "S kruga = " + (pi * rrr * rrr) + "; " +"l kruga = " + (2 * pi * rrr) + ";");
       }

      void infoX (double rRr){
          System.out.println("radius = " + rRr + "; " + "S kruga = " + sKruga(rRr) + "; " +"l kruga = " + lKsuga(rRr) + ";");


      }

        }





class HWTest {

    public static void main(String[] args) {
        HW2 TestOne = new HW2();
        TestOne.sKruga(100);
        TestOne.lKsuga(100);
        TestOne.info(100);
        TestOne.infoX(100);

    }




}
