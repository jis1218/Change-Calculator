
public class Change {
	
	int[] changeArray = {5000, 1000, 500, 100, 50, 10};
	
	
	//�Լ��� �ڵ带 �����ų �� �ִ� �ּ� ����, �̸����� �ڵ��� ������ �ľ��� �� ����, ���� naming�� ����� �߿��ϴ�.
	public void calc(int pay, int buy){
		
		int remain = pay-buy;
		System.out.println(remain + "��");
		
		
		for(int num : changeArray){
			
			print(num, remain/num);
			remain %= num;
			
		}		
		
	}
	
	//print�� ���ִ� �Լ��� ���� �����. �����ս��� �������� �ǹ������� ��ü���⿡ �� ����, �ξ� ���� ���� �ڵ�, �ؼ��ϱⰡ ������, ���� �ڵ带 ¥�°� �ƴϹǷ�
	public void print(int flag, int count){
		System.out.println( flag + "�� " + count + "��");
	}

}
