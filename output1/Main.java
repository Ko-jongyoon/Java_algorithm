import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//hasNextLine()= Scanner ��ü�� ���ǵ� �ϳ��� �޼ҵ� 
		while(sc.hasNextLine()) {    //�����ٿ� �Է��� �ִ��� ���θ� �Ǵ��� boolean �������� ��ȯ �Է��� ������ true �����ٿ� �Է��� ������ ���� ����Ѵ�
 
			String input = sc.nextLine();
			
			if( input.length()<=100 && !(input.isEmpty()) ) {
                input=input.trim();   // trim()�޼ҵ�� ���ڿ� �հ����� ������ �������ִ� �Լ� 
				System.out.println(input);
            }
            else{
                break;
            }
		}
		sc.close();
	}
}


