package Problem;

public class NotificationServer
    {
    //     connect to server -> connection
    //     authentication (appId, key) AuthToken
    //     send(authToken , message , targetUser)
    //     Dissconnect
        
        public Connection connection(String ipAddress){
            return  new Connection();
        }
        
        public  Authentication authenticate(String appId, String key){
            return  new Authentication();
        }
        
        public void  send(Authentication authToken, Message message , String target){
            System.out.println("Sending a Message");
        }
}