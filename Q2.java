public class Q2 {

  public static void main(String [ ] args) {

    System.out.println(harmonic(3,5));
  }

  public static double harmonic(double value1, double value2) {
    double harmonic_mean;
    harmonic_mean = (1/((1/value1 + 1/value2)/2));
    return (harmonic_mean);
  }
}