# 조건문과 반복문

## 배운 점

### 1. 향상된 for문

##### 배열이나 ArrayList 등에 접근할 때 향상된 for문을 쓰면 그 크기만큼 반복을 해준다.
```java
int [] array = {1, 2, 3, 4, 5, 6, 7};		

		//일반적인 for문

		for(int i=0; i<array.length; i++){

			System.out.println(array[i]);

		}
		//향상된  for문

		for(int item : array){

			System.out.println(array[item]);

		}
```

### 2. 함수 naming의 중요성
##### 함수 이름에서 코드의 성격을 파악할 수 있음, 따라서 함께 일할 때에는 naming이 상당히 중요하다.

### 3. 굳이 함수를 만드는 이유
##### 아래와 같이print만 해주는 함수를 따로 만든다. 퍼포먼스는 떨어지나 의미적으로 객체지향에 더 나은, 훨씬 보기 좋은 코드, 해석하기가 좋아짐, 나만 코드를 짜는게 아니기 때문이다.
```java
	public void print(int flag, int count){

		System.out.println( flag + "은 " + count + "개");

	}
```
