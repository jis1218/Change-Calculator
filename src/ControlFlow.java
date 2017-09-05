
public class ControlFlow {
	
	//조건문
	//if, switch
	
	public void checkIf(){
		int a = 10;
		int b = 5;
		
		if(a > b){
			
		}else if(a < b){
			
		}
		else{
			
		}
	}
	
	public void checkSwitch(){
		int a = 10;
		int b = 5;
		
		switch(a){
		
		case 5:
			System.out.println("a와 b가 같습니다");
			break;
		case 10:
			System.out.println("a의 값이 5입니다.");
			break;
		}
	}
	
	//반복문
	//for, while
	public void checkFor(){
		int [] array = {1, 2, 3, 4, 5, 6, 7};
		
		//일반적인 for문
		for(int i=0; i<array.length; i++){
			System.out.println(array[i]);
		}
		
		//향상된  for문
		for(int item : array){
			System.out.println(array[item]);
		}
	}
	
	public void checkWhile(){
		int [] array = {1, 2, 3, 4, 5, 6, 7};
		
		int count = 0;
		//반복이 가능한 if문이라고 생각하자
		
		while(count < array.length){
			System.out.println(array[count]);
			count++;
		}
	}
	
	public void checkDoWhile(){
		int [] array = {1, 2, 3, 4, 5, 6, 7};
		int count = 0;
		
		//while의 조건에 관계없이 do는 꼭 실행이 됨
		do{
			System.out.println(array[count]);
			count++;
			
		}while(count < array.length);
		
	}

}
