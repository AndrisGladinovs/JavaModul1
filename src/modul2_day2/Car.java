package modul2_day2;

public class Car {
    String brand;
    String win;  // motor ID
    String color;
    int tiles;
    int doors;
    int mileAge;

    public void move(int km) {
        System.out.println("Das Auto ist gefahren " + km + "km");
        mileAge += km;
    }
}

class CarTest {
    public static void main(String[] args) {
        Car myFirstCar = new Car();
        myFirstCar.brand = "Ferrari";
        myFirstCar.move(100);
        System.out.println("Mileage ist " + myFirstCar.mileAge);
        myFirstCar.move(300);
        System.out.println("Mileage ist " + myFirstCar.mileAge);
        myFirstCar.mileAge = 0;
        System.out.println("Mileage ist " + myFirstCar.mileAge);
    }
}
