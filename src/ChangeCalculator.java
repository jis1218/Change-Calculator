import java.util.Scanner;

public class ChangeCalculator {
	
	public static void main(String args[]){
		
		ChangeCalculator newClass = new ChangeCalculator(); //class�� �ִ� ��� �Լ��� �޸𸮿� �ø��� ����
//		newClass.calc(10000, 4560);
		
		Change change = new Change();
		change.calc(10000, 3560);
		
		Change newChange = new NewChange(); //�θ�Ÿ�Կ� �ִ� ���ҽ��� �����ȴ�. ��ӹ��� 
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("���ұݾ� : ");
//		int paidMoney = sc.nextInt();
//		System.out.println("��ǰ�ݾ� : ");
//		int goodPrice = sc.nextInt();
//		
//		calc(paidMoney, goodPrice);
		
				
	}
	
//	public void calc(int money, int price){
//		int remain = money-price;
//		
//		int fiveThousand = remain / 5000;
//		remain = remain % 5000; // remain %= 5000���� ǥ���� �� ����
//		
//		int aThousand = remain / 1000;
//		remain = remain % 1000;
//		
//		int fiveHundred = remain / 500;
//		remain = remain % 500;
//		
//		int aHundred = remain / 100;
//		remain = remain % 100;
//		
//		int fifty = remain / 50;
//		remain = remain % 50;
//		
//		int ten = remain / 10;
//		
//		System.out.println("5000���� " + fiveThousand + "��");
//		System.out.println("1000���� " + aThousand + "��");
//		System.out.println("500���� " + fiveHundred + "��");
//		System.out.println("100���� " + aHundred + "��");
//		System.out.println("50���� " + fifty + "��");
//		System.out.println("10���� " + ten + "��");
//		
//	}

}
