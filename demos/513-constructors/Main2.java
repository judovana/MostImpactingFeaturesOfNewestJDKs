public class Main2 {

  private static class Master {

   Master() {
      System.out.println("I'm your master!");
    }
  }

  private static class KindMaster extends Master {

	int y;

   	KindMaster(int x) {
      System.out.println("Are you my master?");
      if (x<0) {y = -1;}
//      if (x==0) {y = 0;}
      if (x>0) {y = +1;}
      super();
      System.out.println("I'm kind master of " +y);
    }
  }

  public static void main(String... args) {
    new KindMaster(10);
  }
}
