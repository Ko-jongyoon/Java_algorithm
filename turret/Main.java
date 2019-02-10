import java.util.Scanner;


public class Main {
	public static void main(String args[]){

	Scanner scan = new Scanner(System.in);
	//x,y는 -10000이상 10000이하의 정수 
	//r1,r2는 10000이하의 자연수
	int T=scan.nextInt();
	int a[] = new int[T];
	for(int i=0; i<T; i++){
		int x1=scan.nextInt();
		int y1=scan.nextInt();
		int r1=scan.nextInt();
		int x2=scan.nextInt();
		int y2=scan.nextInt();
		int r2=scan.nextInt();
		double d= Math.sqrt( Math.pow(x2-x1,2) + Math.pow(y2-y1,2) );
		
		// -1인 경우(무한대)
		if(x1==x2 && y1==y2 && r1==r2){
			a[i]=-1;
			
		}
		// 1인 경우
		else if( d == r1+r2 || d == Math.abs(r1-r2)  ){
			a[i]=1;;
		}
		// 0인 경우
		else if( d > r1+r2 || d< Math.abs(r1-r2) || (x1==x2 && y1==y2 && r1!=r2)  ){
			a[i]=0;
		}
		// 2인 경우
		else if( Math.abs(r1-r2) < d && d <(r1+r2) ){
			a[i]=2;
		} 
	
		}
	for(int i=0 ; i<T; i++){
	System.out.println(a[i]);
	}
}
}