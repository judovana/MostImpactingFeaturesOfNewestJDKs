import java.util.*;
import java.util.function.*;
import java.util.stream.*;


public class ThreeToDoubleCollectorOptimized {

    private static Double createDoubleFromBuffer(String first, String second, String exponent) {
        String scientificNotation = first + second + "e" + exponent;
        System.out.println("Creating double from: " + scientificNotation);
        return Double.parseDouble(scientificNotation);
    }

    public static class Accumulator {
        List<String> buffer = new ArrayList<>(3);
        List<Double> results = new ArrayList<>();

        void add(Integer element) {
            buffer.add(element.toString());
            if (buffer.size() == 3) {
                Double value = createDoubleFromBuffer(buffer.get(0), buffer.get(1), buffer.get(2));
                results.add(value);
                buffer.clear();
            }
        }
        
        void combine(Accumulator other) {
            for (String element : other.buffer) {
                buffer.add(element);
                if (buffer.size() == 3) {
                    Double value = createDoubleFromBuffer(buffer.get(0), buffer.get(1), buffer.get(2));
                    results.add(value);
                    buffer.clear();
                }
            }
            results.addAll(other.results);
        }
        
        List<Double> finish() {
            if (!buffer.isEmpty()) {
                System.out.println("Warning: " + buffer.size() + " element(s) left over and not processed");
            }
            return results;
        }
    }

    public static class ThreeToDoubleCollectorImpl implements Collector<Integer, Accumulator, List<Double>> {
        
        @Override
        public Supplier<Accumulator> supplier() {
            System.out.println("supplier");
            return () -> {
                System.out.println("supplier called");
                return new Accumulator();
            };
        }

        @Override
        public BiConsumer<Accumulator, Integer> accumulator() {
            System.out.println("accumulator");
            return (acc, element) -> {
                System.out.println("accumulator called with: " + element);
                acc.add(element);
            };
        }

        @Override
        public BinaryOperator<Accumulator> combiner() {
            System.out.println("combiner");
            return (acc1, acc2) -> {
                System.out.println("combiner called");
                acc1.combine(acc2);
                return acc1;
            };
        }

        @Override
        public Function<Accumulator, List<Double>> finisher() {
            System.out.println("finisher");
            return (acc) -> {
                System.out.println("finisher called");
                return acc.finish();
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
        List<Double> result4 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9).parallelStream().collect(new ThreeToDoubleCollectorImpl());
        System.out.println("Result: " + result4);
    }
}

