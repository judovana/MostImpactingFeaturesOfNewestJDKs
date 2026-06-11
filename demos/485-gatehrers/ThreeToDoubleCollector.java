import java.util.*;
import java.util.function.*;
import java.util.stream.*;


public class ThreeToDoubleCollector {

    private static Double createDoubleFromBuffer(String first, String second, String exponent) {
        String scientificNotation = first + second + "e" + exponent;
        System.out.println("Creating double from: " + scientificNotation);
        return Double.parseDouble(scientificNotation);
    }

    public static class ThreeToDoubleCollectorImpl implements Collector<Integer, List<String>, List<Double>> {
        
        @Override
        public Supplier<List<String>> supplier() {
            System.out.println("supplier");
            return () -> {
                System.out.println("supplier called");
                return new ArrayList<String>();
            };
        }

        @Override
        public BiConsumer<List<String>, Integer> accumulator() {
            System.out.println("accumulator");
            return (List<String> accumulator, Integer element) -> {
                System.out.println("accumulator called with: " + element);
                accumulator.add(element.toString());
            };
        }

        @Override
        public BinaryOperator<List<String>> combiner() {
            System.out.println("combiner");
            return (list1, list2) -> {
                System.out.println("combiner called");
                list1.addAll(list2);
                return list1;
            };
        }

        @Override
        public Function<List<String>, List<Double>> finisher() {
            System.out.println("finisher");
            return (List<String> accumulator) -> {
                System.out.println("finisher called");
                List<Double> result = new ArrayList<>();
                // Process every three elements
                for (int i = 0; i + 2 < accumulator.size(); i += 3) {
                    String first = accumulator.get(i);
                    String second = accumulator.get(i + 1);
                    String exponent = accumulator.get(i + 2);
                    Double value = createDoubleFromBuffer(first, second, exponent);
                    result.add(value);
                }
                int remainder = accumulator.size() % 3;
                if (remainder != 0) {
                    System.out.println("Warning: " + remainder + " element(s) left over and not processed");
                }
                
                return result;
            };
        }

        @Override
        public Set<Characteristics> characteristics() {
            System.out.println("characteristics");
            return Collections.emptySet();
        }
    }

    public static void main(String[] args) {
        // Example: [1, 2, 3, 4, 5, 6] -> "12e3" = 12000.0, "45e6" = 45000000.0
        List<Double> result = List.of(1, 2, 3, 4, 5, 6).stream().collect(new ThreeToDoubleCollectorImpl());
        System.out.println("Result: " + result);
        // Example: [10, 20, 2, 51, 52, 1] -> "1020e2" = 102000.0, "5152e1" = 51520.0
        List<Double> result2 = List.of(10, 20, 2, 51, 52, 1).stream().collect(new ThreeToDoubleCollectorImpl());
        System.out.println("Result: " + result2);
        // Example with 7 elements (1 leftover)
        List<Double> result3 = List.of(1, 2, 3, 4, 5, 6, 7).stream().collect(new ThreeToDoubleCollectorImpl());
        System.out.println("Result: " + result3);
        // Test with parallel stream to see combiner in action
        List<Double> result4 = List.of(10, 20, 3, 40, 50, 6, 70, 80, 9).parallelStream().collect(new ThreeToDoubleCollectorImpl());
        System.out.println("Result: " + result4);
    }
}
