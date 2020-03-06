# Map과 HashMap 기본
## 선언
    Map<String, Integer> hashmap = new HashMap<>();

## 값 넣고 갱신하기
    hashmap.put("key", 1);
    hashmap.put("key2", 2);
    hashmap.put("key3", 3);
		
    //키 값이 중복된 것을 put하면 값이 새로운 값으로 갱신된다.
    hashmap.put("key2", 3);
		
    //기존 값을 연산하고 싶으면 아래와 같이 갱신하면 된다.
    hashmap.put("key2", hashmap.get("key2")+2);

## 출력하기
    //hashmap을 출력해보자
    for(String key : hashmap.keySet()) {
        System.out.println(key + " " + hashmap.get(key));
    }
		
    //key만 출력하기
    for(String key : hashmap.keySet()) {
        System.out.println(key);
    }
		
    //value만 출력하기
    for(int value : hashmap.values()) {
	System.out.println(value);
    }

## key 값이 있는지 검색하기
    //키가 있는지 궁금할 때
    if(hashmap.containsKey("key2")) {
	System.out.println("key2는 있구나!");
    }
