package Problem;

public class EncryptedCloudStream extends  CloudStream {
    
    @Override
    public  void write(String data){
        String encryptedData = encryptData(data);
        super.write(encryptedData);
    }
    
    private String encryptData(String data){
        return "@!@#@$%$"+data+"#@$%&^*GFDXS";
    }
}