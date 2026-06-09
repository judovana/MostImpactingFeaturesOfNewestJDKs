import java.lang.foreign.*;
import java.lang.invoke.*;

public class FF {
  public static void main(final String... args) throws Throwable {
  Linker linker = Linker.nativeLinker();
        SymbolLookup mathlib = SymbolLookup.libraryLookup(System.getProperty("user.dir") + "/libnative.so", Arena.ofAuto());
        MethodHandle addFunc = linker.downcallHandle(
            mathlib.find("add").orElseThrow(),
            FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE,
                                   ValueLayout.JAVA_DOUBLE,
                                   ValueLayout.JAVA_DOUBLE)
        );
    double result = (double) addFunc.invoke(5.5, 2.3);
    System.out.println("Result: " + result);

    SymbolLookup golib = SymbolLookup.libraryLookup(System.getProperty("user.dir") + "/gohello.so", Arena.ofAuto());
    MethodHandle addFunc2= linker.downcallHandle(
            golib.find("Add").orElseThrow(),
            FunctionDescriptor.of(ValueLayout.JAVA_INT,
                                   ValueLayout.JAVA_INT,
                                   ValueLayout.JAVA_INT)
        );
    int result2 = (int) addFunc2.invoke(5, 2);
    System.out.println("Result: " + result2);


    SymbolLookup rustlib = SymbolLookup.libraryLookup(System.getProperty("user.dir") + "/librust_math.so", Arena.ofAuto());
    MethodHandle addFunc3= linker.downcallHandle(
            rustlib.find("add_numbers").orElseThrow(),
            FunctionDescriptor.of(ValueLayout.JAVA_INT,
                                   ValueLayout.JAVA_INT,
                                   ValueLayout.JAVA_INT)
        );
    int result3 = (int) addFunc3.invoke(44, 2);
    System.out.println("Result: " + result3);
  }
}
