package StrategyPattern;

public class BlackAndWhiteFilterConcreteStrategy implements FilterStrategy {
    @Override
    public void apply(String fileName) {
        System.out.println("Applying black and white filter");
    }
}
