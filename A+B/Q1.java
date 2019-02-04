import java.util.Scanner;

public class Q1{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("정수 A의 값을 입력하세요:(0 < A)");
        int a =scan.nextInt();
        while(a<1){
            System.out.println("A는 0보다 큽니다. 다시 입력해주세요.");
            a =scan.nextInt();
        }
        System.out.println("정수 B의 값을 입력하세요:(0 < B < 10)");
        int b =scan.nextInt();
        while(b<1 || b>9){
            System.out.println("B는 0보다 크고 10보다 작습니다. 다시 입력해주세요.");
            b =scan.nextInt();
        }  
        

        int result = a + b;

        System.out.print("A" + "+" + "B"+ "=" + result);
    }
} 