#include<cstdio>
using namespace std;
 
int main(){
    int n;
    scanf("%d",&n); // ������ ����  
    int sum=0; // ���� ������ ���� 
    
    for(int i=0; i<n;i++){
        int x;
        scanf("%1d",&x); // x�� ������ �� �ڸ��� ���� �Է� �޴´�.  
        sum += x;
    }
    printf("%d",sum);
 
    return 0;
}