package behavioural.strategy_pattern;
public class SchoolStudentFeeStrategy implements FeeStrategy {
    @Override
    public double calculateFee(double baseFee) {
        return baseFee * 0.8;
    }
}