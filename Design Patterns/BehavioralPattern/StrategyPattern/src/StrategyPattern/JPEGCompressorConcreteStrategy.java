package StrategyPattern;

public class JPEGCompressorConcreteStrategy implements CompressorStrategy{
    @Override
    public void compress(String filename) {
        System.out.println("Compressing using jepg strategy");
    }
}
