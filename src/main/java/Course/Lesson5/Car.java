package Course.Lesson5;

public class Car {
    String color;
    String engine;
    int speed;

    // метод для увеличения скорости
    int increase(int razgon) {
        speed += razgon;
        return speed;
    }
// метод для торможения

    int decrease (int tormoz) {
        speed -= tormoz;
        return speed;
}

// метод для вывода

   void data () {
       System.out.println("color " + color + "   engine " + engine + "  speed " + speed);
   }
    }

    class Car2 {
        public static void main(String[] args) {
            Car one = new Car();
            one.color = "white";
            one.engine = "V6";
            one.speed = 30;
            one.decrease(100);
            one.data();
                   }


    }
