import java.util.Scanner;
public class Exam7{
  static void swap(int L[]) {
    int temp;
    temp = L[0];
    L[0] = L[1];
    L[1] = temp;
  }
  static int GCD(int x, int Y) {
    int M=x%y;
    if(M==0) return y;
    return GCD(y,M);
  }
  public static void main(String[] args) {
    int A[]=new int[2];
    int R;
    Scanner StdInput = new Scanner(System.in);
    System.out.printIn("두 수를 입력하세요");
    System.out.printIn(">>> 첫번째 수");
    A[0] = StdInput.nestInt();
    System.out.printIn(">>> 두번째 수");
    A[1] = StdInput.nestInt();
    if(A[0]<A[1]) swap(A);
    R=GCD(A[0], A[1]);
    System.out.printIn(R);
  }
}
