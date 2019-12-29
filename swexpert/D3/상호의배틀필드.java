package D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 상호의배틀필드 {
    static int x = 0;
    static int y = 0;
    static StringBuilder sb;
    public static void main(String[] args) throws NumberFormatException, IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            char[][] map = new char[h][w];
 
            for(int i=0; i<h; i++)
                map[i] = br.readLine().toCharArray();
             
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (map[i][j]=='^' || map[i][j]=='v' || map[i][j]=='<'|| map[i][j]=='>') {
                        x = i;
                        y = j;
                        break;
                    }
                }
            }
            
            int comm = Integer.parseInt(br.readLine());
            String command = br.readLine();
         
            for (int i = 0; i < comm; i++) {
                String input = command.split("")[i];
                switch (input) {
                case "U":
                    if (x - 1 >= 0) {
                        if (map[x - 1][y]=='.') {
                            map[x - 1][y] = '^';
                            map[x][y] = '.';
                            x=x-1;
                            break;
                        }
                    }
                    map[x][y] = '^';
                    break;
 
                case "D":
                    if (x + 1 < h) {
                        if (map[x + 1][y]=='.') {
                            map[x + 1][y] = 'v';
                            map[x][y] = '.';
                            x=x+1;
                            break;
                        } 
                    }
                    map[x][y] = 'v';
                    break;
 
                case "L":
                    if (y - 1 >= 0) {
                        if (map[x][y - 1]=='.') {
                            map[x][y - 1] = '<';
                            map[x][y] = '.';
                            y=y-1;
                            break;
                        }
                    }
                    map[x][y] = '<';
                    break;
 
                case "R":
                    if (y + 1 < w) {
                        if (map[x][y + 1]=='.') {
                            map[x][y + 1] = '>';
                            map[x][y] = '.';
                            y=y+1;
                            break;
                        }
                    }
                    map[x][y] = '>';
                    break;
 
                case "S":
                    if (map[x][y]=='<') {
                        for (int k = y - 1; k >= 0; k--) {
                            if (map[x][k]=='*') {
                                map[x][k] = '.';
                                break;
                            } else if (map[x][k]=='#')
                                break;
                        }
                    }
 
                    if (map[x][y]=='>') {
                        for (int k = y + 1; k < w; k++) {
                            if (map[x][k]=='*') {
                                map[x][k] = '.';
                                break;
                            } else if (map[x][k]=='#')
                                break;
                        }
                    }
 
                    else if (map[x][y]=='^') {
                        for (int k = x - 1; k >= 0; k--) {
                            if (map[k][y]=='*') {
                                map[k][y] = '.';
                                break;
                            } else if (map[k][y]=='#')
                                break;
                        }
                    }
 
                    else if (map[x][y]=='v') {
                        for (int k = x + 1; k < h; k++) {
                            if (map[k][y]=='*') {
                                map[k][y] = '.';
                                break;
                            } else if (map[k][y]=='#')
                                break;
                        }
                    }
                    break;
                default:
                    break;
                }
            }
            System.out.print("#"+tc+" ");
            for(int i=0; i<h; i++) {
                for(int j=0; j<w; j++) {
                    System.out.print(map[i][j]);
                }
                System.out.println();
            }
        }
    }
}
