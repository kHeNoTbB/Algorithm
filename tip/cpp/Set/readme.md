# Set 
1. 숫자든 문자든 중복없음(단, 이미 있는값을 insert 시 런타임 에러 나는 환경이 있으니 find로 확인할 것)
2. 삽입하는 순서에 상관없이 정렬되서 입력 됨(기본 오름차순)
3. 탐색빠름; O(LogN) 보장

# Set의 종류
1. set : o(LogN)
2. unordered_set : o(Log1)로 빠름 / 데이터 유무 탐색에 적합 / 데이터 추가삭제는 재해싱으로 인한 o(N)
3. multi_set : value 값 중복가능
