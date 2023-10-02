package Course.Lesson15;

public class Chasy {
    int chas;
    int minuta;
    int secunda;
    public static void zapuskChasov () {
        int chas =0;
        int minuta = 0;
        int secunda = 0;
        OUTER: while (chas <=6) {



            INTERONE: do {

                INTERSECOND:
                while (secunda <= 59) {

                    if (secunda * chas > minuta) {
                        continue INTERONE;
                    }
                    secunda++;
                }

            }

            while (chas > 1 & (minuta % 10 == 0) & (minuta > 0));
            {
            System.out.println(chas + ":" + minuta + ":" + secunda);
            minuta++;
            }
            chas++;
        }


        }




    public static void main(String[] args) {
        Chasy.zapuskChasov();
    }
}





