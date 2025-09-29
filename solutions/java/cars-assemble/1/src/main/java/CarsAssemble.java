import java.security.InvalidParameterException;

public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        return speed * 221 * this.successRate(speed);
    }

    private double successRate(int speed){
        if (speed > 0 && speed <5)
            return 1;

        if (speed > 4 && speed < 9)
            return 0.9;

        if (speed == 9)
            return 0.8;

        if (speed == 10)
            return 0.77;

        if (speed > 10)
            throw new InvalidParameterException("speed limited to 10");
        return 0;
    }

    public int workingItemsPerMinute(int speed) {
        return (int) (this.productionRatePerHour(speed) / 60);
    }
}
