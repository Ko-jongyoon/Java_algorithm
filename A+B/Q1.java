import java.util.Scanner;

public class Q1{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("���� A�� ���� �Է��ϼ���:(0 < A)");
        int a =scan.nextInt();
        while(a<1){
            System.out.println("A�� 0���� Ů�ϴ�. �ٽ� �Է����ּ���.");
            a =scan.nextInt();
        }
        System.out.println("���� B�� ���� �Է��ϼ���:(0 < B < 10)");
        int b =scan.nextInt();
        while(b<1 || b>9){
            System.out.println("B�� 0���� ũ�� 10���� �۽��ϴ�. �ٽ� �Է����ּ���.");
            b =scan.nextInt();
        }  
        

        int result = a + b;

        System.out.print("A" + "+" + "B"+ "=" + result);
    }
} 