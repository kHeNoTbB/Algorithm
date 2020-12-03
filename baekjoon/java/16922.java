import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        ham(0, 0, 0);
        System.out.println(set.size());
    }
    static int[] arr = { 1, 5, 10, 50 };
    static int num;
    static HashSet<Integer> set = new HashSet<>();
    static void ham(int c, int sum, int cnt) {
        if (c == num) {
            set.add(sum);
            return;
        }
        for (int j = cnt; j < arr.length; j++) {
            ham(c + 1, sum + arr[j], j);
        }
    }
}
