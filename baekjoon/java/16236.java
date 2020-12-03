import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
public class Main {
   static class Pointer implements Comparable<Pointer> {
       int x;
       int y;
       int size;
       Pointer() {
       }
       Pointer(int x, int y, int size) {
           this.x = x;
           this.y = y;
           this.size = size;
       }
       @Override
       public int compareTo(Pointer o) {
           if (this.size == o.size) {
               if (this.x == o.x)
                   return Integer.compare(this.y, o.y);
               return Integer.compare(this.x, o.x);
           }
           return Integer.compare(this.size, o.size);
       }
       @Override
       public String toString() {
           return "Pointer [x=" + x + ", y=" + y + ", size=" + size + "]";
       }
   }
   static int[][] map;
   static int N;
   public static void main(String[] args) throws NumberFormatException, IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       N = Integer.parseInt(br.readLine());
       map = new int[N][N];
       for (int i = 0; i < map.length; i++) {
           StringTokenizer st = new StringTokenizer(br.readLine());
           for (int j = 0; j < map[i].length; j++) {
               map[i][j] = Integer.parseInt(st.nextToken());
           }
       }
       Pointer shark = null;
       loop: for (int i = 0; i < map.length; i++) {
           for (int j = 0; j < map[i].length; j++) {
               if (map[i][j] >= 9) { // 아기상어 위치임
                   shark = new Pointer(i, j, 0);
                   break loop;
               }
           }
       }
       time = 0;
       findFish(shark);
       System.out.println(time);
   }
   static int time;
   static int eat;
   static int sharkSize = 2;
   static int[] dx = { 0, 0, 1, -1 };
   static int[] dy = { 1, -1, 0, 0 };
   static int min;
   static void findFish(Pointer shark) {
       
       Queue<Pointer> queue = new LinkedList<>();
       boolean[][] visited = new boolean[N][N];
       queue.add(shark);
       ArrayList<Pointer> list = new ArrayList<>();
       while (!queue.isEmpty()) {
           
           Pointer tmp = queue.poll();
           visited[tmp.x][tmp.y] = true;
           min = Math.max(min, tmp.size);
           for (int i = 0; i < 4; i++) {
               
               int nx = tmp.x + dx[i];
               int ny = tmp.y + dy[i];
               // 범위 내에 먹을 수 있는 물고기의 좌표와 거리를 list에 넣는다.
               if (nx >= 0 && ny >= 0 && nx < map.length && ny < map[nx].length && !visited[nx][ny]) {
                   
                   visited[nx][ny] = true;
                   if (map[nx][ny] == 0 || map[nx][ny] == sharkSize)
                       queue.add(new Pointer(nx, ny, tmp.size + 1));
                   else if (map[nx][ny] < sharkSize) {
                       list.add(new Pointer(nx, ny, tmp.size + 1));
                   }
               }
           }
       }
       if (list.size() == 0)
           return;
       Collections.sort(list);
       Pointer near = list.get(0);
       time = near.size;
       eat++;
       if (eat == sharkSize) {
           sharkSize++;
           eat = 0;
       }
       
       // 서로 위치 바꾸기
       // 먹을 물고기 위치와 아기상어의 위치( 9 <-> 0 )
       int aaa = map[shark.x][shark.y];
       map[shark.x][shark.y] = 0;
       map[near.x][near.y] = aaa;
       findFish(near);
   }
}
