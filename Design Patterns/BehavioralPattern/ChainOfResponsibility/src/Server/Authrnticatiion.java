package Server;

public class Authrnticatiion extends Handler{
  
    
    // public boolean authentication(HttpRequest request) {
    //
    //     Boolean isValid = (request.getUsername().equals("admin")
    //             && request.getPassword().equals("1234"));
    //     return isValid;
    // }
    public Authrnticatiion(Handler next) {
        super(next);
    }
    
    @Override
    public boolean doHandle(HttpRequest request) {
        Boolean isValid = (request.getUsername().equals("admin")
                && request.getPassword().equals("1234"));
        System.out.println("Authentication!");
        return !isValid;
    }
}