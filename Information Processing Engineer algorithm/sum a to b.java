import java.util.Scanner;
public class Exam2 {
  public static void main(String[] args) {
    int SUM=0, N1, N2, N;
    Scanner StdInput = new Scanner(System.in);
    N1 = StdInput.nextInt();
    N2 = StdInput.nextInt();
    for(N=N1; N<N2; N++) SUM = SUM+N;
    System.out.print(N1+"부터"+N2+"까지의");
    System.out.print("정수의 합은"+SUM+"이다");
  }
}
