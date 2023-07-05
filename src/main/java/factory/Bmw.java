package factory;

import java.time.LocalDate;

public class Bmw implements  Car {
    @Override
    public double getSpeed() {
        return 2;
    }

    @Override
    public LocalDate getYearOfProduce() {
        return LocalDate.now();
    }
}
