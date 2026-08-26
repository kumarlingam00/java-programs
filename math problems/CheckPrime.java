public class CheckPrime {
  public static void main(String[] args) {
    int num = 11;
    for(int j = 2; j < num;j++){
        if (num %  j == 0) {
            System.out.println("not a prime");
            return;
        }
    }
    System.out.println("prime");
  }
}
