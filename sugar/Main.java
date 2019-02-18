import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int N =scan.nextInt(); //설탕 KG
        int K5=0; //5kg 포대 
        int K3=0; //3kg 포대
        boolean b =true ;
        
        if(N%5 ==0){
            K5=N/5;
            System.out.println(K5);
        }else{
            
            while(b==true){
                N = N-3;
                K3++;
                if(N%5 ==0){
                    K5=N/5;
                    System.out.println(K3+K5);
                    break;
                }
                if(N<0){
                    System.out.println(-1);
                    break;
                }
            }
           
        }

    }
}