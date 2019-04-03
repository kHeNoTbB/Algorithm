#include<cstdio>
using namespace std;
 
int main(){
    int n;
    scanf("%d",&n); // 숫자의 개수  
    int sum=0; // 합을 저장할 변수 
    
    for(int i=0; i<n;i++){
        int x;
        scanf("%1d",&x); // x의 정수를 한 자리씩 각각 입력 받는다.  
        sum += x;
    }
    printf("%d",sum);
 
    return 0;
}