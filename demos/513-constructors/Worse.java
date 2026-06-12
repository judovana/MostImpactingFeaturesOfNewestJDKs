public class Worse {

  private static class Master {

    int i1 = 1;

   	Master(String a) {
      System.out.println("String called " +a);
    }

   	Master(int a) {
      System.out.println("int called");
    }
  }

  private static class KindMaster extends Master {

    int i2 ;//=2;

   	KindMaster() {
      int b = true?6:7;
      if (b == 10 ) {throw new RuntimeException();} 
//      i1++;
//      i2++;
//      i1=5;
      this.i2=b;
//      System.out.println("xx: " + i2);
      System.out.println("Wo will be called");
//     if (true) {
      super("a"+b);
//     } else {
//      super(1); 
//     }
      System.out.println("It is quite logical at the end...");
    }
  }

  public static void main(String... args) {
    new KindMaster();
  }
}
