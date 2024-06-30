public class App {
    public static void main(String[] args) throws Exception {

        String[] names = {"hI", "I", "askldjf", "d", "a", "b", 
        "c", "dd", "e", "f", "g", "h", "i", "j", "k", 
        "l", "m", "o", "p","s"}; 
        Cars[] carsArray = new Cars[20];
        for (int i = 0; i < 20; i++) {
            carsArray[i] = new Cars(names[i]); 
        }
        System.out.println(recursive(4));
    }

    public static int recursive(int num) { 
        int copy = (num * 2 )- 1;
        if (copy == 1) return 1; 
        return copy + recursive(num - 1) ;
    }
    public static int fibonacci(int num) {
        This
    }
}
