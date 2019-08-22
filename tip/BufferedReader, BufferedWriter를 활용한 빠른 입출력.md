# BufferedReader, BufferedWriter를 활용한 빠른 입출력
## 원리
* Buffer에 있는 IO 클래스로, 입력된 데이터를 버퍼에 담아 전달하여 입력과 출력을 한다.
* 버퍼를 거쳐 간접적으로 전달함으로써, 시스템의 데이터 처리 효율성을 높일 수 있다.
* 또한, InputStreamReader / OutputStreamWriter 를 같이 사용하면, 입출력 스트림으로부터 미리 버퍼에 데이터를 갖다 놓기 때문에 효율적인 입출력이 가능하다.

## BufferedReader를 통한 입력
    public static void main(String[] args) throws IOException {
		    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
		
		    //String
		    String s = bf.readLine();
		    System.out.println(s);
		
		    //Integer
		    int i = Integer.parseInt(bf.readLine());
		    System.out.println(i);
* 본래 입력에 사용했던 Scanner는 space와 enter 모두 경계로 인식하기 때문에, 입력받은 데이터를 가공하기에 편리했다.
* 하지만, BufferedReader는 Enter만 경계로 인식하며, 데이터는 String으로 고정된다.
* 따라서 작업속도 효율면에서 월등하지만, 형변환 등 데이터를 가공해야 하는 어려움이 생긴다.
* 그리고 꼭 IOException 예외처리를 해줘야 한다.

### 데이터 가공
#### (1) nextToken()
    StringTokenizer st = new StringTokenizer(s); //StringTokenizer인자값에 입력 문자열 넣음
    int a = Integer.parseInt(st.nextToken()); //첫번째 호출
    int b = Integer.parseInt(st.nextToken()); //두번째 호출

    System.out.println(a);
    System.out.println(b);
* 첫번째 방법으로는, StringTokenizer에 nextToken()함수를 사용하는 방법이다.
* 이를 사용하면 readLine()을 통해 입력받은 값을 공백단위로 구분하여 순서대로 호출할 수 있다.


#### (2) split
String array[] = s.split(" ");
System.out.println(Arrays.toString(array));
* 두번째 방법으로는, String에 split()함수를 사용하여 공백 단위로 끊어, 데이터를 배열에 넣는 방법이다.




## BufferedWriter를 통한 출력
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
    String s = bf.readLine();
    bw.write(s+"\n");
    bw.flush();
    bw.close();
* 위에 예제에도 적혀 있듯, 일반적으로 출력을 할 때는 System.out.println("");를 사용한다.
* 적은 양의 출력의 경우 성능차이가 미미할 수 있지만, 많은 양의 출력에서는 Buffer를 사용하는 것이 좋다.

