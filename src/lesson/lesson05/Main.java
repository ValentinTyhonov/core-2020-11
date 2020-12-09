package lesson.lesson05;

public class Main
{
    public static void main(String[] args)
    {
        Car car = new Car("nissan", "black", "2010", 5);
        ElectroCar electroCar1 = new ElectroCar("nissan", "black", "2010", 5, "model", 22);
        ElectroCar electroCar2 = new ElectroCar("nissan", "black", "2010", 5, "model", 0);

        Engine someEngine = new Engine("someModel", 1234);
        RegularCar regularCar1 = new RegularCar("nissan", "black", "2010", 5, "model", 22, someEngine);
        RegularCar regularCar2 = new RegularCar("nissan", "black", "2010", 5, "model", 0, someEngine);

        car.start();

        electroCar1.start();

        electroCar2.start();
        electroCar2.setBatteryCapacity(100);
        electroCar2.start();

        regularCar1.start();
        regularCar1.setFuelCapacity(0);
        regularCar1.start();

        regularCar1.setEngine(new Engine("someNewEngine", 2525));

        Engine existedEngine = regularCar1.getEngine();
        existedEngine.setPower(2443);
        regularCar1.setEngine(existedEngine);

        electroCar1.setPassangers(new Passangers("Mark", 12));

        electroCar1.setPassangers(null);

    }
}
