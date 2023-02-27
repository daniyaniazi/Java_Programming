package Problem;

public class ImageStorage {

    // VOILATION : SINGLE RESP PRINCIPLE
    private String compressor;
    private String filter;

    public ImageStorage(String filter,String compressor) {
        this.filter = filter;
        this.compressor = compressor;
    }

    // RESP 1 : STORING THE IMAGE
    public void store(String filename) {
        // JPEG , PNG
        // compress - RESP 2
        if (compressor == "jpeg") {
            // logic here
            System.out.println("Compressing using JPEG");
        } else if (compressor == "png") {
            System.out.println("Compressing using PNG");
        }
        // additional new filter - every time new case will add
        // Filter - RESP 3
        if (filter == "b&w"){
            System.out.println("Applying B&W filter");
        } else if (filter == "high-contrast") {
            System.out.println("Applying high-contrast filter");
        }
    }
}
