package Course.Lesson11;

public class Car {
    String color;
    String engine;
    int doorQuantity;

    Car (String color, String engine, int doorQuantity){
        this.color = color;
        this.engine = engine;
        this.doorQuantity = doorQuantity;
    }

}

class CarTest {
    static int changeDoorQuantity (int doorQuantity) {
        doorQuantity = doorQuantity + 2;
        System.out.println("Новое колличество дверей - " + doorQuantity);
        return doorQuantity;
    }

    static void changeColor (String carOne, String carSecond, String carForChange) {
        carForChange = carOne;
        carOne = carSecond;
        carSecond = carForChange;
        System.out.println("Новый цвет машины номер один " + carOne + "; " + "Новый цвет машины два " + carSecond);

    }


    static void changeColorSecond (Car carOne, Car carSecond, String carForChange) {
        carForChange = carOne.color;
        carOne.color = carSecond.color;
        carSecond.color = carForChange;
        System.out.println("Новый цвет машины номер один " + carOne.color + "; " + "Новый цвет машины два " + carSecond.color);

    }


    public static void main(String[] args) {
        Car carOne = new Car("blue", "V6", 4);
        Car carSecond = new Car ("red", "V10", 2);

        String carForChange = "";

        changeDoorQuantity (carOne.doorQuantity);
        changeDoorQuantity(carSecond.doorQuantity);

        changeColorSecond(carOne,carSecond, carForChange);
        System.out.println("Новый цвет машины номер один " + carOne.color + "; " + "Новый цвет машины два " + carSecond.color);


    }

}
