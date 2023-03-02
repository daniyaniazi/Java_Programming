package StrategyPattern;

public class ImageStorageContext {
    private CompressorStrategy compressor;
    private FilterStrategy filter;

    public ImageStorageContext(CompressorStrategy compressorStrategy, FilterStrategy filter) {
        this.filter = filter;
        this.compressor = compressorStrategy;
    }

    // RESP 1 : STORING THE IMAGE
    public void store(String filename) {
        compressor.compress(filename);
       filter.apply(filename);
    }
}
