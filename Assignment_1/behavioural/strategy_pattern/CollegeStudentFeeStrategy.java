package behavioural.strategy_pattern;

public class CollegeStudentFeeStrategy implements FeeStrategy {
    @Override
    public double calculateFee(double baseFee) {
        return baseFee * 0.9;
    }
}