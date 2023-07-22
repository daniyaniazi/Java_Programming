package Solution;

import Problem.Authentication;
import Problem.Connection;
import Problem.Message;
import Problem.NotificationServer;

public class NotificationFacadeService  {
    public  void  send(String message, String target){
        NotificationServer server = new NotificationServer();
        Connection connection = server.connection("134.889.199.99");
        Authentication token = server.authenticate("98765e4","HGFGUHI");
        server.send(token, new Message(message), target);
        connection.disconnect();
    }
}