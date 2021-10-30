public class Main {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = new MercedesFactory();
        Bike bike = abstractFactory.getBike();
        Car car = abstractFactory.getCar();
        car.drive();
        bike.drive();
    }
}

interface Car {
    void drive();
}

interface Bike {
    void drive();
}

class Mercedes implements Car {
    @Override
    public void drive() {
        System.out.println("Drive Mercedes car");
    }
}

class Bmw implements Car {
    @Override
    public void drive() {
        System.out.println("Drive BMW car");
    }
}

class MercedesBike implements Bike {
    @Override
    public void drive() {
        System.out.println("Drive Mercedes bike");
    }
}

class BmwBike implements Bike {
    @Override
    public void drive() {
        System.out.println("Drive BMW bike");
    }
}

interface AbstractFactory {
    Car getCar();

    Bike getBike();
}

class MercedesFactory implements AbstractFactory {
    @Override
    public Car getCar() {
        return new Mercedes();
    }

    @Override
    public Bike getBike() {
        return new MercedesBike();
    }
}

class BmwFactory implements AbstractFactory {
    @Override
    public Car getCar() {
        return new Bmw();
    }

    @Override
    public Bike getBike() {
        return new BmwBike();
    }
}




