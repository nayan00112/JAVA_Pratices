class Car {
    int wheelNum;
    String CarModel;
    int price;

    public Car() {
        wheelNum = 4;
    }

    public void info() {
        System.out.println("Car model is " + CarModel + ". It has " + wheelNum + " and price is " + price + ".");
    }
}

public class C04_Constructor {
    public static void main(String arg[]) {
        Car car1 = new Car();
        car1.CarModel = "Nion";
        car1.price = 8_00_000; // {Same as 800000}

        car1.info();

        Car car2 = new Car();
        car2.CarModel = "tigor";
        car2.price = 10_00_000; // {Same as 1000000}
        car2.wheelNum = 5; // with extra wheel :)

        car2.info();
    }
}

// Output:
// Car model is Nion. It has 4 and price is 800000.
// Car model is tigor. It has 5 and price is 1000000.