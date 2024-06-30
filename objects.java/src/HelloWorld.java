public class HelloWorld {

  public static void main(String[] args) throws Exception {
    System.out.println("Hello, World!");
    smartphone iphone = new smartphone();
    iphone.brand = "2020";
    iphone.model = "latest";
    iphone.call();

    calc calc = new calc();

    double result1 = calc.add(5, 3, 2, 23, 3, 298);
    System.out.println("5 + 3 = " + result1);

    double result2 = calc.subtract(10, 4);
    System.out.println("10 - 4 = " + result2);

    double result3 = calc.multiply(6, 7);
    System.out.println("6 * 7 = " + result3);

    double result4 = calc.divide(8, 2);
    System.out.println("8 / 2 = " + result4);

    double result5 = calc.average(2, 3);
    System.out.println("(2 + 3)/2 average = " + result5);

    System.out.println(gdc(252, 105));
  }

  public static int gdc(int a, int b) {
    if (b == 0) return a; else return gdc(b, a % b);
  }
}

class smartphone {

  String brand;
  String model;
  int storage;

  public void call() {
    System.out.println(this.brand + " " + this.model);
  }
}

class calc {

  public double add(double x, double y) {
    return x + y;
  }

  public double add(double... args) {
    double sum = 0;
    for (double d : args) {
      sum += d;
    }
    return sum;
  }

  public double subtract(double x, double y) {
    return x - y;
  }

  public double multiply(double x, double y) {
    return x * y;
  }

  public double divide(double x, double y) {
    if (y == 0) {
      System.out.println("Cannot divide by zero");
      return Double.NaN;
    }
    return x / y;
  }

  public double average(double x, double y) {
    return (x + y) / 2;
  }
}
