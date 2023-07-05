package factory;

import java.time.LocalDate;

public class Benz implements Car {

    @Override
    public double getSpeed() {
        return 1;
    }

    @Override
    public LocalDate getYearOfProduce() {
        return LocalDate.now();
    }
}
