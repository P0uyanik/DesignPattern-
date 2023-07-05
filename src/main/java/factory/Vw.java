package factory;

import java.time.LocalDate;

public class Vw implements Car {


    @Override
    public double getSpeed() {
        return 3;
    }

    @Override
    public LocalDate getYearOfProduce() {
        return LocalDate.now();
    }
}
