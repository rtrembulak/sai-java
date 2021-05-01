/*
This is my calculator
*/
public class Calculator {
    public static int a;
    public static int b;
  public Calculator(){

  }
  public int add(int a,int b){
      return a + b;
  }

  public int subtract(int a,int b){
      return a - b;
  }

  public int multiply(int a,int b){
      return a * b;
  }

  public int divide(int a,int b){
      return a / b;
  }

  public int modulo(int a,int b){
      return a % b;
  }
  public static void main(String[] args){
    Calculator myCalculator = new Calculator();
    System.out.println(myCalculator.add(a,b));

    System.out.println(myCalculator.subtract(a,b));

    System.out.println("Your first argument is: " + args[0]);
}
}