import java.util.*;
import java.util.function.*;
import java.util.stream.*;


public class ThreeToDoubleGatherer {

    private static Double createDoubleFromBuffer(String first, String second, String exponent) {
        String scientificNotation = first + second + "e" + exponent;
        System.out.println("Creating double from: " + scientificNotation);
        return Double.parseDouble(scientificNotation);
    }

    static class ThreeToDoubleGathererImpl implements Gatherer<Integer, List<String>, Double> {

        @Override
        public Supplier<List<String>> initializer() {
            System.out.println("initializer");
            return () -> {
                System.out.println("initializer called");
                return new ArrayList<String>();
            };
        }
        
        @Override
        public Integrator<List<String>, Integer, Double> integrator() {
            System.out.println("integrator");
            return (buffer, element, downstream) -> {
                System.out.println("integrator called with: " + element);
                buffer.add(element.toString());
                if (buffer.size() == 3) {
                    Double value = createDoubleFromBuffer(buffer.get(0), buffer.get(1), buffer.get(2));
                    buffer.clear();
                    return downstream.push(value);
                }
                return true;
            };
        }
        
        @Override
        public BinaryOperator<List<String>> combiner() {
            System.out.println("combiner");
            return (buffer1, buffer2) -> {
                System.out.println("combiner called - merging buffers of size " + buffer1.size() + " and " + buffer2.size());
                buffer1.addAll(buffer2);
                return buffer1;
            };
        }
        
        @Override
        public BiConsumer<List<String>, Downstream<? super Double>> finisher() {
            System.out.println("finisher");
            return (buffer, downstream) -> {
                System.out.println("finisher called with buffer size: " + buffer.size());
                // Process any complete groups of 3 in the final buffer
                while (buffer.size() >= 3) {
                    Double value = createDoubleFromBuffer(buffer.get(0), buffer.get(1), buffer.get(2));
                    downstream.push(value);
                    // Remove the processed element(s). We can not clear, there may be more, due to parallel nature of impl
                    buffer.remove(0);
                    buffer.remove(0);
                    buffer.remove(0);
                }
                
                if (!buffer.isEmpty()) {
                    System.out.println("Warning: " + buffer.size() + " element(s) left over and not processed");
                }
            };
        }
    }

    public static void main(String[] args) {
        // Example: [1, 2, 3, 4, 5, 6] -> "12e3" = 12000.0, "45e6" = 45000000.0
        List<Double> result = List.of(1, 2, 3, 4, 5, 6).stream().gather(new ThreeToDoubleGathererImpl()).toList();
        System.out.println("Result: " + result);
        // Example: [10, 20, 2, 51, 25, 1] -> "1020e2" = 102000.0, "5152e1" = 51520.0
        List<Double> result2 = List.of(10, 20, 2, 51, 52, 1).stream().gather(new ThreeToDoubleGathererImpl()).toList();
        System.out.println("Result: " + result2);
        // Example with 7 elements (1 leftover)
        List<Double> result3 = List.of(1, 2, 3, 4, 5, 6, 7).stream().gather(new ThreeToDoubleGathererImpl()).toList();
        System.out.println("Result: " + result3);
        // Test with parallel stream
        List<Double> result5 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9).parallelStream().gather(new ThreeToDoubleGathererImpl()).toList();
        System.out.println("Result (parallel): " + result5);
    }
}