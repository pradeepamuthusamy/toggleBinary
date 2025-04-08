// given a number ,convert it into binary,toggle all the digits from its most significant digit,return the toggled binary into decimal as output
import java.util.Scanner;

class toggleBinary{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		toggleBinary1(num);
		toggleBinary2(num);
		
		
	}
	public static void toggleBinary1(int num){
		System.out.println("entered");
		int rem=0;
		int res=0;
		int pow=1;
		while(num!=0){
			rem=num%2 == 0?1:0;
			res=rem*pow +res;
			num=num/2;
			pow*=2;
			
		}
		System.out.println(res);
		
	}
	public static void toggleBinary2(int num){
		int pow =1;
		while(num>=pow){
			pow=pow*2;
		}
		int ans=(pow-num-1);
		System.out.println(ans);
		
	}
}


