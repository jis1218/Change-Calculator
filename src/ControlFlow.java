
public class ControlFlow {
	
	//���ǹ�
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
			System.out.println("a�� b�� �����ϴ�");
			break;
		case 10:
			System.out.println("a�� ���� 5�Դϴ�.");
			break;
		}
	}
	
	//�ݺ���
	//for, while
	public void checkFor(){
		int [] array = {1, 2, 3, 4, 5, 6, 7};
		
		//�Ϲ����� for��
		for(int i=0; i<array.length; i++){
			System.out.println(array[i]);
		}
		
		//����  for��
		for(int item : array){
			System.out.println(array[item]);
		}
	}
	
	public void checkWhile(){
		int [] array = {1, 2, 3, 4, 5, 6, 7};
		
		int count = 0;
		//�ݺ��� ������ if���̶�� ��������
		
		while(count < array.length){
			System.out.println(array[count]);
			count++;
		}
	}
	
	public void checkDoWhile(){
		int [] array = {1, 2, 3, 4, 5, 6, 7};
		int count = 0;
		
		//while�� ���ǿ� ������� do�� �� ������ ��
		do{
			System.out.println(array[count]);
			count++;
			
		}while(count < array.length);
		
	}

}
