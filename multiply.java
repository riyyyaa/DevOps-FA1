public class Multiply{
     public static void main(String[] args)
     {
      int number=7;
      System.out.println("Multiplication Table of " +number ":");
      for(int i=1;i<=10;i++) {
      int product = number*i;
      System.out.println(number + "*" +i+"=" + product);
      }
    }
}