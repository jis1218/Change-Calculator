
public class Change {
	
	int[] changeArray = {5000, 1000, 500, 100, 50, 10};
	
	
	
	public void calc(int pay, int buy){
		
		int remain = pay-buy;
		System.out.println(remain + "��");
		
		
		for(int num : changeArray){
			
			System.out.println( num + "�� " + remain/num + "��");
			remain %= num;
			
		}		
		
	}

}
