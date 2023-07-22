package Solution;

public class CompressedCloudStream implements Stream {
    
    private  Stream stream;
    
    public CompressedCloudStream(Stream stream) {
        this.stream = stream;
    }
    
    @Override
    public  void write(String data){
        String compressData = compressDate(data);
        stream.write(compressData);
    }
    
    private String compressDate(String data){
        
        return "///"+data.substring(0,5)+"///";
    }
}