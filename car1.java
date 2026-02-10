class Car {
    void fuelType() {
        System.out.println("Car uses fuel");
    }
}

class PetrolCar extends Car {
    @Override
    void fuelType() {
        System.out.println("Petrol car uses petrol");
    }
}

class DieselCar extends Car {
    @Override
    void fuelType() {
        System.out.println("Diesel car uses diesel");
    }
}

class ElectricCar extends Car {
    @Override
    void fuelType() {
        System.out.println("Electric car uses electricity");
    }
}

public class car1 {
    public static void main(String[] args) {
        Car c;

        c = new PetrolCar();
        c.fuelType();

        c = new DieselCar();
        c.fuelType();

        c = new ElectricCar();
        c.fuelType();
    }
}
