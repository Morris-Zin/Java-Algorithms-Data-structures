public class App {

  public static void main(String[] args) throws Exception {
    System.out.println("Hello, World!");

    QuickFindUF uf = new QuickFindUF(10);

    // Union some pairs
    uf.union(1, 2);
    uf.union(3, 4);
    uf.union(5, 6);
    uf.union(7, 8);
    uf.union(7, 9);

    // Check if connected
    System.out.println("1 and 2 connected: " + uf.connected(1, 2));
    System.out.println("3 and 4 connected: " + uf.connected(3, 4));
    System.out.println("5 and 9 connected: " + uf.connected(5, 9));
    System.out.println("7 and 9 connected: " + uf.connected(7, 9));
  }
}
