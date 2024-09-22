public class Q3 {

  public static void main(String [ ] args){
    int number = 5;
    System.out.println("Square: " + square(number));
    System.out.println("Cube: " + cube(number));
  }

  public static int square(int num) {
    return num * num;
  }

  public static int cube(int num) {
    return num * num * num;
  }
}
