import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

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

        // Supplier Interface
        Supplier<Double> getRandom= ()-> Math.random();
        // Lazy evaluation
        // explicit call
        Double random = getRandom.get();
        System.out.println(random);

        // Function Interface
        Function<String,Integer> map = str-> str.length();
        Integer length =map.apply("sky");

        // Compose functions
        Function<String,String> replaceColon= str -> str.replace("=",":");
        Function<String,String> addBraces= str-> "{"+str+"}";

        String result =replaceColon.andThen(addBraces ).apply("key:value");
        System.out.println(result);

        // 2nd way
        addBraces.compose(replaceColon).apply("key:value");
    }
}