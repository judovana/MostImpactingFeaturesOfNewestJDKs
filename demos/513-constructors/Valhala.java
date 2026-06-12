public class Valhala {
                          /**/
  private static abstract value class Midgard {

   	Midgard() {
      System.out.println("parent");
    }
  }
                   /**/
  private static value class Asgard extends Midgard {


   	Asgard() {
      System.out.println("child");
    }
  }

  public static void main(String... args) {
    new Asgard();
  }
}
