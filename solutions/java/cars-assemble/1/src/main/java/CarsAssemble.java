public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        // Base rate is 221 cars per hour at speed 1
        double baseRate = speed * 221.0;

        if (speed >= 1 && speed <= 4) {
            return baseRate * 1.0;     // 100% success rate
        } else if (speed >= 5 && speed <= 8) {
            return baseRate * 0.90;    // 90% success rate
        } else if (speed == 9) {
            return baseRate * 0.80;    // 80% success rate
        } else if (speed == 10) {
            return baseRate * 0.77;    // 77% success rate
        }

        return 0.0;
    }

    public int workingItemsPerMinute(int speed) {
        // Divide hourly rate by 60 and cast to int to drop decimals
        return (int) (productionRatePerHour(speed) / 60);
    }
}