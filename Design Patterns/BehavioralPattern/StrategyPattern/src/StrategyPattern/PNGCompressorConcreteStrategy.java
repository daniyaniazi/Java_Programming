package StrategyPattern;

public class PNGCompressorConcreteStrategy implements CompressorStrategy {
    @Override
    public void compress(String filename) {
        System.out.println("Compressing using ong strategy");
    }
}
