import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(1,2,3);
        // Imperative Programming
        for (Integer item : list){
            System.out.println(item);
        }
        // This methods takes a consumer object
        // Declarative Programming
        list.forEach(
                 item->System.out.println(item)
        );

        // consume object
        Consumer<Integer> print = (item)->System.out.println(item);

        Consumer<Integer> printDouble = (item)->System.out.println(item+item);

        list.forEach(print.andThen(printDouble));
    }
}