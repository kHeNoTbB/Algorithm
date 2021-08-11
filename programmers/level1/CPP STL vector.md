### CPP STL vector

사실 프로그래머스 문제풀이를 하다보니, CPP가 훨씬 쉽(?)다는 말이 뭔지 알 것도 같았다. 그래서 백준에서는 사용하지 않았던 vector를 여기선 자주 쓰게 될 것 같아서, 정리해본다. 
###### ~~<i>이제 앞으로 cpp를 주력으로 쓰게 될 것 같기도..</i>~~


#### 1. 벡터 선언
    vector<int> name;
    vector<double> name;
    vector<char> name;

#### 2. 벡터의 주요 멤버 함수
    vector<int> example_vactor;
    example_vactor.push_back(10);
    example_vactor.push_back(20);
    example_vactor.push_back(30);
    example_vactor.push_back(40);
    example_vactor.push_back(50);

위 코드를 실행하면

| 10 | 20 | 30 | 40 | 50 |
|:---:|:---:|:---:|:---:|:---:|

위와 같은 구조로 백터에 값이 삽입 될 것이다. 

| 함수 | 설명 | 예시 |
|:---:|---|---|
| begin |첫 번째 원소를 가리키는 반복자 리턴 | vector<int>::iterator begin_iter = begin_iterliexample_vactor.begin(); |
| end |마지막 원소를 가리키는 반복자 리턴 | vector<int>::iterator end_iter = example_vactor.end(); |
| front |첫 번째 원소의 참조를 리턴 | example_vactor.front(); |
| back |마지막 원소의 참조를 리턴 | example_vactor.back(); |
| insert | 임의 위치에 임의 값을 삽입 |  |
| erase | 임의 위치의 원소나 지정 범위의 원소를 삭제 |  |
| push_back | vector 끝에 원소를 추가 | example_vactor.push_back(추가 할 원소); |
| pop_back | vector의 마지막 원소를 제거 | example_vactor.pop_back(); |
| swap | v1과 v2를 swap | v.swap(v2) |
|  |  |  |

우선 begin과 end는 포인터처럼 사용할 수 있다.

    vector<int> example_vactor; //int형 vector를 선언했다. 값은 아직 없다.
    example_vactor.push_back(10);
    example_vactor.push_back(20);
    example_vactor.push_back(30);
    example_vactor.push_back(40);
    example_vactor.push_back(50); //차례대로 10, 20, 30, 40, 50을 vector에 넣었음
    
    vector<int>::iterator iter= example_vactor.begin(); 
    iter += 2;
    cout << *iter << endl;

이런 식으로 활용하면 된다.

    cout << v.front(); //가장 첫 원소인 10이 출력됨
	  cout << v.back();  //가장 끝 원소인 50이 출력됨
    

#### 3. 내가 풀어서 와 닿는 vector 예제
> 수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.

    #include <string>
    #include <vector>

    using namespace std;

    double solution(vector<int> arr) {
        double answer = 0;
        double total=0;
        int size=arr.size();
        for (vector<int>::iterator iter = arr.begin(); iter != arr.end(); iter++)
            total+=*iter;
        answer=total/size;
        return answer;
    }

vector<int>::iterator iter = arr.begin(); iter != arr.end(); iter++
	
이 부분이 학습 최고 활용 부분이 아닐까 싶다ㅋㅋㅋ
 근데.. 사이즈 측정 했으니 겸사겸사 size 활용 가능할거 같다...(?)

    #include <string>
    #include <vector>

    using namespace std;

    double solution(vector<int> arr) {
        double answer = 0;
         double total=0;
        int size=arr.size();
        for (int i=0; i<size; i++) total+=arr[i];
    	    answer=total/size;
        return answer;
    }

---
> 읽어보면 좋은 참고 글 https://blockdmask.tistory.com/70
