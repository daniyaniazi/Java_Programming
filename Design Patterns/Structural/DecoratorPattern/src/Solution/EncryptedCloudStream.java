package Solution;


public class EncryptedCloudStream implements Stream {
    
    private  Stream stream;
    
    public  EncryptedCloudStream(Stream stream){
        this.stream= stream;
    }
    
    
    @Override
    public  void write(String data){
        String encryptedData = encryptData(data);
        // Composition
        stream.write(encryptedData);
    }
    
    private String encryptData(String data){
        return "@!@#@$%$"+data+"#@$%&^*GFDXS";
    }
}