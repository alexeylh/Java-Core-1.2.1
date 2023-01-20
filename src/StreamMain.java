import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamMain {
    public static void main(String[] args) {
        System.out.println("Решение через Stream:");
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        intList.stream()
                .filter(x -> x > 0 && x % 2 == 0)
                .sorted(Comparator.naturalOrder())
                .forEach(System.out::println);
        System.out.println();
    }
}
