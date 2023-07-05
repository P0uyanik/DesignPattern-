package factory;

public class CarFactory {
    public static Car getCarFactory(AvailableCars availableCars) {
        if (AvailableCars.Bmw.equals(availableCars))
            return new Bmw() ;
        else if (AvailableCars.Vw.equals(availableCars))
            return new Vw() ;
        else if (AvailableCars.Benz.equals(availableCars))
            return new Benz() ;
        else
            throw new IllegalArgumentException("not Found") ;
    }
}
