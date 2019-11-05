# DFS Pattern
## [jungol 1113](http://www.jungol.co.kr/bbs/board.php?bo_table=pbank&wr_id=393&sca=40)
* 방향과 최소시간을 고려해야 하는 경우
      
      static int[] dx = { 0, 0, 1, -1 };
	      static int[] dy = { -1, 1, 0, 0 };
	      static void go(int x, int y, int cnt, int dir) {
		      visited[x][y] = true;
		
		      if(cnt>answer) return; 
		      if(x==endx && y==endy) {
			      //최소값 갱신
			      answer = Math.min(answer, cnt);
			      return;
		      }
		
		      for(int i=0; i<4; i++) {
			      int nx = x + dx[i];
			      int ny = y + dy[i];
			
			      if(nx>=0 && ny>=0 && nx<map.length && ny<map[nx].length && !visited[nx][ny] && map[nx][ny]==1) {
				      if(dir!=i) { //코너링
					      go(nx, ny, cnt+1, i);
				      } else if(dir==-1 || dir==i) {
					      go(nx, ny, cnt, dir);
				      }
				      visited[nx][ny]=false;
			      }
	      	}
	      }
      }
* stackoverflow가 날 때는, visited 체크하는 순서와 블록을 잘 살펴봐야 한다.
