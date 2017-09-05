
public class Change {
	
	int[] changeArray = {5000, 1000, 500, 100, 50, 10};
	
	
	//함수는 코드를 실행시킬 수 있는 최소 단위, 이름에서 코드의 성격을 파악할 수 있음, 따라서 naming이 상당히 중요하다.
	public void calc(int pay, int buy){
		
		int remain = pay-buy;
		System.out.println(remain + "원");
		
		
		for(int num : changeArray){
			
			print(num, remain/num);
			remain %= num;
			
		}		
		
	}
	
	//print만 해주는 함수를 따로 만든다. 퍼포먼스는 떨어지나 의미적으로 객체지향에 더 나은, 훨씬 보기 좋은 코드, 해석하기가 좋아짐, 나만 코드를 짜는게 아니므로
	public void print(int flag, int count){
		System.out.println( flag + "은 " + count + "개");
	}

}
