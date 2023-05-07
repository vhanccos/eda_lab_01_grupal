public class Recursion {
    public static void main(String[] args) {
      int result = sum(5, 10); //sumamos números del 5 al 10
      System.out.println(result);
    }
    public static int sum(int start, int end) {
      if (end > start) {
        return end + sum(start, end - 1); //recursividad
      } else {
        return end;
      }
    }
  }