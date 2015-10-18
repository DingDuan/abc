import java.util.Scanner;


public class Hanoi {
    public static void main(String[] args){
	      System.out.println("please input the number:");
	      Scanner in =new Scanner(System.in);
	      int n=in.nextInt();
	      System.out.println("The moves are ");
	      move(n,'A','B','C');
}
    public static void move(int n,char a,char b,char c){
    	if(n==1){
    		System.out.println("move disk"+n+" from"+a+"to"+c);
    	}else{
    	move(n-1,a,c,b);
    	System.out.println("move disk"+n+" from"+a+"to"+c);
    	move(n-1,b,a,c);
    	}
    }
}
