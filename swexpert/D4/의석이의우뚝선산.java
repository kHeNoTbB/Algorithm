package D4;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
 
public class 의석이의우뚝선산 {
    static int T, N;
    static int[] arr;
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        for(int tc = 1; tc <= T; tc++) {
            N = sc.nextInt();
            arr = new int[N];
            boolean up = false;
            boolean down = false;
            int start = 0;
            int ans = 0;
            int hornIdx = 0;
            for(int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            for(int i = 0; i < N - 1; i++) {
                if(!up && arr[i] < arr[i + 1]) {
                    start = i;
                    up = true;
                }
                else if(up && !down && arr[i] > arr[i + 1]) {
                    hornIdx = i;
                    down = true;
                }
                if(up && down) {
                    if(arr[i] < arr[i + 1]) {
                        ans += (hornIdx - start) * (i - hornIdx);
                        start = i;
                        down = false;
                    }
                    else if(i == N - 2 && arr[i] > arr[i + 1]) {
                        ans += (hornIdx - start) * (i+1 - hornIdx);
                    }
                }
            }
            System.out.println("#" + tc + " " + ans);
        }
        sc.close();
    }
}
