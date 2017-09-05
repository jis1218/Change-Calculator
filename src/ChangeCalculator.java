import java.util.Scanner;

public class ChangeCalculator {
	
	public static void main(String args[]){
		
		ChangeCalculator newClass = new ChangeCalculator(); //class에 있는 모든 함수를 메모리에 올리는 과정
//		newClass.calc(10000, 4560);
		
		Change change = new Change();
		change.calc(10000, 3560);
		
		Change newChange = new NewChange(); //부모타입에 있던 리소스만 나열된다. 상속받은 
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("지불금액 : ");
//		int paidMoney = sc.nextInt();
//		System.out.println("물품금액 : ");
//		int goodPrice = sc.nextInt();
//		
//		calc(paidMoney, goodPrice);
		
				
	}
	
//	public void calc(int money, int price){
//		int remain = money-price;
//		
//		int fiveThousand = remain / 5000;
//		remain = remain % 5000; // remain %= 5000으로 표현할 수 있음
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
//		System.out.println("5000원은 " + fiveThousand + "장");
//		System.out.println("1000원은 " + aThousand + "장");
//		System.out.println("500원은 " + fiveHundred + "개");
//		System.out.println("100원은 " + aHundred + "개");
//		System.out.println("50원은 " + fifty + "개");
//		System.out.println("10원은 " + ten + "개");
//		
//	}

}
