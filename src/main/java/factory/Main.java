package factory;

public class Main {
    public static void main(String[] args) {
        Car benz = CarFactory.getCarFactory(AvailableCars.Benz);
        System.out.println(benz.getSpeed());

        Car bmw = CarFactory.getCarFactory(AvailableCars.Bmw);
        System.out.println(bmw.getSpeed());

        Car vw = CarFactory.getCarFactory(AvailableCars.Vw);
        System.out.println(vw.getSpeed());


    }
}
