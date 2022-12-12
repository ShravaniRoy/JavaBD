import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExampleMain {
    public static void main(String[] args) {
        List<Integer> example = Arrays.asList(5, 8, 3, 9, 1, 2, 4, 7);
        //Arrays returns "new ArrayList" internally and that is why we don't need to use new in initializing it in our program.
        List<Integer> cubes = example.stream().map(x->x*x*x).sorted().collect(Collectors.toList());
        System.out.println(cubes);

        List<Integer> allEvens = example.stream().filter(x -> x%2==0).collect(Collectors.toList());
        System.out.println(allEvens);

        example.stream().sorted(Comparator.reverseOrder())
                .forEach(System.out::println); //when you don't want to store in another variable but apply some logic

        int reduceResult = example.stream()
                .sorted().reduce(0,(eachVal, total)-> eachVal + total);

        System.out.println(reduceResult);
        System.out.println("Average: "+ reduceResult/example.size());
    }
}
