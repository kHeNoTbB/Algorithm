import java.util.Scanner;
 
public class Solution {
 
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        int[] arr = new int[1000];
 
        for (int i = 0; i < T; i++) { //테스트케이스 돌림
            int num = s.nextInt(); 
             
            for (int j = 0; j < 1000; j++) //각 테스트케이스에 0~100 사이의 숫자가 1000개의 배열 공간에 들어감
                arr[j] = s.nextInt();
 
            int[] score = new int[101];
            for (int k = 0; k < 1000; k++) //0~100사이의 숫자 빈도를 0~100인덱스에 넣음
                score[arr[k]]++;
 
            int answer=0;
            int max = 0;
            for (int k = 0; k < 101; k++) { //빈도 가장 큰 값 출력
                if (max <= score[k]) {
                    max = score[k];
                    answer = k; 
                }
                    //max = score[k];
            }
 
            System.out.println("#" + num + " " + answer);
        }
    }
 
}