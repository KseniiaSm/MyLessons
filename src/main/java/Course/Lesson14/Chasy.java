package Course.Lesson14;

public class Chasy {
    int chas;
    int minuta;
    int secunda;
    public static void zapuskChasov () {
        OUTER: for (int chas = 0; chas <=6; chas++) {
            INTERONE: for (int minuta = 0; minuta <=59; minuta++){
                if (chas > 1 & (minuta % 10 == 0) & (minuta > 0)) {
                    break OUTER;
                }
                INTERSECOND: for (int secunda = 0; secunda <=59; secunda++){

                    if (secunda * chas > minuta) {
                        continue INTERONE;
                    }
                    System.out.println(chas + ":" + minuta + ":" + secunda);
                }
            }
        }

    }


    public static void main(String[] args) {
        Chasy.zapuskChasov();
    }
}





