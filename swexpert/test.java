import java.util.Scanner;
 
public class Solution {
 
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        int[] arr = new int[1000];
 
        for (int i = 0; i < T; i++) { //�׽�Ʈ���̽� ����
            int num = s.nextInt(); 
             
            for (int j = 0; j < 1000; j++) //�� �׽�Ʈ���̽��� 0~100 ������ ���ڰ� 1000���� �迭 ������ ��
                arr[j] = s.nextInt();
 
            int[] score = new int[101];
            for (int k = 0; k < 1000; k++) //0~100������ ���� �󵵸� 0~100�ε����� ����
                score[arr[k]]++;
 
            int answer=0;
            int max = 0;
            for (int k = 0; k < 101; k++) { //�� ���� ū �� ���
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