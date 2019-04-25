import java.util.Scanner;
  
public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int m= 0;
        for(int i=1; i<x; i++){
            if(i ==1 || i==3 || i==5 || i==7 || i==8 || i==10 || i==12 ){
               m=m+31;
            }
            else if(i ==4 || i==6 || i==9 || i==11 ){
              m=m+30;
            }
            else{
              m=m+28;
            }
        }
     int p = (m+y)%7;
        if(p==1){
            System.out.println("MON");
        
        }else if(p==2){
            System.out.println("TUE");
         
        }else if(p==3){
            System.out.println("WED");

        }else if(p==4){
            System.out.println("THU");

        }else if(p==5){
            System.out.println("FRI");
         
        }else if(p==6){
            System.out.println("SAT");

        }else{
            System.out.println("SUN");
          
        }
        














    }
}