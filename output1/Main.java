import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//hasNextLine()= Scanner 객체중 정의된 하나의 메소드 
		while(sc.hasNextLine()) {    //다음줄에 입력이 있는지 여부를 판단해 boolean 형식으로 반환 입력이 있으면 true 다음줄에 입력이 있을때 까지 대기한다
 
			String input = sc.nextLine();
			
			if( input.length()<=100 && !(input.isEmpty()) ) {
                input=input.trim();   // trim()메소드는 문자열 앞과뒤의 공백을 제거해주는 함수 
				System.out.println(input);
            }
            else{
                break;
            }
		}
		sc.close();
	}
}


