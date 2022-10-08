import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(1,2,3);
        // Imperative Programming
        for (Integer item : list){
            System.out.println(item);
        }
        // This methods takes a consumer
        // Declarative Programming
        list.forEach(
                 item->System.out.println(item)
        );
    }
}