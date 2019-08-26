망할 substring은 end index전까지만 자르기 때문에 end+1......하........-_-

    //사용법
    String.substring(start) //문자열  start위치부터 끝까지 문자열 자르기
    String.substring(start,end) //문자열  start위치 부터 end전까지 문자열 발췌
		

    //예제
    String str = "ABCDEFG"; //대상 문자열
    /*A=0 B=1 C=2 D=3 E=4 F=5 G=6의 index를 가진다.*/
		
    str.substring(3); 
    /*substring(시작위치) 결과값 = DEFG*/

    str.substring(3, 6); 
    /*substring(시작위치,끝위치) 결과값 = DEF*/
