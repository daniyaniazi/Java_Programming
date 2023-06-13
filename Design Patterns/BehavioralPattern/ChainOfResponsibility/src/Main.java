import Server.*;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("Hello world!");
    
        // chain
        Compressor compressor = new Compressor(null);
        Logger logger = new Logger(compressor);
        Authrnticatiion authrnticatiion = new Authrnticatiion(logger);
        
        // server
        WebServer server = new WebServer(authrnticatiion);
        server.handle(new HttpRequest("admin","1234"));
        
        
        
    }
}