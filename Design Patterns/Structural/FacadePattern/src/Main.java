import Problem.Authentication;
import Problem.Connection;
import Problem.Message;
import Problem.NotificationServer;
import Solution.NotificationFacadeService;

public class Main {
    public static void main(String[] args) {
    
        // Complex step each time to send notification
        // NotificationServer server = new NotificationServer();
        // Connection connection = server.connection("134.889.199.99");
        // Authentication token = server.authenticate("98765e4","HGFGUHI");
        // server.send(token, new Message("Hello"), "target ip");
        // connection.disconnect();
    
        NotificationFacadeService service = new NotificationFacadeService();
        service.send("Hi", "9786");
    }
}