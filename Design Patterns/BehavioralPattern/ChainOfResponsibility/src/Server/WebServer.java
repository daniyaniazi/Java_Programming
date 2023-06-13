package Server;

public class WebServer {
    private Handler handler;
    
    public WebServer(Handler handler) {
        this.handler = handler;
    }
    
    public  void  handle(HttpRequest request){
    
    //   Authentication
    //     Authrnticatiion authenticator = new Authrnticatiion();
    //     authenticator.authenticate(request); - OLD
    //    Logging
    //    Compression
        
        handler.handle(request);
    
    }

}