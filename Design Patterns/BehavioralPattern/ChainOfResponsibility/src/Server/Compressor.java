package Server;

public class Compressor extends Handler {

    // public  void compress(HttpRequest request){
    //     System.out.println("Compress");
    // }
    public Compressor(Handler next) {
        super(next);
    }
    @Override
    public boolean doHandle(HttpRequest request) {
        System.out.println("Compress");
        return false;
    }
}