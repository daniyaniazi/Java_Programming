package Server;

public class Logger extends Handler {
 
    // public  void  log(HttpRequest request){
    //
    //     System.out.println("Log");
    // }
    
    public Logger(Handler next) {
        super(next);
    }
    @Override
    public boolean doHandle(HttpRequest request) {
        System.out.println("Log");
        return false;
    }
}