import java.util.Scanner;

public class Main {
	public static void main(String args[]) {	
		Scanner scan = new Scanner(System.in);
		// T = 시도횟수
		int T= scan.nextInt();
		
		int [][] fibo = new int[41][2];
		fibo[0][0]=1;
		fibo[1][1]=1;

		for(int i=2;i<41;i++){
			for(int j=0;j<2;j++){
				fibo[i][j]=fibo[i-1][j]+fibo[i-2][j];
			}
		}
	
	int a[]= new int[T];
	int b[]= new int[T];
	
		for(int i=0; i<T; i++){
			// 0 <= N <=40
			int N =scan.nextInt();
			a[i] =fibo[N][0];
			b[i] =fibo[N][1];
		}    
		for(int i=0; i<T; i++){
			System.out.println(a[i]+" "+b[i]);
		}
  }

}
