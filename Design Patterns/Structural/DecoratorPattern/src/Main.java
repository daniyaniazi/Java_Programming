import Problem.CloudStream;
import Problem.CompressedCloudStream;
import Problem.EncryptedCloudStream;
import Solution.Stream;

public class Main {
    public static void main(String[] args) {
    
        CloudStream stream = new CloudStream();
        stream.write("Simple Data");
    
        CloudStream encryptedStream = new EncryptedCloudStream();
        encryptedStream.write("Encrypted Data");
    
        CloudStream compressData = new CompressedCloudStream();
        compressData.write("Compress Data");
        
    //    NOW COMPRESS + ENCRYPTED - NEW CLASS ? CompressedAndEncrypted  CloudStream
    
    //    SOLUTION
    
        StoreCreditCard(new Solution.CompressedCloudStream(new Solution.EncryptedCloudStream(new Solution.CloudStream())));
    }
    
    public  static  void StoreCreditCard(Stream stream){
        stream.write("1324-7765-8765");
    }
}