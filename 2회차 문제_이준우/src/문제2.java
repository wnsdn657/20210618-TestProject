import java.util.Scanner;
public class 문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("돈의 액수를 입력하세요");
		int num=scan.nextInt();
		int a,b,c,d,e,f,g;
		a=num/50000;
			num-=50000*a;
			System.out.println("5만원권:"+a+"매");
		b=num/10000;
			num-=10000*b;
			System.out.println("1만원권:"+b+"매");
		c=num/1000;
			num-=1000*c;
			System.out.println("천원권:"+c+"매");
		d=num/100;
			num-=100*d;
			System.out.println("100원:"+d+"개");
		e=num/50;
			num-=50*e;
			System.out.println("50원:"+e+"개");
		f=num/10;
			num-=10*f;
			System.out.println("10원:"+f+"개");
		g=num/1;
			num-=1*g;
			System.out.println("1원:"+g+"개");
	}			

}
