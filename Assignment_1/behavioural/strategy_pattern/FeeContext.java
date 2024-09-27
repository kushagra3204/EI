package behavioural.strategy_pattern;
public class FeeContext {
    private FeeStrategy strategy;

    public void setStrategy(FeeStrategy strategy) {
        this.strategy = strategy;
    }

    public double executeStrategy(double baseFee) {
        return strategy.calculateFee(baseFee);
    }
}