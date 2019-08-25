# Permutation 순열
* 서로 다른 것들 중 몇 개를 뽑아서 한 줄로 나열하는 것

## 단순하게 순열을 생성하는 방법
    public class loop {
    	public static void main(String[] args) {
	    	for(int i=1; i<=3; i++) {
		    	for(int i2=1; i2<=3; i2++) {
			    	if(i!=i2) {
				    	for(int i3 =1; i3<=3; i3++ ) {
					    	if(i3!=i && i3!=i2)
						    	System.out.println(i + " "+ i2 +" "+ i3);
					    }
			    	}
		    	}
	    	}
    	}
    }
