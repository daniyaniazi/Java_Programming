package Solution;

/*
* @desc read and write data to the cloud
*/
public class CloudStream implements Stream{
    public void  write(String data){
        
        System.out.println("Storing"+data);
    }
}