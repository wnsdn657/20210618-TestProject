import java.util.Scanner;
public class ����2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("���� �׼��� �Է��ϼ���");
		int num=scan.nextInt();
		int a,b,c,d,e,f,g;
		a=num/50000;
			num-=50000*a;
			System.out.println("5������:"+a+"��");
		b=num/10000;
			num-=10000*b;
			System.out.println("1������:"+b+"��");
		c=num/1000;
			num-=1000*c;
			System.out.println("õ����:"+c+"��");
		d=num/100;
			num-=100*d;
			System.out.println("100��:"+d+"��");
		e=num/50;
			num-=50*e;
			System.out.println("50��:"+e+"��");
		f=num/10;
			num-=10*f;
			System.out.println("10��:"+f+"��");
		g=num/1;
			num-=1*g;
			System.out.println("1��:"+g+"��");
	}			

}
