import java.lang.foreign.*;
import java.lang.invoke.VarHandle;

public class MA{
  public static void main(final String... args) throws Exception {
   //Global  Automatic  Confined  Shared
   try (Arena arena = Arena.ofShared()) {
     // SequenceLayout, GroupLayout, PaddingLayout, ValueLayout
     SequenceLayout SEQUENCE_LAYOUT = MemoryLayout.sequenceLayout(1024, ValueLayout.JAVA_INT); //"arrayLayout"
     MemorySegment segment = arena.allocate(SEQUENCE_LAYOUT);

     VarHandle intElementHandle = SEQUENCE_LAYOUT.varHandle(MemoryLayout.PathElement.sequenceElement());
     for (int i = 1; i < 6; i++) {
          intElementHandle.set(segment, 0L, (long) i, 100*i);
      }

      int sum = segment.elements(ValueLayout.JAVA_INT).parallel()
                      .mapToInt(s -> s.get(ValueLayout.JAVA_INT, 0))
                      .sum();
      System.out.println("Sum on heap: " + sum);    
   }
  }
}
