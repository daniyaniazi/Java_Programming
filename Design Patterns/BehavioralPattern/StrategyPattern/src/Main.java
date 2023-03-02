import StrategyPattern.BlackAndWhiteFilterConcreteStrategy;
import StrategyPattern.ImageStorageContext;
import StrategyPattern.JPEGCompressorConcreteStrategy;

public class Main {
    public static void main(String[] args) {

        ImageStorageContext imageStorage = new ImageStorageContext(new JPEGCompressorConcreteStrategy(), new  BlackAndWhiteFilterConcreteStrategy());
        imageStorage.store("My filename");

    }
}