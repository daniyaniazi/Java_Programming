package Problem;

public class CompressedCloudStream extends CloudStream {
    
    @Override
    public  void write(String data){
        String compressData = compressDate(data);
        super.write(compressData);
    }
    
    private String compressDate(String data){
        return "///"+data.substring(0,5)+"///";
    }
}